package com.demo.utils;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.httpclient.ConnectTimeoutException;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpClientUtil {
	static final Logger LOGGER = LoggerFactory.getLogger(HttpClientUtil.class);

	// Single-element enum to implement Singleton.
	  private static enum Singleton {
	    // Just one of me so constructor will be called once.
	    Client;
	    // The thread-safe client.
	    private final CloseableHttpClient threadSafeClient;
	    // The pool monitor.
	    private final IdleConnectionMonitorThread monitor;

	    // The constructor creates it - thus late
	    private Singleton() {


			SSLContext sslCtx = null;
			X509TrustManager trustManager = new X509TrustManager() {
				public X509Certificate[] getAcceptedIssuers() {
					return null;
				}
				public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
				}
				public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
				}
			};
			try {
				sslCtx = SSLContext.getInstance("TLSv1");
			} catch (NoSuchAlgorithmException e) {
				LOGGER.info("HttpClientUtil NoSuchAlgorithmException ="+e.getMessage());
			}
			try {
				sslCtx.init(null, new TrustManager[] { trustManager }, null);
			} catch (KeyManagementException e) {
				LOGGER.info("HttpClientUtil KeyManagementException ="+e.getMessage());
			}
			RegistryBuilder<ConnectionSocketFactory> registryBuilder = RegistryBuilder.<ConnectionSocketFactory> create();
			ConnectionSocketFactory plainSocketFactory = new PlainConnectionSocketFactory();
			LayeredConnectionSocketFactory sslSocketFactory = new SSLConnectionSocketFactory(sslCtx,
					SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
			registryBuilder.register("http", plainSocketFactory);
			registryBuilder.register("https", sslSocketFactory);

			Registry<ConnectionSocketFactory> registry = registryBuilder.build();
	      
	      PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(registry);
	      // Increase max total connection to 200
	      cm.setMaxTotal(200);
	      // Increase default max connection per route to 20
	      cm.setDefaultMaxPerRoute(20);
	      // Build the client.
	      threadSafeClient = HttpClients.custom()
	              .setConnectionManager(cm)
	              .build();
	      // Start up an eviction thread.
	      monitor = new IdleConnectionMonitorThread(cm);
	      // Don't stop quitting.
	      monitor.setDaemon(true);
	      monitor.start();
	    }

	    public CloseableHttpClient get() {
	      return threadSafeClient;
	    }

	  }

	  public static CloseableHttpClient getHttpClient() {
	    // The thread safe client is held by the singleton.
	    return Singleton.Client.get();
	  }

	  // Watches for stale connections and evicts them.
	  private static class IdleConnectionMonitorThread extends Thread {
	    // The manager to watch.
	    private final PoolingHttpClientConnectionManager cm;
	    // Use a BlockingQueue to stop everything.
	    private final BlockingQueue<Stop> stopSignal = new ArrayBlockingQueue<Stop>(1);

	    // Pushed up the queue.
	    private static class Stop {
	      // The return queue.
	      private final BlockingQueue<Stop> stop = new ArrayBlockingQueue<Stop>(1);

	      // Called by the process that is being told to stop.
	      public void stopped() {
	        // Push me back up the queue to indicate we are now stopped.
	        stop.add(this);
	      }

	      // Called by the process requesting the stop.
	      public void waitForStopped() throws InterruptedException {
	        // Wait until the callee acknowledges that it has stopped.
	        stop.take();
	      }

	    }

	    IdleConnectionMonitorThread(PoolingHttpClientConnectionManager cm) {
	      super();
	      this.cm = cm;
	    }

	    @Override
	    public void run() {
	      try {
	        // Holds the stop request that stopped the process.
	        Stop stopRequest;
	        // Every 5 seconds.
	        while ((stopRequest = stopSignal.poll(5, TimeUnit.SECONDS)) == null) {
	          // Close expired connections
	          cm.closeExpiredConnections();
	          // Optionally, close connections that have been idle too long.
	          cm.closeIdleConnections(60, TimeUnit.SECONDS);
	          // Look at pool stats.
	          //log.info("Stats: {}"+cm.getTotalStats());
	        }
	        // Acknowledge the stop request.
	        stopRequest.stopped();
	      } catch (InterruptedException ex) {
	    	  LOGGER.error("Stats: {}"+ex.getMessage());
	        // terminate
	      }
	    }

	    public void shutdown() throws InterruptedException {
	    	LOGGER.info("Shutting down client pool");
	      // Signal the stop to the thread.
	      Stop stop = new Stop();
	      stopSignal.add(stop);
	      // Wait for the stop to complete.
	      stop.waitForStopped();
	      // Close the pool - Added
	      try {
			Singleton.Client.threadSafeClient.close();
		} catch (IOException e) {
			LOGGER.error("Client pool shut down IOException:" + e.getMessage());
		}
	      // Close the connection manager.
	      cm.close();
	      LOGGER.info("Client pool shut down");
	    }

	  }

	  public static void shutdown() throws InterruptedException {
	    // Shutdown the monitor.
	    Singleton.Client.monitor.shutdown();
	  }
	
	/**
     * HTTP GET请求
     * 
     * @param url
     * @param params
     * @param encoding
     * @return
     */
    public static String doGet(String url, String value) {
    	String encoding="utf-8";
    	CloseableHttpClient httpClient = HttpClientUtil.getHttpClient();
        String body = null;
        HttpEntity entity = null;
        try {
        	URL strUrl = new URL(url);
        	URI uri = new URI(strUrl.getProtocol(), strUrl.getHost(), strUrl.getPath(), strUrl.getQuery(), null);
            HttpGet httpget = new HttpGet(uri);
            httpget.setHeader("Content-Type","application/json;charset=utf-8");
            /*
             * 设置参数
             */
            httpget.setURI(new URI(httpget.getURI().toString() + "?" + value));
            /*
             * 发送请求
             */
            org.apache.http.HttpResponse httpresponse = httpClient.execute(httpget);
            /*
             * 获取返回数据
             */
            entity = httpresponse.getEntity();
            body = EntityUtils.toString(entity, encoding);
       
        } catch (Exception e) {
        	LOGGER.error("doGet 异常 " , e);
        } 
        return body;
    }
    
    public static String doPost(String url, String json) {
    	 String body = null;
         HttpEntity entity1 = null;
         CloseableHttpClient httpClient = HttpClientUtil.getHttpClient();
         CloseableHttpResponse httpresponse = null;
		try{
			HttpPost post = new HttpPost(url);
			StringEntity entity = new StringEntity(json, "UTF-8");
			post.setEntity(entity);
			post.setHeader("Content-Type", "application/json;charset=utf-8");
			LOGGER.info("post:" + post);

			httpresponse = httpClient.execute(post);
	        entity1 = httpresponse.getEntity();
	        body = EntityUtils.toString(entity1, "UTF-8");
	        
	        LOGGER.info("RESPOSEN MSG IS " + body);
		}catch (Exception ex) {
			LOGGER.error("doPost 异常 " , ex);
			return "exception";
		 } finally {
            try {
                EntityUtils.consume(entity1);
                if (null != httpresponse) {
                	httpresponse.close();
                }
            } catch (IOException e) {
            	LOGGER.error("IOException 异常 " , e);
            }
    	}
		return body;
	}
    public static String doPostTimeOut(String url, String json) {
    	String body = null;
    	HttpEntity entity1 = null;
    	CloseableHttpClient httpClient = HttpClientUtil.getHttpClient();
    	//设置超时时间
    	RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(5000) //与服务器连接超时时间：httpclient会创建一个异步线程用以创建socket连接，此处设置该socket的连接超时时间 
                .setConnectionRequestTimeout(10000) //从连接池中获取连接的超时时间  
                .setSocketTimeout(5000).build(); //socket读数据超时时间：从服务器获取响应数据的超时时间
    	try{
    		HttpPost post = new HttpPost(url);
    		StringEntity entity = new StringEntity(json, "UTF-8");
    		post.setEntity(entity);
    		post.setHeader("Content-Type", "application/json;charset=utf-8");
    		post.setConfig(requestConfig);
    		LOGGER.info("post:" + post);
    		org.apache.http.HttpResponse httpresponse = httpClient.execute(post);
    		
    		entity1 = httpresponse.getEntity();
    		body = EntityUtils.toString(entity1, "UTF-8");
    		LOGGER.info("RESPOSEN MSG IS " + body);
    	}catch(ConnectTimeoutException e){  
            // 捕获超时异常 并反馈给调用者  
    		LOGGER.error("ConnectTimeoutException 异常 " , e); 
            return "connection time out";  
    	}catch (Exception ex) {
    		LOGGER.error("doPost 异常 " , ex);
    		return "exception";
    	}finally {
    		try {
    			EntityUtils.consume(entity1);
    		} catch (IOException e) {
    			LOGGER.error("IOException 异常 " , e);
    		}
    		httpClient.getConnectionManager().shutdown();
    	}
    	return body;
    }
}

package configurations;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import Methods.REST_requests;

public class Navigation {
	
	/**
	 * Ping HTTP URL. This effectively sends a HEAD request and returns <code>true</code> if the response code is in 
	 * the 200-399 range.
	 * @param url The HTTP URL to be pinged.
	 * @param timeout The timeout in seconds for both the connection timeout and the response read timeout. Note that
	 * the total timeout is effectively two times the given timeout.
	 * @return true if the given HTTP URL has returned response code 200-399 on a HEAD request within the
	 * given timeout, otherwise - false.
	 */
	public static boolean pingURL(String url, int timeout) {
	    url = url.replaceFirst("^https", "http"); // Otherwise an exception may be thrown on invalid SSL certificates.

	    try {
	        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
	        connection.setConnectTimeout(timeout);
	        connection.setReadTimeout(timeout*1000);
	        connection.setRequestMethod("HEAD");
	        int responseCode = connection.getResponseCode();
	        return (200 <= responseCode && responseCode <= 399);
	    } catch (IOException exception) {
	        return false;
	    }
	}
	
	/**
	 * Ping MongoDB. This effectively sends a database request and returns database's collection.
	 * @return true if the database has returned response in the given timeout, 
	 * otherwise - false.
	 */
	public static boolean pingDB() {
	    try {
	    	String response = Database.conn.getDatabase("api-test").toString();
	        return (response != null);
	    } catch (Exception exception) {
	        return false;
	    }
	}
	
	/**
	 * Pool and send requests. <b>pool_size</b> copies of selected request <b>method</b> will be sent. 
	 * @param uri Request will be sent here
	 * @param pool_size Number of requests to be made
	 * @param method Choose request method: GET, POST, HEAD, OPTIONS, PUT, DELETE, TRACE
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public static void bulkRequests(String uri, int pool_size, String method) throws InterruptedException, IOException {
		URL api = new URL(uri);
	    int INITIAL_POOL_SIZE = pool_size;
		List<HttpURLConnection> pool = new ArrayList<>(INITIAL_POOL_SIZE);
		URLConnection apic = api.openConnection();
		HttpURLConnection httpc = (HttpURLConnection) apic;
		httpc.setRequestMethod(method);
		
		for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            pool.add(httpc);
        }
		
		Thread[] threads = new Thread[pool_size];
		for (int i = 0; i < threads.length; i++) {
		    try {
				threads[i] = new Thread((Runnable) pool.get(i).getContent());
			} catch (IOException e) {
				e.printStackTrace();
			}
		    threads[i].start();
		}
		
		for (int i = 0; i < threads.length; i++) {
		    threads[i].join();
		}
	}
	
	// *********INSTANCES*********
	protected Database Database() { 
		Database DB = new Database(Database.conn);
		return DB;
	}
	
	protected REST_requests REST_requests() { 
		REST_requests REST_requests = new REST_requests();
		return REST_requests;
	}
}

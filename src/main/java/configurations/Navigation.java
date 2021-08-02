package configurations;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import com.mongodb.MongoClient;

public class Navigation {
	public static MongoClient conn;
	
	// Constructor	
	public Navigation(MongoClient conn) {
		Navigation.conn = conn;
	}
	
	/**
	 * Ping HTTP URL. This effectively sends a HEAD request and returns <code>true</code> if the response code is in 
	 * the 200-399 range.
	 * @param url The HTTP URL to be pinged.
	 * @param timeout The timeout in millis for both the connection timeout and the response read timeout. Note that
	 * the total timeout is effectively two times the given timeout.
	 * @return true if the given HTTP URL has returned response code 200-399 on a HEAD request within the
	 * given timeout, otherwise - false.
	 */
	public static boolean pingURL(String url, int timeout) {
	    url = url.replaceFirst("^https", "http"); // Otherwise an exception may be thrown on invalid SSL certificates.

	    try {
	        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
	        connection.setConnectTimeout(timeout);
	        connection.setReadTimeout(timeout);
	        connection.setRequestMethod("HEAD");
	        int responseCode = connection.getResponseCode();
	        return (200 <= responseCode && responseCode <= 399);
	    } catch (IOException exception) {
	        return false;
	    }
	}
	
	/**
	 * Ping MongoDB. This effectively sends a database request and returns database's collection.
	 * @param timeout The timeout in millis for both the connection timeout and the response read timeout. Note that
	 * the total timeout is effectively two times the given timeout.
	 * @return true if the database has returned response in the given timeout, 
	 * otherwise - false.
	 */
	public static boolean pingDB(int timeout) {
	    try {
	    	String response = conn.getDatabase("api-test").toString();
	        return (response != null);
	    } catch (Exception exception) {
	        return false;
	    }
	}
	
}

package Methods;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class REST_requests {

	public HttpResponse<String> GET(String uri, Duration timeout) throws IOException, InterruptedException {
			
	        HttpClient client = HttpClient.newHttpClient();
	        HttpRequest request = HttpRequest.newBuilder()
	                .uri(URI.create(uri)).timeout(timeout)
	                .build();

	        HttpResponse<String> response = client.send(request,
	                HttpResponse.BodyHandlers.ofString());

	      	//JSONObject obj = new JSONObject(response.body()); //searching for alternative
	      	return response;
    }
	
	public HttpResponse<String> POST(String uri, String name, String email, String gender, String status, Duration timeout) throws IOException, InterruptedException {

		Map<String, String> map = new HashMap<>();
		map.put("name", name);
		map.put("email", email);
		map.put("gender", gender);
		map.put("status", status);
		JSONObject requestMap = new JSONObject(map);
        String requestBody = requestMap.toString();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri)).timeout(timeout)
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

      	//JSONObject obj = new JSONObject(response.body()); //searching for alternative
      	return response;
    }
	
	public JSONObject HEAD(String uri) throws IOException, InterruptedException {
		
		URL api = new URL(uri);
		URLConnection apic = api.openConnection();
		HttpURLConnection httpc = (HttpURLConnection) apic;
		httpc.setRequestMethod("HEAD");
        
      	JSONObject obj = new JSONObject(httpc.getContent());
      	return obj;
	}
}

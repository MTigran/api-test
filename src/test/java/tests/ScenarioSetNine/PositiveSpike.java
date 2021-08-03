package tests.ScenarioSetNine;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.time.Duration;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import Methods.REST_requests;
import configurations.Database;
import configurations.Navigation;
import utils.ExtentReports.ExtentTestManager;

public class PositiveSpike extends Navigation{

	@Parameters({"method"})
	@Test
	public void SpikeTest(String method) throws IOException, InterruptedException {
		// ExtentReports Description
		ExtentTestManager.startTest("Spike Test: HEAD Requests", "Send 50 HEAD requests. "
										+ "Send 1 GET request imidiately after and check the response");
		ExtentTestManager.getTest().assignCategory("Performance Tests", "Positive Tests");
		// *************INSTANTIATIONS*************
		@SuppressWarnings("unused")
		Database DB = Database(); //will not be used yet as the database is not ready yet
		REST_requests REST = REST_requests();
		SoftAssert softAssert = new SoftAssert();
		// *************METHODS********************
		HttpResponse<String> response;
		String uri = "https://gorest.co.in/public/v1/users/54"; //will be accessed through database later
		ExtentTestManager.getTest().log(Status.INFO, "Checking Connections");
		if (pingURL(uri, 2) != true) {
			ExtentTestManager.getTest().log(Status.FAIL, "API is unreachable.");
			ExtentTestManager.endTest();
		}/*Database not implemented yet
		 * else if(pingDB() != true) {
			ExtentTestManager.getTest().log(Status.FAIL, "Database is unreachable.");
		}*/else {
			ExtentTestManager.getTest().log(Status.PASS, "Connections are OK");
		}
		ExtentTestManager.getTest().log(Status.INFO, "Sending HEAD requests to the target");
		bulkRequests(uri, 50, method);
		ExtentTestManager.getTest().log(Status.INFO, "Sending GET request to the target");
		response = REST.GET(uri, Duration.ofSeconds(1));
		if(response.statusCode() < 200 || response.statusCode() >= 300) {
			ExtentTestManager.getTest().log(Status.FAIL, "Response came back with unexpected status code.");
			/*TODO
			Send the response to Database*/
			ExtentTestManager.endTest();
		}else {
			ExtentTestManager.getTest().log(Status.PASS, "Response came back with expected status code.");
		}
		// *************ASSERTIONS**************
		ExtentTestManager.getTest().log(Status.INFO, "Assertion of the actual response with expected response.");
		softAssert.assertEquals(response.body(), "DB.user54"); //Database not implemented and message body is something like this
		/* { "meta": null, "data": { "id": 54, "name": "Bhagavaan Dhawan", 
		 * "email": "dhawan_bhagavaan@miller-doyle.name", "gender": "female", 
		 * "status": "active" }}
		 * */
		softAssert.assertAll();
		ExtentTestManager.getTest().log(Status.PASS, "Assertion complete.");
		ExtentTestManager.endTest();
	}	
}

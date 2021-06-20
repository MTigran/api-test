package utils.ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentKlovReporter;

//OB: ExtentReports extent instance created here. That instance can be reachable by getReporter() method.

public class ExtentManager {

    private static ExtentReports extent;

    public synchronized static ExtentReports getReporter(){
        if(extent == null){
            //Set HTML reporting file location
        	ExtentKlovReporter klov = new ExtentKlovReporter("API Test Framework");
        	klov
        	  .initKlovServerConnection("127.0.0.1:899")
        	  .initMongoDbConnection("127.0.0.1", 27017);
        	ExtentReports extent = new ExtentReports();
        	extent.attachReporter(klov);
        }
        return extent;
    }
}

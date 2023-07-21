package Report;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentReportManager implements ITestListener {
	public ExtentSparkReporter sparkReporter; //UI of report
	public ExtentReports extent;   //Populate common info on the report
	public ExtentTest test;    // creating test case entries in the report and update status of test methods

	String repName;

	public void onStart(ITestContext testContext) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
		repName = "Test-Report-" + timeStamp + ".html"; //creating the file name

		sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName);// specify location of the report
		//UI of report
		sparkReporter.config().setDocumentTitle("Cognizant Automation Report"); // Title of report
		sparkReporter.config().setReportName("Featured News Testing"); // name of the report
//		sparkReporter.config().setTheme(Theme.STANDARD);
		sparkReporter.config().setTheme(Theme.DARK);


		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Application", "Cognizant");
		extent.setSystemInfo("Module", "Associate Profile");
		extent.setSystemInfo("Sub Module", "Featured News");
		extent.setSystemInfo("Operating System", System.getProperty("os.name"));
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		extent.setSystemInfo("Environemnt", "QA");
	}

	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName()); //creating a new entry in report
		test.log(Status.PASS, "Test Passed");       // update  status pass/fail/skiped
	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test Failed");
		test.log(Status.FAIL, result.getThrowable().getMessage());//It will fetch the error message from console

		
	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test Skipped");
		test.log(Status.SKIP, result.getThrowable().getMessage());
	}

	public void onFinish(ITestContext testContext) {
		extent.flush();

	}



}




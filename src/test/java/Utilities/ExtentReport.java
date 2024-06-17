package Utilities;

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

import TestBase.BaseClass;

public class ExtentReport extends BaseClass implements ITestListener {
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	String reportName;

	public void onStart(ITestContext testContext) { // class
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp through class
		reportName = "Test-Report-" + timeStamp + ".html";

		sparkReporter = new ExtentSparkReporter(".\\Reports\\" + reportName);// location
		sparkReporter.config().setDocumentTitle("saucedemo.com Extent Report");
		sparkReporter.config().setReportName("saurcedemo.com Report");
		sparkReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Application", "saucedemo.com");
		extent.setSystemInfo("Module", "Admin");
		extent.setSystemInfo("Sub Module", "Customers");
		extent.setSystemInfo("User Name", "Admin");
		extent.setSystemInfo("Environemnt", "QA");
		String os = testContext.getCurrentXmlTest().getParameter("os");
		extent.setSystemInfo("Operating System", os);
		String browser = testContext.getCurrentXmlTest().getParameter("browser");
		extent.setSystemInfo("Browser", browser);
		extent.setSystemInfo("Tester Name", "Rushikesh Mohalkar");

	}

	public void onTestSuccess(ITestResult result) { // interface
		test = extent.createTest(result.getTestClass().getName());
		test.log(Status.PASS, result.getName() + " got successfully executed");
		String imgPath = ScreenShot.TakeScreenShot(driver, result.getName());
		test.addScreenCaptureFromPath(imgPath);

	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName());
		test.log(Status.FAIL, result.getName() + " got failed");
		test.log(Status.INFO, result.getThrowable().getMessage());
		String imgPath = ScreenShot.TakeScreenShot(driver, result.getName());
		test.addScreenCaptureFromPath(imgPath);
	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName());
		test.log(Status.SKIP, result.getName() + " got skipped");
		test.log(Status.INFO, result.getThrowable().getMessage());
		String imgPath = ScreenShot.TakeScreenShot(driver, result.getName());
		test.addScreenCaptureFromPath(imgPath);
	}

	public void onFinish(ITestContext testContext) {
		extent.flush();
	}
}
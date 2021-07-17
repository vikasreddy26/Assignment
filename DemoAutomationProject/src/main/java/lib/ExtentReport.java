package lib;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	public ExtentReport() {
		
	}

	public void setExtent() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "\\target\\Reports\\report.html");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Functional Testing");
		htmlReporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host name", "localhost");
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("user", "vikas reddy");
	}

	public void createTest(String testName) {
		test = extent.createTest(testName);

	}

	public void logbrokenLinks(String pagename) {
		WebDriverHelper helper = new WebDriverHelper();
		if (helper.findBrokenLinks().size() > 0) {
			for (String url : helper.findBrokenLinks()) {
				logFailStatus(url + "  :: is a broken link from  "+  pagename);
			}
		}
	}

	public void createNode(String nodeName) {
		test.createNode(nodeName);
	
	}

	public void logFailStatus(String message) {
		test.log(Status.INFO, message);
	
	}

	public void logPassStatus(String message) {
		test.log(Status.PASS, message);
	}

	public void attachScreenshotToReport(String name)  {
		WebDriverHelper helper = new WebDriverHelper();
		String path = helper.takeScreenShot(name);
		try {
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void endReport() {
		extent.flush();
	}

}

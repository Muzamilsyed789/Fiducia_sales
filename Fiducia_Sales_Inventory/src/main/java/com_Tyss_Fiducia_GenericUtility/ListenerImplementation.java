package com_Tyss_Fiducia_GenericUtility;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class ListenerImplementation implements ITestListener {
ExtentReports report;
ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test=report.createTest(MethodName);
		Reporter.log("Execution starts form here",true);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.PASS,MethodName );
		Reporter.log(MethodName+"----->Executed successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		try {
		 WebDriverUtility.getscreenShot(BaseClass.driver1, MethodName);
			test.log(Status.SKIP,MethodName+"----->skipped");
			test.log(Status.SKIP, result.getThrowable());
			Reporter.log(MethodName+"----->skipped");
		}
			catch(Throwable e){
				e.printStackTrace();
			}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.SKIP,MethodName+"----->skipped");
		test.log(Status.SKIP, result.getThrowable());
		Reporter.log(MethodName+"----->skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter htmlreport=new ExtentSparkReporter("./ExtentReport/Report.html");
		htmlreport.config().setDocumentTitle("FIDUCIA");
		htmlreport.config().setReportName("AN3-60");
		htmlreport.config().setTheme(Theme.DARK);
		report = new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("Base-platform", "windows");
		report.setSystemInfo("Base-browser", "chrome");
		report.setSystemInfo("Base-Url","gygghjj.com" );
		report.setSystemInfo("Reporter Name","SYED");
	}

	@Override
	public void onFinish(ITestContext context) {
	report.flush();	
	}

}

package utility;

import java.io.FileInputStream;
import java.util.Properties;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Report 
{
	
	public static ExtentReports report = null;
	public static ExtentTest test = null;
	
	
	
	public static void generateReport(String reportname) throws Exception
	{
		report = new ExtentReports( System.getProperty("user.dir")+"//src//test//java//reports//"+reportname+".html");
	    test =	report.startTest(reportname);
	}
	
	public static void closeReport() throws Exception
	{
		report.endTest(test);
		report.flush();
	}

}

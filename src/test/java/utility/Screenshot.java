package utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



import core.Page;

public class Screenshot extends Page
{
	public static void takeScreenShot(String scrname) throws Exception
	{
	    TakesScreenshot ts = (TakesScreenshot)driver;	
	   File f =  ts.getScreenshotAs(OutputType.FILE); // stores in tmp location
	   String scrpath = System.getProperty("user.dir")+"//src//test//java//screenshot//"+scrname+".jpg";
	   FileUtils.copyFile(f, new File(scrpath));
	   
	}
} 

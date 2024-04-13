package core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

public class Page 
{
    public static WebDriver driver = null;
    
    public void openBrowser(String browser,String url)
	{
				
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
			driver.navigate().to(url);
			  
						  
			PageFactory.initElements(driver, this);
			  // implicit wait..
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.manage().window().maximize(); 
	}
	
	public void closeBrowser()
	{
		driver.close();
		driver.quit();
	}
 
}

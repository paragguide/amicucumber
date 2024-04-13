package testcases;

import java.util.Iterator;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Report;
import utility.Screenshot;

public class Search extends Hook
{
	public boolean flag = false;
	
	@Given("i connect {string} and enter url {string}")
	public void i_connect_and_enter_url(String browser, String url) throws Exception 
	{
		//Report.generateReport("ProductSearch");
	   // openBrowser(browser,url);
	    
	  //  Report.test.log(LogStatus.PASS, "browser open");
		
		if(PasswordTest.login == true)
		{
			flag = true;
		}
	}
	@When("^i search for product (.*) with range (.*)")
	public void i_search_for_product_with_range(String product , int price) throws Exception 
	{
		    if(flag == true)
		    {
		    	searchbox.clear();
	    searchbox.sendKeys(product+" in range "+price);
	    
	    Report.test.log(LogStatus.PASS, "searching for "+product);
	    Actions a = new Actions(driver);
	    a.sendKeys(Keys.ENTER).perform();
	    
	    Screenshot.takeScreenShot(product);
		    }
	}
	@Then("results must come")
	public void results_must_come() throws Exception 
	{
	   Iterator <WebElement> it =  products.iterator();
	     while(it.hasNext())
	     {
	    	 WebElement e = it.next();
	    	 Report.test.log(LogStatus.INFO, e.getText());
	    	 
	    	 System.out.println(e.getText());
	     }
	     
	     Report.closeReport();
	}



}

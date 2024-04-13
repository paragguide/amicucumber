package testcases;

import com.relevantcodes.extentreports.LogStatus;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Report;
import utility.Screenshot;

public class UseridTest extends Hook
{
	public static boolean uid = false;
	
	@Given("I open browser {string} with url {string}")
	public void i_open_browser_with_url(String browser, String url) throws Exception 
	{
		Report.generateReport("LoginReport");
	    openBrowser(browser,url);
	    
	    Report.test.log(LogStatus.PASS, "browser "+browser+" url "+url+" opens");
	}
	@Given("i click signin button")
	public void i_click_signin_button() 
	{
	    signin.click();
	    
	    Report.test.log(LogStatus.PASS, "clicked signin");
	}
	@When("I enter userid {string}")
	public void i_enter_userid(String email) 
	{
	    userid.sendKeys(email);
	    
	    Report.test.log(LogStatus.PASS, email+" entered");
	}
	@When("click continue button")
	public void click_continue_button() 
	{
	    ctnbtn.click();
	    Report.test.log(LogStatus.PASS, "continue");
	}
	@Then("I validate the userid")
	public void i_validate_the_userid() throws Exception 
	{
	    try {
	    	Report.test.log(LogStatus.ERROR, err1.getText());
	       }
	    catch(Exception e)
	    {
	    	Report.test.log(LogStatus.PASS, "userid is valid");
	    	Screenshot.takeScreenShot("uidvalid");
	    	uid = true;
	    }
	       //Report.closeReport();
	}

}

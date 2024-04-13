package testcases;

import org.junit.Assert;

import com.relevantcodes.extentreports.LogStatus;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Report;
import utility.Screenshot;

public class PasswordTest 
{
	public boolean flag = false;
	public static boolean login = false;
	
	@Given("userid is valid")
	public void userid_is_valid() 
	{
	    if(UseridTest.uid == true)
	    {
	    	flag = true;
	    }
	}
	@When("i enter password {string}")
	public void i_enter_password(String pwd) 
	{
	     if(flag == true)
	     {
	    	 Hook.password.sendKeys(pwd);
	    	 Report.test.log(LogStatus.PASS, pwd+" entyered");
	     }
	     else
	     {
	    	 Assert.fail("userid is not valid");
	     }
	}
	@When("click submit button")
	public void click_submit_button() 
	{
	    Hook.submit.click();
	    
	    Report.test.log(LogStatus.PASS, "form submited ");
	}
	@Then("i should login")
	public void i_should_login() throws Exception 
	{
	    try {
	   Report.test.log(LogStatus.ERROR, Hook.err2.getText());
	    }
	    catch(Exception e)
	    {
	    	// loged in
	    	Report.test.log(LogStatus.PASS, "logged in");
	    	Screenshot.takeScreenShot("passwordValid");
	    	
	    	login = true;
	    }
	//    Report.closeReport();
	}

}

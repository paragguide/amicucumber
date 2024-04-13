package core;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hook extends Page
{
    public void openBrowser(String browser,String url)
    {
    	super.openBrowser(browser, url);
    }
    
    // mapping of login xpath
    
    @FindBy(xpath = externalxpath.ProjectXpath.signin)
    public static WebElement signin;
    
    @FindBy(xpath = externalxpath.ProjectXpath.userid)
    public static WebElement userid;
    
    @FindBy(xpath = externalxpath.ProjectXpath.ctnbtn)
    public static WebElement ctnbtn;
    
    @FindBy(xpath = externalxpath.ProjectXpath.err1)
    public static WebElement err1;
    
    @FindBy(xpath = externalxpath.ProjectXpath.password)
    public static WebElement password;
    
    @FindBy(xpath = externalxpath.ProjectXpath.submit)
    public static WebElement submit;
    
    @FindBy(xpath = externalxpath.ProjectXpath.err2)
    public static WebElement err2;
    
    // search
    @FindBy(xpath = externalxpath.ProjectXpath.searchbox)
    public static WebElement searchbox;
    
    @FindBy(xpath = externalxpath.ProjectXpath.products)
    public static List <WebElement> products;
}

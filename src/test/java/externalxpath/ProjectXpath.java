package externalxpath;

public class ProjectXpath 
{
   // login test
	public static final String signin = "//*[text() = 'Hello, sign in']";
    public static final String userid = "//*[@id=\"ap_email\"]";
    public static final String ctnbtn = "//*[@id=\"continue\"]";
    public static final String err1 = "//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span";
    public static final String password = "//*[@id=\"ap_password\"]";
    public static final String submit = "//*[@id=\"signInSubmit\"]";
    public static final String err2 = "//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span";

   // search test
    public static final String searchbox = "//*[@id=\"twotabsearchtextbox\"]";
    public static final String products = "//*[@class = 'a-size-base-plus a-color-base a-text-normal']";


}

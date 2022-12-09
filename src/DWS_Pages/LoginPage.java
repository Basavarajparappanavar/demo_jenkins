package DWS_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@class=\"email\"]")
	WebElement emailFeild;
	
	@FindBy(xpath="//input[@class=\"password\"]")
	WebElement passwordFeild;
	
	@FindBy(xpath="(//input[@type=\"submit\"])[2]")
	WebElement loginButton;
	
	@FindBy(xpath="(//a[@href=\"/customer/info\"])[1]")
	public WebElement customerInfo;
	
	@FindBy(xpath="//a[@class=\"ico-logout\"]")
	public WebElement logoutLink;
	
	public void send_username(String value)
	{
		emailFeild.sendKeys(value);
	}
	
	public void send_password(String value)
	{
		passwordFeild.sendKeys(value);
	}
	
	public void clicl_login_button()
	{
		loginButton.click();
	}
	
	

	

}

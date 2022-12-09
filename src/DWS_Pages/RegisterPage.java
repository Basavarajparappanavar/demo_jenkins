package DWS_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="gender-male")
	public WebElement maleRadioBtn;
	
	@FindBy(id="gender-female")
	public WebElement femaleRadioBtn;
	
	@FindBy(id="FirstName")
	public WebElement firstNameFeild;
	
	@FindBy(id="LastName")
	public WebElement lasttNameFeild;
	
	@FindBy(id="Email")
	public WebElement emailFeild;
	
	@FindBy(id="Password")
	public WebElement passwordFeild;
	
	@FindBy(id="ConfirmPassword")
	public WebElement confirmPasswordFeild;
	
	@FindBy(id="register-button")
	public WebElement registerBtn;
	
	
	

}

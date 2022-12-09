package DWS_TestCases;

import org.testng.annotations.Test;

import com.selenium.framework.BaseTest;

import DWS_Pages.BasePage;
import DWS_Pages.RegisterPage;

public class TC002Register extends BaseTest{

	@Test
	public void register(String gender, String firstName,String lastName, String email,String password,
			String confirmPassword) {
		BasePage basepage = new BasePage(driver);
		basepage.registerLink.click();
		
		RegisterPage registerpage= new RegisterPage(driver);
		if(gender.equalsIgnoreCase("male")) {
			registerpage.maleRadioBtn.click();
			
		}
		else {
			registerpage.femaleRadioBtn.click();
		}
		enterText(registerpage.firstNameFeild, firstName);
		enterText(registerpage.lasttNameFeild, lastName);
		enterText(registerpage.emailFeild, email);
		enterText(registerpage.passwordFeild, password);
		enterText(registerpage.confirmPasswordFeild, confirmPassword);
		clickElement(registerpage.registerBtn);
			
	}

}

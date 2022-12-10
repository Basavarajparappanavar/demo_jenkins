package DWS_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.framework.BaseTest;
import com.selenium.framework.ExcelLib;

import DWS_Pages.BasePage;
import DWS_Pages.LoginPage;
import DWS_Pages.RegisterPage;
import jxl.read.biff.BiffException;

public class TC002Register extends BaseTest{
	
	@DataProvider(name = "data")
	public Object[][] data() throws BiffException, IOException{
		ExcelLib excel = new ExcelLib("DWS", this.getClass().getSimpleName());
		return excel.getTestdata();
	}
	
	
	

	@Test(dataProvider = "data")
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
		clickElement(registerpage.continueBtn);
		
		LoginPage loginpage = new LoginPage(driver);
		Assert.assertEquals(loginpage.customerInfo.getText()  , email);
			
	}

}

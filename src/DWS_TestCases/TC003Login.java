package DWS_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.framework.BaseTest;
import com.selenium.framework.ExcelLib;

import DWS_Pages.BasePage;
import DWS_Pages.LoginPage;
import jxl.read.biff.BiffException;

public class TC003Login extends BaseTest{
	
	@DataProvider(name = "data")
	public Object[][] data() throws BiffException, IOException{
		ExcelLib excel = new ExcelLib("Reservation", this.getClass().getSimpleName());
		return excel.getTestdata();
	}
	

	@Test(dataProvider = "data")
	public void login(String username, String password) {
		
		BasePage basepage = new BasePage(driver);
		clickElement(basepage.loginLink);
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.send_username(username);
		loginpage.send_password(password);
		loginpage.clicl_login_button();
		
		Assert.assertEquals(loginpage.customerInfo.getText() , username );
	}

}

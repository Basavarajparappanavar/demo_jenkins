package DWS_TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.framework.BaseTest;
import com.selenium.framework.ExcelLib;

import DWS_Pages.BasePage;
import DWS_Pages.BooksPage;
import DWS_Pages.HomePage;
import DWS_Pages.LoginPage;
import jxl.read.biff.BiffException;

public class TC004EndtoEnd extends BaseTest{
	@DataProvider(name = "data")
	public Object[][] data() throws BiffException, IOException{
		ExcelLib excel = new ExcelLib("DWS", this.getClass().getSimpleName());
		return excel.getTestdata();
	}
	

	@Test(dataProvider = "data" , groups = "Sample")
public void endtoend(String username,String password,String product) throws InterruptedException {
	BasePage basepage = new BasePage(driver);
	clickElement(basepage.loginLink);
	
	LoginPage loginpage = new LoginPage(driver);
	loginpage.send_username(username);
	loginpage.send_password(password);
	loginpage.clicl_login_button();
	Thread.sleep(2000);
	
	clickElement(basepage.booksTab);
	Thread.sleep(2000);
	
	BooksPage bp=new BooksPage(driver);
	clickElement(bp.add_cart);
	Thread.sleep(2000);
	
	
}
}

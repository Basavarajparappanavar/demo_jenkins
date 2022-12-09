package DWS_TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.framework.BaseTest;

import DWS_Pages.BasePage;
import DWS_Pages.BooksPage;

public class TC001_AssertBooksTab extends BaseTest {
	
	
	@Test(groups = "Sample")
	public void AssertBooksTab() {
		
		BasePage basepage = new BasePage(driver);
		basepage.clickBooksTab();
		
		BooksPage bookspage = new BooksPage(driver);
		String actualTitle= bookspage.pageTitle.getText();
		
		System.out.println(actualTitle);
		
		Assert.assertEquals(actualTitle, "BOOKS");
		
		
	}

	

}

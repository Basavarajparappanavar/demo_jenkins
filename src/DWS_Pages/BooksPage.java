package DWS_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage extends BasePage {
	
	
	
	
	public BooksPage(WebDriver driver) {
		super(driver);	
	}

	@FindBy(xpath="//div[@class=\"breadcrumb\"]//strong")
	public WebElement pageTitle;
	
	

}

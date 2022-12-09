package DWS_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.framework.FrameworkUtility;

public class BasePage extends FrameworkUtility{

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@href=\"/books\"])[1]")
	public WebElement booksTab;
	
	@FindBy(xpath="//a[@class=\"ico-login\"]")
	public WebElement loginLink;
	
	@FindBy(xpath="//a[@href=\"/register\"]")
	public WebElement registerLink;
	
	
	public void clickBooksTab() {
		clickElement(booksTab);
	}
	

}

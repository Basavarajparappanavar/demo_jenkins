package DWS_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.framework.FrameworkUtility;


public class HomePage extends FrameworkUtility {
//constructor
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//webelements
	@FindBy(xpath="//a[text()='Log in']")
	WebElement login_link;
	@FindBy(className = "ico-register")
	WebElement Register_link;
	@FindBy(className = "cart-label")
	WebElement Wishlist;
	@FindBy(id = "small-searchterms")
	WebElement Search;
	@FindBy(xpath = "(//input[@type='submit'])[1]")
	WebElement Search_button;
	@FindBy(xpath = "(//a[@href='/computers'])[1]")
	WebElement Computers;
	@FindBy(xpath ="(//a[@href='/accessories'])[1]")
	WebElement Accessories;
	@FindBy(xpath = "(//a[@href='/desktops'])[1]")
	WebElement Desktops;
	@FindBy(xpath = "(//a[@href='/notebooks'])[1]")
	WebElement Notebook;
	@FindBy(xpath = "(//a[@href='/jewelry'])[1]")
	WebElement jewelry;
	@FindBy(xpath = "(//a[@href='/electronics'])[1]")
	WebElement Electronics;
	@FindBy(xpath = "(//a[@href='/camera-photo'])[1]")
	WebElement Camera_Photo;
	@FindBy(xpath = "(//a[@href='/cell-phones'])[1]")
	WebElement cellphone;
	@FindBy(xpath = "//a[@href='http://www.facebook.com/nopCommerce']")
	WebElement Facebook_link;
	@FindBy(xpath = "(//a[@href='/apparel-shoes'])[1]")
	WebElement apparel_shoes;
	@FindBy(id = "pollanswers-3")
	WebElement poor_radio_btn;
	@FindBy(id = "vote-poll-1")
	WebElement submit_vote;
	@FindBy(id = "newsletter-email")
	WebElement email;
	@FindBy(id = "newsletter-subscribe-button")
	WebElement subcribe_btn;
	@FindBy(xpath = "//a")
    List<WebElement> Links;
	@FindBy(xpath = "(//a[@href='/gift-cards'])[1]")
	WebElement giftcard;

	public void click_gift_card() {
		clickElement(giftcard);
	}
	
	
	public void enter_value_in_Search(String value) {
		enterText(Search, value);
	}
	public void click_Search_button() {
		clickElement(Search_button);
	}
	
	public void click_poor_radio_button() {
		clickElement(poor_radio_btn);
	}
	public void click_vote() {
		clickElement(submit_vote);
	}
	public void enter_email(String emailid) {
		enterText(email, emailid);
	}
	public void click_subcribe() {
		clickElement(subcribe_btn);
	}
	
	
	public void click_login() {
		clickElement(login_link);
	}
	public void click_register() {
		clickElement(Register_link);
	}
	public void click_wishlist() {
		clickElement(Wishlist);
	}
	
	public void click_Facebook_link() {
		clickElement(Facebook_link);
	}
	public void click_apparel_shoes() {
		clickElement(apparel_shoes);
	}
	
	
}
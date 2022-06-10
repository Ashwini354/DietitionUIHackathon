package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ApplicationUtils;

public class AccountPage extends ApplicationUtils{

	public AccountPage(WebDriver driver1) {
		super(driver1);
		
	}
	
	@FindBy(xpath = "//span[text()='Order history and details']")
	WebElement order;
	@FindBy(xpath = "//input[@id='email']")
	WebElement username;
	@FindBy(xpath = "//input[@id='passwd']")
	WebElement passWord;
	
	
	public String getAcountTitle() {
		return driver.getTitle();
	}

}

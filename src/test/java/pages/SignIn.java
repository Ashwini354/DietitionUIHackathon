package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ApplicationUtils;

public class SignIn extends ApplicationUtils {

	public SignIn(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[@href='/login']")
	WebElement signin;
	@FindBy(xpath = "//input[@id='email']")
	WebElement username;
	@FindBy(xpath = "//input[@id='passwd']")
	WebElement passWord;
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	WebElement login;
	@FindBy(xpath = "//div[@role='alert']")
	WebElement invalidmsg;
	@FindBy(xpath = "//ul/a[3]")
	WebElement signout;

	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement text;

	public void enterInteUsernameFeild(String userName) {
		enterText(username, userName);
	}

	public void enterIntePasswordFeild(String password) {
		enterText(passWord, password);
	}

	public AccountPage clickSignin() {
		signin.click();
		 return new AccountPage(driver);

	}

	public void clickLogin() {
		
		login.click();
		 

	}

	public void clickSignout() {
		signout.click();

	}

	public String checkuserPasswordWrong() {
		return invalidmsg.getText();

	}

	
	
	public String getTittle() {

		return driver.getTitle();
	}
	
	public AccountPage doLogin(String Username,String password) {
		username.sendKeys(Username);
		passWord.sendKeys(password);
		login.click();
		 return new AccountPage(driver);
		
	}

}

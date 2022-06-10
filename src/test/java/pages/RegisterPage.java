package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ApplicationUtils;

public class RegisterPage extends ApplicationUtils{

	public RegisterPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//div[@name='Sign Up form']")
	WebElement textSignUpForm;
	@FindBy(xpath = "//input[@id='SIGN UP']")
	WebElement btnSignUp;
	

public String signUpFormText() {
		return textSignUpForm.getText();
	}

public boolean signUpBtnVisibility() {
	return btnSignUp.isDisplayed();
}
	

}

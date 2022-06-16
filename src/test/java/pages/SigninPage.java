package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.testng.Assert;

//import io.cucumber.java.en.Then;
import utilities.ApplicationUtils;

public class SigninPage extends ApplicationUtils{
	
	public SigninPage(WebDriver driver1) {
		super(driver1);

}
	@FindBy(xpath="//div[@name='Sign In Form']")
	WebElement textSignInform;
	@FindBy(xpath="//div[@name='Sign In Form']")
	WebElement signinHome;
	
	@FindBy(xpath="//div[@img='Sign In']")
	WebElement imgSignIn;
	@FindBy(xpath = "//input[@id='Sign In']")
	WebElement btnSignIn;
	@FindBy(id="name")
	WebElement txt_Username;
	@FindBy(name="Password")
	WebElement txt_Password;
	@FindBy(id="Forgot")
	WebElement linkForgotpwd;
    @FindBy(partialLinkText="Notmember")
    WebElement linkNotmember;
    @FindBy(xpath = "//input[@id='Log In']")
	WebElement btnLogIn;
    @FindBy(name="Email")
    WebElement txt_email;
    @FindBy(id="SignUpHere")
    WebElement signuphere;
    
    @FindBy(xpath = "//input[@id='Facebook']")
   	WebElement facebook;
       @FindBy(name="Google")
       WebElement google;
       @FindBy(id="Pwd")
       WebElement txt_Pwd;
    
    
	
	
	public String SignInformText() {
		return textSignInform.getText();
	}

    public void SignInClick() {
	 imgSignIn.click();
}

    public boolean SignInBtnVisibility() {
    	return btnSignIn.isDisplayed();
	}
//    public void clickSigninMenu() {
//		signinHome.click();
//	}
	
    public void SignIn( String Username,String Password) {
    	txt_Username.sendKeys(Username);
    	txt_Password.sendKeys(Password);
    	
    }

	public void clickForgotpswdlink() {
		linkForgotpwd.click();
		
	}
	public void clickNotmemberYet() {
		linkNotmember.click();

	}

	 public boolean LogInBtnVisibility() {
	    	return btnLogIn.isDisplayed();
	}
	 public void LogIn( String Email,String Pwd) {
	    	txt_Username.sendKeys(Email);
	    	txt_Password.sendKeys(Pwd);
	
    }
	 public void clickSigninMenu() {
			signinHome.click();
		
}
	 

		public void faceBookclick() {
			facebook.click();
			
		}
		public void googleClick() {
			google.click();

		}
		public void SignUPHereClick() {
			signuphere.click();

		}
}
    
	




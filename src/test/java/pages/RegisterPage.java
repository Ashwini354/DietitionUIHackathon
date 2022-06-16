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
	
	@FindBy(id="Firstname")
	WebElement txt_Firstname ;
	
	@FindBy(id="Lastname")
	WebElement txt_lastname;
	
	@FindBy(css = "[name='MobileNumber']")
	WebElement Mobilenumber;
	
	@FindBy(className="Password")
	WebElement txt_Password;
	
	@FindBy(css ="Email")
	WebElement Email;
	
	@FindBy(className="any other")
	WebElement txt_Anyotherfields;
	@FindBy(id="Name")
	WebElement txt_Name;
	
	@FindBy(name="Lname")
	WebElement lastname;
	
	@FindBy(css ="Email")
	WebElement Emailaddress;
	
	@FindBy(name="UserName")
	WebElement txt_Username;
	
	@FindBy(className="Password")
	WebElement txt_Pword;
	
	@FindBy(className=" ConfPassword")
	WebElement txt_ConfirmPassword;
	
	@FindBy(name="Facebook")
	WebElement btnFacebook;
	
	@FindBy(name="Google")
	WebElement btnGoogle;
	
	@FindBy(partialLinkText="Login")
	WebElement Linkloginhere;
	
   
			
public String signUpFormText() {
		return textSignUpForm.getText();
	}

public boolean signUpBtnVisibility() {
	return btnSignUp.isDisplayed();
}

public void signUp() {
	 btnSignUp.click();
}
public void FirstName(String Firstname) {
	txt_Firstname.sendKeys(Firstname);
}
public void LastName(String Lastname){
	txt_lastname.sendKeys(Lastname);
}
public int Mobilenumber(int mobilenumber) {
	Mobilenumber.sendKeys(String.valueOf(mobilenumber));
	return mobilenumber;
}
public void Anyotherfields(String anyother) {
	txt_Anyotherfields.sendKeys(anyother);
}
public String Email(String email) {
	 Email.sendKeys(email);
	 return email;	
	}
public void Password(String pwd) {
	txt_Password.sendKeys(pwd);
	}
public void Name(String Name) {
	txt_Name.sendKeys(Name);
}
public void LName(String LName) {
	txt_Name.sendKeys(LName);
}
public String Emailaddress(String Emailaddress) {
	 Email.sendKeys(Emailaddress);
	 return Emailaddress;	
}
public void Username(String Username) {
	txt_Username.sendKeys(Username);
}
public void Passwrd(String Pword) {
	txt_Pword.sendKeys(Pword);
}
public void ConfirmPassword(String Pwd) {
	txt_ConfirmPassword.sendKeys(Pwd);
	}


public void Facebookclick() {
	btnFacebook.click();
}
public void Googleclick() {
	btnGoogle.click();
}
public void LogInHere() {
	Linkloginhere.click();
	
}


}



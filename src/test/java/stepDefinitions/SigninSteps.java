package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SigninPage;

public class SigninSteps {
	WebDriver driver=DriverFactory.getDriver();
	private SigninPage signinpage = new SigninPage(driver);
    private HomePage homepage= new HomePage(driver);
	private static String[]errormessage=new String[110];
	

	
@Given("User is on the Dietician website")
public void user_is_on_the_dietician_website() {
   DriverFactory.getDriver().get("http://www.xyzdietician.com/");
		}
@Given("User is on Sign In Page")
public void user_is_on_sign_in_page() {
	DriverFactory.getDriver().getTitle();
}

@When("User clicks on icon symbol on Sign In Page")
public void user_clicks_on_icon_symbol_on_sign_in_page() {
   signinpage.SignInClick();
}

@When("User clicks on Sign In link from the Home Page")
public void user_clicks_on_Sign_In_link_from_the_Home_page() {
	homepage.clickSigninMenu();
	
	}

@When("User enters {string},{string} and {string}")
public void user_enters_and(String Usrname, String Passwrd, String Err) {
	for (int i=0; i<5; i++){
		errormessage[i] = Err;
	}
}

@When("User clicks on Forgot Password button")
public void user_clicks_on_forgot_password_button() {
	signinpage.clickForgotpswdlink();
}
@When("User clicks on Not member Yet")
public void user_clicks_on_not_member_yet() {
	signinpage.clickNotmemberYet();
}
@When("User is on the Sign in Page")
public void user_is_on_the_sign_in_page() {
	DriverFactory.getDriver().getTitle();

}
@When("User enters {string},{string} and then {string}")
public void user_enters_and_then(String mailid, String Pwrd, String Emsg) {
	for (int i=0; i<5; i++){
		errormessage[i] = Emsg;
	}
}
@When("User clicks Facbook button in the Sign In with Email form")
public void user_clicks_facbook_button_in_the_sign_in_with_email_form() {
	signinpage.faceBookclick();
}
@When("User clicks the Gogle button in the Sign In with Email form")
public void user_clicks_the_gogle_button_in_the_sign_in_with_email_form() {
	signinpage.googleClick();
}
@When("User clicks Sign Up Here link")
public void user_clicks_sign_up_here_link() {
	signinpage.SignUPHereClick();
}


@Then("User should see title of page as Sign In")
public void user_should_see_title_of_page_as_sign_in(String string) {
	String actualText =driver.getTitle();
	String expectedText = string;
	Assert.assertEquals(actualText, expectedText);
			}
@Then("User should see a form with heading Sign In form")
public void user_should_see_a_form_with_heading_Sign_In_form(String string){
	String formText = signinpage.SignInformText();
	String expectedText = "Sign In form";
	Assert.assertEquals(formText, expectedText);
}

@Then("User should see a button with text Sign In form in the Sign In")
public void user_should_see_a_button_with_text_Sign_In_form_in_the_Sign_In() {	
	Assert.assertEquals(signinpage.SignInBtnVisibility(), true);
}
@Then("User should be logged in successfully")
public void user_should_be_logged_in_successfully() {
	Assert.assertEquals(errormessage[0], "Please fill the fields");
	Assert.assertEquals(errormessage[1], "only alphabets allowed");
	Assert.assertEquals(errormessage[2], "Only alphabets allowed");
	Assert.assertEquals(errormessage[3], "Invalid both fields");
	Assert.assertEquals(errormessage[5], "Sign in successful");
	
	}

@Then("User is directed to Reset password link")
public void User_is_directed_to_Reset_password_link(String Forgotpwd) {
	String actualText =driver.getTitle();
	String expectedText =(Forgotpwd);
	Assert.assertEquals(actualText, expectedText);

}
@Then("User is directed to Register Page")
public void user_is_directed_to_register_page(String Register) {
	String actualText =driver.getTitle();
	String expectedText = Register;
	Assert.assertEquals(actualText, expectedText);
}
@Then("User should see a form with heading Login with your email")
public void user_should_see_a_form_with_heading_login_with_your_email() {
	String formText = signinpage.SignInformText();
	String expectedText = "Sign In form";
	Assert.assertEquals(formText, expectedText);
	}
@Then("User should see a button with text Log In in Sign In form")
public void user_should_see_a_button_with_text_log_in_in_sign_in_form() {
	Assert.assertEquals(signinpage.LogInBtnVisibility(), true);
	}
@Then("User is directed to Facbook sign in page")
public void user_is_directed_to_Facbook_sign_in_page(String Faceboook) { 
	String actualText =driver.getTitle();
	String expectedText =Faceboook;
	Assert.assertEquals(actualText, expectedText); 
}

@Then("User is directed to Gogle login page")
public void user_is_directed_to_Google_login_page(String Gooogle) {
	String actualText =driver.getTitle();
	String expectedText =Gooogle;
	Assert.assertEquals(actualText, expectedText);
}
@Then("User is directed to Register page")
public void user_is_directed_to_sign_in_page(String Register) {
	String actualText =driver.getTitle();
	String expectedText =Register;
	Assert.assertEquals(actualText, expectedText);
}
@Then("User should be able to log in")
public void user_should_be_able_to_log_in() {
	Assert.assertEquals(errormessage[0], "Please fill the fields");
	Assert.assertEquals(errormessage[1], "Invalid entry");
	Assert.assertEquals(errormessage[2], "Only alphabets allowed");
	Assert.assertEquals(errormessage[3], "Invalid both fields");
	Assert.assertEquals(errormessage[5], "Sign in successful");
	
}

}







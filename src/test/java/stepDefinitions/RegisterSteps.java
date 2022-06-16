package stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;



public class RegisterSteps {
	WebDriver driver=DriverFactory.getDriver();
	private static String[]errormessage=new String[10];
    private RegisterPage registerpage= new RegisterPage(driver);
    private HomePage homepage= new HomePage(driver);
    

@Given("User is on Dietician website")
    public void user_is_on_dietician_website() {
	DriverFactory.getDriver().get("http://www.xyzdietician.com/");
	}
@Given("User is on Register Page")
public void user_is_on_register_page() {
	registerpage.signUp();
}

@When("User clicks on REGISTER link from the Home Page")
public void user_clicks_on_register_button_from_the_home_page() {
   homepage.clickRegisterMenu();
}
@When("User does not enter any value in fields")
public void user_does_not_enter_any_value_in_fields() {
	registerpage.signUp();
}
@When("User enters {string},{string},{int},{string},{string},{string} and {string}")
public void user_enters_and(String FirstName, String LastName, Integer MobileNumber, String AnyotherFields, String Email, String Password, String Error) {
	for (int i=0; i<6; i++){
		errormessage[i] = Error;
		}
}
@When("User gives {string},{string},{string},{string},{string},{string} and {string}")
public void user_gives_and(String Name, String LName, String Username, String Emailaddress, String Pword, String ConfirmPword, String Error) {
		for (int i=0; i<7; i++){
			errormessage[i] = Error;
		}
}
@When("User clicks Facebook button in the Sign Up with Email form")
 public void user_clicks_facebook_button_in_the_sign_up_with_email_form() {
	registerpage.Facebookclick();
	
		}
@When("User clicks Google button in the Sign Up with Email form")
 public void user_clicks_google_button_in_the_sign_up_with_email_form() {
	registerpage.Googleclick();
	
}
@When("User clicks Log In Here link")
 public void user_clicks_log_in_here_link() {	
	registerpage.LogInHere();

}
@Then("User should see a form with heading Sign Up form")
 public void user_should_see_a_form_with_heading_sign_up_form() {
	String formText = registerpage.signUpFormText();
	String expectedText = "Sign Up form";
	Assert.assertEquals(formText, expectedText);

}
@Then("User should see a button with text SIGN UP in the Sign Up form")
 public void user_should_see_a_button_with_text_sign_up_in_the_sign_up_form() {	
	Assert.assertEquals(registerpage.signUpBtnVisibility(), true);
}	
@Then("User should see title of page as Register")
    public void user_should_see_title_of_the_page_as(String string) {
	String actualText =driver.getTitle();
	String expectedText = string;
	Assert.assertEquals(actualText, expectedText);
		}

@Then("User should see message\"Fields are empty\"")
public void user_should_see_message_fields_are_empty() {
	registerpage.signUp();

}
@Then("User should be on Sign In Page")
public void user_should_be_on_sign_in_page() {
	Assert.assertEquals(errormessage[0], "Only characters are allowed");
	Assert.assertEquals(errormessage[1], "Only characters are allowed");
	Assert.assertEquals(errormessage[2], "Invalid entry");
	Assert.assertEquals(errormessage[3], "Invalid mail id");
	Assert.assertEquals(errormessage[4], "Invalid password");
	Assert.assertEquals(errormessage[5], "Successful Sign up");
	registerpage.signUp();
}
@Then("User should be able to Sign In Page")
public void user_should_be_able_to_sign_in_page() {
	Assert.assertEquals(errormessage[0], "Only characters are allowed");
	Assert.assertEquals(errormessage[1], "Only characters are allowed");
	Assert.assertEquals(errormessage[2], "Invalid entry");
	Assert.assertEquals(errormessage[3], "Invalid mail id");
	Assert.assertEquals(errormessage[4], "Invalid password");
	Assert.assertEquals(errormessage[4], "Invalid  confirm password");
	Assert.assertEquals(errormessage[5], "Sign up success");
	registerpage.signUp();
}
@Then("User is directed to Facebook login page")
public void user_is_directed_to_Facebook_login_page(String Faceboook) { 
	String actualText =driver.getTitle();
	String expectedText =Faceboook;
	Assert.assertEquals(actualText, expectedText);

}

@Then("User is directed to Google login page")
public void user_is_directed_to_Google_login_page(String Gooogle) {
	String actualText =driver.getTitle();
	String expectedText =Gooogle;
	Assert.assertEquals(actualText, expectedText);
}


@Then("User is directed to SignIn page")
public void user_is_directed_to_sign_in_page(String SignIn) {
	String actualText =driver.getTitle();
	String expectedText = SignIn;
	Assert.assertEquals(actualText, expectedText);


}
}

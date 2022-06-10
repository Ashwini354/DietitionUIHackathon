package stepDefinitions;
import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterSteps {
	
private RegisterPage registerpage= new RegisterPage(DriverFactory.getDriver());
private HomePage homepage= new HomePage(DriverFactory.getDriver());


@Given("User is on Dietician website")
public void user_is_on_dietician_website() {
	DriverFactory.getDriver().get("http://www.xyzdietician.com/");
	
}

@When("User clicks on REGISTER link from the Home Page")
public void user_clicks_on_register_button_from_the_home_page() {
   homepage.clickRegister();
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

}

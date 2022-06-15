package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsSteps {
	private WebDriver driver = DriverFactory.getDriver();
	private ContactUsPage contactUs= new ContactUsPage(driver);
	private HomePage homePage= new HomePage(driver);
	private static String[] messageText = new String[6];
	
	@Given("User is on Contact Us Page")
	public void user_is_on_contact_us_page() {
		homePage.clickContactMenu();
	}
	
	@Then("User should see a heading with text Contact Us on the page")
	public void user_should_see_a_heading_with_text_contact_us_on_the_page() {
		Assert.assertEquals(contactUs.headingVisibility(), "True");
		Assert.assertEquals(contactUs.headingText(), "Contact Us");
	}
	
	@Then("User should see an email id numpyninja@gmail.com on the page")
	public void user_should_see_an_email_id_numpyninja_gmail_com_on_the_page() {
		Assert.assertEquals(contactUs.emailIdVisibility(), "True");
		Assert.assertEquals(contactUs.emailIdText(), "numpyninja@gmail.com");		
	}
	@Then("User should see {string} as phone number  on the page")
	public void user_should_see_as_phone_number_on_the_page(String phonenumberExpected) {
		Assert.assertEquals(contactUs.phoneNumberVisibility(), "True");
		Assert.assertEquals(contactUs.phoneNumberText(), phonenumberExpected);		
	}
	
	@Then("User should see {string} as the street number and name of the address")
	public void user_should_see_as_the_street_number_and_name_of_the_address(String streetExpected) {
		Assert.assertEquals(contactUs.streetAddressVisibility(), "True");
		Assert.assertEquals(contactUs.streetAddressText(), streetExpected);
	}
	
	@Then("User should see {string} as the city name of the address")
	public void user_should_see_as_the_city_name_of_the_address(String cityExpected) {
		Assert.assertEquals(contactUs.cityVisibility(), "True");
		Assert.assertEquals(contactUs.cityText(), cityExpected);
	}
	
	@Then("User should see {string} as the state,pin and country field of the address")
	public void user_should_see_as_the_state_pin_and_country_field_of_the_address(String stateNCountryExpected) {
		Assert.assertEquals(contactUs.stateNCountryVisibility(), "True");
		Assert.assertEquals(contactUs.stateNCountryText(), stateNCountryExpected);
	}
	
	@Then("User should see a button with text Submit on the bottom of the page")
	public void user_should_see_a_button_with_text_submit_on_the_bottom_of_the_page() {
		Assert.assertEquals(contactUs.submitBtnVisibility(), "True");
		Assert.assertEquals(contactUs.submitBtnText(), "SUBMIT");
	}
	
	@When("User submits the form as {int} with the details {string}, {string}, {string}, {string}, {string}")
	public void user_submits_the_form_with_the_details(int i, String firstName, String lastName, String email, String subject, String yourMessage) {
		contactUs.submitForm(firstName, lastName, email, subject, yourMessage);
		messageText[i] = contactUs.messageFieldText();
	}
	@Then("User should see a message {string} on the page")
	public void user_should_see_a_message_on_the_page(String messageExpected) {
		for (int i=0; i<5; i++) {
			Assert.assertEquals(messageText[i], messageExpected);
			
		}
		
	}

}

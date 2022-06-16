package stepDefinitions;
import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddNewPatient;

public class AddNewPatientSteps {
	
private static String[] errMsg = new String[10];


private AddNewPatient addnewpatientpage= new AddNewPatient(DriverFactory.getDriver());
private SignInPage signinpage = new SignInPage(DriverFactory.getDriver());


	@Given("User is on the Add New Patient Page")
	public void user_is_on_the_add_new_patient_page() {
		DriverFactory.getDriver().get("http://www.xyzdietician.com/add_new_patient");
	}
	
	@When("User wants to enter New Patient details")
	public void user_wants_to_enter_new_patient_details() {
		signinpage.SignIn();
	}
	
	@Then("Patient Data From is visible")
	public void patient_data_from_is_visible() {
		
		String headingText = addnewpatientpage.headingPatientForm();
		String expectedHeading = "Patient Data";
		Assert.assertEquals(headingText, expectedHeading);
		
	}
	
	@When("User attempts to submit the form without filling up mandatory fields")
	public void user_attempts_to_submit_the_form_without_filling_up_mandatory_fields() {
		addnewpatientpage.updatePatientBtn();
	}
	
	@Then("Unable to update and show Please fillup all the mandatory fields error message")
	public void unable_to_update_and_show_please_fillup_all_the_mandatory_fields_error_message() {
		
		String mandatoryFieldsErr = addnewpatientpage.errorMsgPatientForm();
		String expectedmandatoryFieldsErr = "Please fillup all the mandatory fields";
		Assert.assertEquals(mandatoryFieldsErr, expectedmandatoryFieldsErr);
	    
	}
	
	@When("User does not put space in between First Name and Last Name for Full Name field")
	public void user_does_not_put_space_in_between_first_name_and_last_name_for_full_name_field() {
		
		addnewpatientpage.fullNamePatientForm("FnameLname");
		addnewpatientpage.address1PatientForm("address1");
		addnewpatientpage.address2PatientForm("address2");
		addnewpatientpage.countryPatientForm("country");
		addnewpatientpage.cityNamePatientForm("city");
		addnewpatientpage.stateNamePatientForm("state");
		addnewpatientpage.postalCodePatientForm(789451);
		addnewpatientpage.emailIdPatientForm("s.misra17@gmail.com");
		addnewpatientpage.phoneNumberPatientForm("963258741");
		addnewpatientpage.updatePatientBtn();
	}
	
	@Then("Unable to enter and show First and Last Name should have space in between error message")
	public void unable_to_enter_and_show_first_and_last_name_should_have_space_in_between_error_message() {
		
		errMsg[0] = addnewpatientpage.errorMsgPatientForm();
		Assert.assertEquals(errMsg[0], "First and Last Name should have space in between");
	}
	
	@When("User enters Full Name {string}, Address1 {string}, Address2 {string}, Country {string}, City {string}, State {string}, Postal Code {int}, Email {string} and Phone Number {string}")
	public void user_enters_full_name_address1_address2_country_city_state_email_phone_number_and_error_message(String fullname, String address1, String address2, String country, String city, String state, Integer postalcode, String email, String phone) {

		for (int i=0; i<9; i++){
						
			addnewpatientpage.fullNamePatientForm(fullname);
			addnewpatientpage.address1PatientForm(address1);
			addnewpatientpage.address2PatientForm(address2);
			addnewpatientpage.countryPatientForm(country);
			addnewpatientpage.cityNamePatientForm(city);
			addnewpatientpage.stateNamePatientForm(state);
			addnewpatientpage.postalCodePatientForm(postalcode);
			addnewpatientpage.emailIdPatientForm(email);
			addnewpatientpage.phoneNumberPatientForm(phone);
			
			addnewpatientpage.updatePatientBtn();
			
			errMsg[i] = addnewpatientpage.errorMsgPatientForm();
		}

	}

	@Then("User can see the error message")
	public void user_can_see_the_error_message() {
	
		Assert.assertEquals(errMsg[0], "Only characters are allowed Name");		
		Assert.assertEquals(errMsg[4], "Only characters are allowed in City");
		Assert.assertEquals(errMsg[5], "Only characters are allowed in State");
		Assert.assertEquals(errMsg[6], "Invalid Postal code format");
		Assert.assertEquals(errMsg[7], "Invalid email format");
		Assert.assertEquals(errMsg[8], "Only Numeric values are allowed in Phone");
		

		
	}
	
	@When("User enters correct patient details")
	public void user_enters_correct_patient_details() {
		
		
		addnewpatientpage.fullNamePatientForm("Fname Lname");
		addnewpatientpage.address1PatientForm("address1");
		addnewpatientpage.address2PatientForm("address2");
		addnewpatientpage.countryPatientForm("country");
		addnewpatientpage.cityNamePatientForm("city");
		addnewpatientpage.stateNamePatientForm("state");
		addnewpatientpage.postalCodePatientForm(789451);
		addnewpatientpage.emailIdPatientForm("s.misra17@gmail.com");
		addnewpatientpage.phoneNumberPatientForm("9632587410");
		
		addnewpatientpage.updatePatientBtn();
	}
	
	@Then("User lands on My Patients page")
	public void user_lands_on_my_patients_page() {
		
		String successMsg = addnewpatientpage.successMsgPatientForm();
		Assert.assertEquals(successMsg, "Patient added successfully");
		
		System.out.println(successMsg);
		
	}


}

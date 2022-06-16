package stepDefinitions;

import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MyPatientPage;
import pages.SignIn;

public class MyPatientStep {
	private MyPatientPage myPatientPage =new MyPatientPage(DriverFactory.getDriver());
	private String title;
	private String search;
	

@Given("User is on any page after login")
public void user_is_on_any_page_after_login() {
	
	myPatientPage.getTitleOfThePage();
	
  
}

@When("User clicks on My Patients tab")
public void user_clicks_on_my_patients_tab() {
	myPatientPage.clickMyPatientButton();
	
   
}

@Then("Verify Heading of the page")
public void verify_heading_of_the_page() {
	 title=myPatientPage.getTitleOfThePage();
	
   
}

@Then("Page title is displayed as {string}")
public void page_title_is_displayed_as(String string) {
	Assert.assertTrue(title.contains(string));
   
}

@When("User clicks the search button without entering any search data")
public void user_clicks_the_search_button_without_entering_any_search_data() {
	myPatientPage.clickSearchButton();
   
}

@Then("User should see a message {string} message")
public void user_should_see_a_message_message(String string) {
	String search=myPatientPage.searchText();
	Assert.assertTrue(search.contains(search));
	
   
}

@Given("User is on my patients")
public void user_is_on_my_patients() {
	myPatientPage.getTitleOfThePage();
   
}



@Then("Records for <name phrase> are shown.")
public void records_for_name_phrase_are_shown() {
	String name=myPatientPage.nameText();
	System.out.println(name);
   
}

@When("User clicks on search with <email phrase> into email address filter.")
public void user_clicks_on_search_with_email_phrase_into_email_address_filter() {
	myPatientPage.clickSearchButton();
	myPatientPage.enterIntoEmailAddressFilter("ashhwinir.cse@gmail.com");
   
}

@Then("Records for <email phrase> are shown.")
public void records_for_email_phrase_are_shown() {
	String email=myPatientPage.emailText();
	System.out.println(email);
    
}

@When("User clicks on search with <phone number> into phone number filter.")
public void user_clicks_on_search_with_phone_number_into_phone_number_filter() {
	myPatientPage.clickSearchButton();
	myPatientPage.enterIntoPhoneNameFilter("8939335401");
	
   
}

@Then("Records for <phone number> are shown.")
public void records_for_phone_number_are_shown() {
	String phone=myPatientPage.phoneText();
	System.out.println(phone);
   
}

@When("User clicks on search button with <name phrase> into name filter box, <phone number> into phone number filter")
public void user_clicks_on_search_button_with_name_phrase_into_name_filter_box_phone_number_into_phone_number_filter() {
	myPatientPage.clickSearchButton();
	myPatientPage.enterIntoPhoneNameFilter("8939335401");
	myPatientPage.enterIntoNameFilter("ashhwini");
	
   
}

@Then("RRecords for <name phrase> and <phone number> are shown.")
public void r_records_for_name_phrase_and_phone_number_are_shown() {
	String phonename=myPatientPage.phonename();
	System.out.println(phonename);
   
}

@When("User clicks on search button with <name phrase> into name filter box, <email phrase> into email address filter box")
public void user_clicks_on_search_button_with_name_phrase_into_name_filter_box_email_phrase_into_email_address_filter_box() {
	myPatientPage.enterIntoEmailAddressFilter("ashhwinir.cse@gmail.com");
	myPatientPage.enterIntoNameFilter("ashhwini");
   
}

@Then("Records for <name phrase> and <email phrase> are shown.")
public void records_for_name_phrase_and_email_phrase_are_shown() {
	String emailname=myPatientPage.emailname();
	System.out.println(emailname);
}

@When("User clicks on search button with <phone number> into phone number filter box, <email phrase> into email address filter box")
public void user_clicks_on_search_button_with_phone_number_into_phone_number_filter_box_email_phrase_into_email_address_filter_box() {
	myPatientPage.enterIntoEmailAddressFilter("ashhwinir.cse@gmail.com");
	myPatientPage.enterIntoPhoneNameFilter("8939335401");
    
}

@Then("Records for <phone number> and <email phrase> are shown.")
public void records_for_phone_number_and_email_phrase_are_shown() {
	String phoneemail=myPatientPage.phoneEmail();
	System.out.println(phoneemail);
    
}



@When("User clicks on search with name into name  filter box.")
public void user_clicks_on_search_with_name_into_name_filter_box() {
	myPatientPage.clickSearchButton();
	myPatientPage.enterIntoNameFilter("ashhwini");

}

@When("User types in anything other than [\\/\\/] in phone number field")
public void user_types_in_anything_other_than_in_phone_number_field() {
	myPatientPage.enterIntoPhoneNameFilter("8939335401");
}

@Then("It shows action buttons for View Previous Test Report, View Previous Diet Plans, Create New Report")
public void it_shows_action_buttons_for_view_previous_test_report_view_previous_diet_plans_create_new_report() {
	myPatientPage.getTitleOfThePage();
}

@When("User types in anything other valid character in email address field")
public void user_types_in_anything_other_valid_character_in_email_address_field() {
	myPatientPage.enterIntoEmailAddressFilter("12345");
    
}

@When("User types in anything other alphabets in name field")
public void user_types_in_anything_other_alphabets_in_name_field() {
	myPatientPage.enterIntoNameFilter("123456");
    
}

@Then("It must throw error message and discontinue search action.")
public void it_must_throw_error_message_and_discontinue_search_action() {
	String error=myPatientPage.ErrorMsg();
	Assert.assertTrue(error.contains("Invalid Data"));
    
}

@When("User clicks on search button with all fields empty")
public void user_clicks_on_search_button_with_all_fields_empty() {
	myPatientPage.clickSearchButton();
	 search=myPatientPage.searchText();
   
}

@Then("No result found")
public void no_result_found() {
	Assert.assertTrue(search.contains("NO Result Found"));
	
   
}

@When("User clicks on search button with or without all fields empty")
public void user_clicks_on_search_button_with_or_without_all_fields_empty() {
	myPatientPage.enterIntoHitSearch("ashwini");
    
}

@Then("It shows columns name like Record Number, Cust ID, Name, Details, Last Visit and Actions")
public void it_shows_columns_name_like_record_number_cust_id_name_details_last_visit_and_actions() {
	String table=myPatientPage.table();
	System.out.println(table);
    
}

@Then("It shows action buttons for View Previous Test Report, View Previous Diet Plans, Create New Report\\/ Plan")
public void it_shows_action_buttons_for_view_previous_test_report_view_previous_diet_plans_create_new_report_plan() {
	String table=myPatientPage.table();
	System.out.println(table);

	
   
}

}

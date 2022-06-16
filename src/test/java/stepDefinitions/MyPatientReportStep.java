package stepDefinitions;

import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MyPatientPage;
import pages.MyPatientReportPage;

public class MyPatientReportStep {
	
	private MyPatientReportPage myPatientReportPage =new MyPatientReportPage(DriverFactory.getDriver());
	private MyPatientPage myPatientPage =new MyPatientPage(DriverFactory.getDriver());
	private String cusID;
	private String name;
	private String email;
	private String date;
	private String title;
private	String viewPDf;
	@Given("User has searched patients")
	public void user_has_searched_patients() {
	   myPatientPage.enterIntoSearchFilter("patient");
	   
	}

	@When("Patients records are displayed with cus ID")
	public void patients_records_are_displayed_with_cus_id() {
	   cusID= myPatientPage.getCustID();
	}

	@Then("Customer Id is shown in column {string} column")
	public void customer_id_is_shown_in_column_column(String string) {
	    Assert.assertTrue(cusID.contains(string));
	}

	@When("Patients records are displayed")
	public void patients_records_are_displayed() {
	  name= myPatientPage.table();
	}

	@Then("Patient's name is displayed in 'Name' column")
	public void patient_s_name_is_displayed_in_name_column() {
	    Assert.assertTrue(name.contains("ashwini"));
	}

	@Then("Details column shows patient's email or phone number or address")
	public void details_column_shows_patient_s_email_or_phone_number_or_address() {
		 email= myPatientPage.table();
	}

	@Then("Last visit date is shown in valid date format")
	public void last_visit_date_is_shown_in_valid_date_format() {
		date=myPatientPage.getDate();
		Assert.assertTrue(date.contains("12.9.2022"));
	}
	
	@Then("Verify that email address is in valid format in details cloumn.")
	public void verify_that_email_address_is_in_valid_format_in_details_cloumn() {
		Assert.assertTrue(email.contains("ashwini@gmail.com"));
	}

	@When("User clicks on button {string}")
	public void user_clicks_on_button(String string) {
	    myPatientPage.clickViewPreviousDietPlanButton();
	    String view=myPatientPage.getviewText();
	    Assert.assertTrue(view.contains(string));
	}

	@Then("It redirects user to {string} page")
	public void it_redirects_user_to_page(String string) {
	    title= myPatientPage.getTitleOfThePage();
	     Assert.assertTrue(title.contains(string));
	}

	@When("User clicks on button User clicks on button {string}")
	public void user_clicks_on_button_user_clicks_on_button(String string) {
	 String  view_report= myPatientPage.nameText();
	 Assert.assertTrue(view_report.contains(string));

}
	
	@Given("User has searched patients after login")
	public void user_has_searched_patients_after_login() {
		 myPatientPage.enterIntoSearchFilter("patient");
	}

	@When("User is on {string} page")
	public void user_is_on_page(String string) {
	   title= myPatientPage.getTitleOfThePage();
	   Assert.assertTrue(title.contains(string));
	}

	

	@Then("Title is displayed as 'View Patient Test Reports")
	public void title_is_displayed_as_view_patient_test_reports() {
		title= myPatientPage.getTitleOfThePage();
		Assert.assertTrue(title.contains("view patient test report"));
	    
	}

	@Then("It displays primary information like patient Id  number, name, email address, Phone number, Address")
	public void it_displays_primary_information_like_patient_id_number_name_email_address_phone_number_address() {
	    myPatientPage.table();
	    Assert.assertTrue(title.contains(" 8939335401"));
	}

	@Then("It shows column heading as Record number, Doc-ID, File Uploaded time, File\\/Report name, Identified health conditions")
	public void it_shows_column_heading_as_record_number_doc_id_file_uploaded_time_file_report_name_identified_health_conditions() {
		 myPatientPage.table();
		    Assert.assertTrue(title.contains("  Record number, Doc-ID, File Uploaded time, File/Report name, Identified health conditions"));
	}
	
	@Then("My Patients tab is selected highlighted")
	public void my_patients_tab_is_selected_highlighted() {
		myPatientReportPage.getTitle();
	   
	}

	@Then("Every record shows {string} option")
	public void every_record_shows_option(String string) {
	    myPatientPage.clickViewPreviousTestReportButton();
	    viewPDf=myPatientReportPage.getviewPDf();
	    Assert.assertTrue(viewPDf.contains(string));
	}

	@Then("Every report has Doc Id")
	public void every_report_has_doc_id() {
		String docID=myPatientReportPage.getDocID();
		Assert.assertTrue(docID.contains("123"));
		
	    
	}

	@Then("Every report shows file upload time")
	public void every_report_shows_file_upload_time() {
		String time=myPatientReportPage.getUplodedTime();
		Assert.assertTrue(time.contains("12.45"));
	    
	}

	@Then("Every report has its name")
	public void every_report_has_its_name() {
		String name=myPatientReportPage.fileReportName();
		Assert.assertTrue(name.contains("Blood Report"));
		
	    
	}

	@Then("Every report shows identified conditions from its test report file")
	public void every_report_shows_identified_conditions_from_its_test_report_file() {
	    String health=myPatientReportPage.getHealthCondition();
	    Assert.assertTrue(health.contains("Low"));
	}
	
	@Then("More than {int} records should be displayed on different pages through pagination")
	public void more_than_records_should_be_displayed_on_different_pages_through_pagination(String int1) {
	 myPatientReportPage.getpage();
	   
	    
	}

	@Then("Pagination has {string} link")
	public void pagination_has_link(String string) {
		String link=myPatientReportPage.getpageLink();
		 Assert.assertTrue(link.contains(string));
		
	    
	}



}


package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ApplicationUtils;

public class MyPatientPage extends ApplicationUtils{
	public MyPatientPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath = "//span[text()='MyPatients']")
	WebElement My_patient;
	
	@FindBy(xpath = "//span[text()='View PDF']")
	WebElement view_PDF;
	
	@FindBy(xpath = "//span[text()='VIEW PREVIOUS  TEST REPORT']")
	WebElement veiw_previous_test;
	
	@FindBy(xpath = "//span[text()='CREATE NEW REPORT/PLAN']")
	WebElement create_new_report;
	
	
	@FindBy(xpath = "//span[text()='VIEW PREVIOUS  DIET PLAN']")
	WebElement veiw_previous_diet;
	
	@FindBy(xpath = "//span[text()='Hit Search']")
	WebElement hit_search;
	@FindBy(xpath = "//input['//span[text()='Name Filter]")
	WebElement Name_filter;
	
	@FindBy(xpath = "//input['//span[text()='Email Address Filter]")
	WebElement email_filter;
	@FindBy(xpath = "//input[@id='phone]")
	WebElement phone;
	
	@FindBy(xpath = "//input['//span[text()='Search]")
	WebElement search;
	
	@FindBy(xpath = "//input['//span[id=searchtxt]")
	WebElement search_text;
	
	@FindBy(xpath = "//table//tr")
	WebElement name_text;
	
	@FindBy(xpath = "//table//tr[2]")
	WebElement email_text;
	
	@FindBy(xpath = "//table//tr[3]")
	WebElement phone_text;
	
	@FindBy(xpath = "//table//tr[1]td")
	WebElement name_phone;
	
	@FindBy(xpath = "//table//tr[1]td[1]")
	WebElement name_email;
	
	@FindBy(xpath = "//table//tr")
	WebElement custid;
	
	@FindBy(xpath = "//table//tr")
	WebElement date;
	
	

	@FindBy(xpath = "//table//tr[1]td[2]")
	WebElement phone_email;
	
	@FindBy(xpath = "//input[@id=error")
	WebElement error_msg;
	
	@FindBy(xpath = "//table")
	WebElement table;
	@FindBy(xpath = "//table//tr[1]td")
	WebElement viewpreviousdateplan;

	
	
	public void clickSearchButton() {
		search.click();
	}
	
	public void enterIntoNameFilter(String password) {
		enterText(Name_filter, password);
	}
	
	public void enterIntoEmailAddressFilter(String password) {
		enterText(email_filter, password);
	}
	
	public void enterIntoPhoneNameFilter(String password) {
		enterText(phone, password);
	}
	
	public void enterIntoSearchFilter(String search1) {
		enterText(search, search1);
	}
	
	public void clickMyPatientButton() {
		My_patient.click();
	}
	
	public void enterIntoHitSearch(String s) {
		enterText(hit_search, s);
	}
	
	public void clickViewPDFButton() {
		view_PDF.click();
	}
	
	public void clickViewPreviousTestReportButton() {
		veiw_previous_test.click();
	}

	public void clickViewPreviousDietPlanButton() {
		veiw_previous_diet.click();
	}

	public void clickCreateNewReportButton() {
		create_new_report.click();
	}
	
	public String searchText() {
		return search_text.getText();
	}
	public String nameText() {
		return name_text.getText();
		
	}
	
	public String emailText() {
		return email_text.getText();
		
	}
	
	public String phoneText() {
		return phone_text.getText();
		
	}
	
	
	public String phonename() {
		return name_phone.getText();
		
	}
	
	public String emailname() {
		return name_email.getText();
		
	}
	
	
	public String phoneEmail() {
		return phone_email.getText();
		
	}
	
	public String ErrorMsg() {
		return error_msg.getText();
		
	}
	public String table() {
		return table.getText();
	}
	
	public String getCustID() {
		return custid.getText();
	}
	public String getDate() {
		return date.getText();
	}
	public String getviewText() {
		return veiw_previous_diet.getText();
	}
	
	
	
	
}

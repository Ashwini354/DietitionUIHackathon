package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.ApplicationUtils;

public class AddNewPatient extends ApplicationUtils{

	public AddNewPatient(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//div[@id='patient-form-heading']")
	WebElement headingAddPatient;	
	
	@FindBy(id="fullName")
	WebElement fullNameAddPatient;
	
	@FindBy(name="address1")
	WebElement address1AddPatient;
	
	@FindBy(name="address2")
	WebElement address2AddPatient;
	
	@FindBy(className="patient-country-dropdown")
	WebElement countryAddPatient;
	
	@FindBy(xpath = "//input[@name='cityName']")
	WebElement cityAddPatient;
	
	@FindBy(xpath = "//input[@id='stateName']")
	WebElement stateAddPatient;
	
	@FindBy(css = "[name='postalCode']")
	WebElement postalCodeAddPatient;
	
	@FindBy(css = "#email-id")
	WebElement emailAddPatient;
	
	@FindBy(css = "[name='phoneNumber']")
	WebElement phoneNumberAddPatient;
	
	@FindBy(xpath = "//div[@id='error-message']")
	WebElement errMsgAddPatient;
	
	@FindBy(xpath = "//div[@id='success-message']")
	WebElement successMsgAddPatient;
	
	@FindBy(css = ".btn")
	WebElement btnAddPatient;
	
	public String headingPatientForm() {
		return headingAddPatient.getText();
	}	
	
	public String fullNamePatientForm(String fullname) {
	    fullNameAddPatient.clear();
		fullNameAddPatient.sendKeys(fullname);
		return fullname;		
	}
		
	public String address1PatientForm(String address1) {
		address1AddPatient.clear();
		address1AddPatient.sendKeys(address1);
		return address1;
	}
		
	public String address2PatientForm(String address2) {
		address2AddPatient.clear();
		address2AddPatient.sendKeys(address2);
		return address2;
	}
		
	public String countryPatientForm(String countryName) {
	    Select dropdown;
	    dropdown = new Select(countryAddPatient);
	    dropdown.selectByValue(countryName);
		return countryName;

	}
		
	public String cityNamePatientForm(String cityName) {
		cityAddPatient.clear();
		cityAddPatient.sendKeys(cityName);
		return cityName;		
	}
	
	public String stateNamePatientForm(String stateName) {
		stateAddPatient.clear();
		stateAddPatient.sendKeys(stateName);
		return stateName;		
	}	
		
	public int postalCodePatientForm(int postalCode) {
		postalCodeAddPatient.clear();
		postalCodeAddPatient.sendKeys(String.valueOf(postalCode));
		return postalCode;		
	}
		
	public String emailIdPatientForm(String emailId) {
		emailAddPatient.clear();
		emailAddPatient.sendKeys(emailId);
		return emailId;		
	}
	
	public String phoneNumberPatientForm(String phone) {
		phoneNumberAddPatient.clear();
		phoneNumberAddPatient.sendKeys(String.valueOf(phone));
		return phone;		
	}
	
	public String errorMsgPatientForm() {
		return errMsgAddPatient.getText();
	}
	
	public String successMsgPatientForm() {
		return successMsgAddPatient.getText();
	}
	
	public void updatePatientBtn() {
		btnAddPatient.click();
	}
	
}

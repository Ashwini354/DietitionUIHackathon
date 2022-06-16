package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ApplicationUtils;

public class ContactUsPage extends ApplicationUtils{public ContactUsPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath = "//div[@class='heading']")
WebElement heading;	
@FindBy(xpath = "//div[@class='emailId']")
WebElement emailId;
@FindBy(xpath = "//div[@class='phoneNumber']")
WebElement phoneNumber;
@FindBy(xpath = "//div[@class='streetAddress']")
WebElement streetAddress;
@FindBy(xpath = "//div[@class='city']")
WebElement city;
@FindBy(xpath = "//div[@class='State-Zip-Country']")
WebElement stateNCountry;
@FindBy(xpath = "//input[@id='Submit']")
WebElement submitBtn;
@FindBy(xpath = "//input[@id='First Name']")
WebElement firstNameField;
@FindBy(xpath = "//input[@id='Last Name']")
WebElement lastNameField;
@FindBy(xpath = "//input[@id='Email']")
WebElement emailField;
@FindBy(xpath = "//input[@id='Subject']")
WebElement subjectField;
@FindBy(xpath = "//input[@id='Write Your Message']")
WebElement yourMessageField;
@FindBy(xpath = "//input[@id='Message Displayed']")
WebElement messageField;


public boolean headingVisibility() {
	return heading.isDisplayed();
}
public String headingText() {
	return heading.getText();		
}
public boolean emailIdVisibility() {
	return emailId.isDisplayed();
}
public String emailIdText() {
	return emailId.getText();		
}
public boolean phoneNumberVisibility() {
	return phoneNumber.isDisplayed();
}
public String phoneNumberText() {
	return phoneNumber.getText();		
}
public boolean streetAddressVisibility() {
	return streetAddress.isDisplayed();
}
public String streetAddressText() {
	return streetAddress.getText();		
}
public boolean cityVisibility() {
	return city.isDisplayed();
}
public String cityText() {
	return city.getText();		
}

public boolean stateNCountryVisibility() {
	return stateNCountry.isDisplayed();
}
public String stateNCountryText() {
	return stateNCountry.getText();		
}
public boolean submitBtnVisibility() {
	return submitBtn.isDisplayed();
}
public String submitBtnText() {
	return submitBtn.getText();		
}
public String messageFieldText() {
	return messageField.getText();		
}
public void submitForm(String firstName, String lastName, String email, String subject, String yourMessage) { 
	firstNameField.sendKeys(firstName);
	lastNameField.sendKeys(lastName);
	emailField.sendKeys(email);
	subjectField.sendKeys(subject);
	yourMessageField.sendKeys(yourMessage);
	submitBtn.click();	
}
}

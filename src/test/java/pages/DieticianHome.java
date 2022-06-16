package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.Select;

import utilities.ApplicationUtils;

public class DieticianHome extends ApplicationUtils{

	public DieticianHome(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath = "//div[@id='dietician-home-heading']")
	WebElement dieticianHomeHeading;
	
	@FindBy(xpath = "//div[@id='new-patient-heading']")
	WebElement newPatientHeading;
	
	@FindBy(xpath = "//div[@id='my-patient-heading']")
	WebElement myPatientHeading;
	
	@FindBy(xpath = "//div[@id='diet-plans-heading']")
	WebElement dietPlansHeading;
	
	@FindBy(xpath = "//div[@id='dietician-home-menu']")
	WebElement dieticianHomeMenu;
	
	@FindBy(xpath = "//div[@id='new-patient-menu']")
	WebElement newPatientMenu;
	
	@FindBy(xpath = "//div[@id='my-patient-menu']")
	WebElement myPatientMenu;
	
	@FindBy(xpath = "//div[@id='diet-plans-menu']")
	WebElement dietPlansMenu;
	
	@FindBy(name="banner")
	WebElement sidebarBanner;
	
	@FindBy(className="logged-in-name")
	WebElement loggedInName;
	
	@FindBy(xpath = "//div[@id='dietician-home-content']")
	WebElement dieticianHomeContent;
	
	@FindBy(css = ".logout-btn")
	WebElement btnLogOut;
	
	@FindBy(className="logged-out-msg")
	WebElement loggedOutMsg;
	
	
	// Dietician Menu Item Heading
	public String headingDieticianHome() {
		return dieticianHomeHeading.getText();
	}	
	
	public String headingNewPatient() {
		return newPatientHeading.getText();
	}	
	
	public String headingMyPatient() {
		return myPatientHeading.getText();
	}
	
	public String headingDietPlans() {
		return dietPlansHeading.getText();
	}
	
	// Dietician Menu Tab Clicks
	public void clickDieticianHome() {
		dieticianHomeMenu.click();
	}	
	
	public void clickNewPatient() {
		newPatientMenu.click();
	}	
	
	public void clickMyPatient() {
		myPatientMenu.click();
	}
	
	public void clickDietPlans() {
		dietPlansMenu.click();
	}
	
	// Dietician Menu Tab Names
	public String tabNameDieticianHome() {
		return dieticianHomeMenu.getText();
	}	
	
	public String tabNameNewPatient() {
		return newPatientMenu.getText();
	}	
	
	public String tabNameMyPatient() {
		return myPatientMenu.getText();
	}
	
	public String tabNameDietPlans() {
		return dietPlansMenu.getText();
	}
	
	public boolean dietPlansMenuIsSelected(){
		return dietPlansMenu.isSelected();
	}
	
	// Dietician Sidebar Banner
	public String dieticiansidebarBanner() {
		return sidebarBanner.getText();
	}
	
	// Dietician Logged In User Name
	public String dieticianLoggedInName() {
		return loggedInName.getText();
	}
	
	// Dietician Home Content
	public String dieticianContentHome() {
		return dieticianHomeContent.getText();
	}
	
	// Dietician Log Out
	public void dieticianLogOutBtn() {
		btnLogOut.click();
	}
	
	// Dietician Log Out Message
	public String dieticianLogOutMsg() {
		return loggedOutMsg.getText();
	}
	
}

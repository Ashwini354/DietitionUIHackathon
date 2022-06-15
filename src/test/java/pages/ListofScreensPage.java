package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ApplicationUtils;

public class ListofScreensPage extends ApplicationUtils {

	public ListofScreensPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[@class='screens']")
	WebElement screensLink;
	@FindBy(xpath = "//a[@class='screensmenu']")
	WebElement screensMenu;
	@FindBy(xpath = "//div[@class='heading']")
	WebElement heading;
	@FindBy(xpath = "//div[@class='heading-public']")
	WebElement headingPublic;
	@FindBy(xpath = "//div[@class='heading-Dietician']")
	WebElement headingDietician;
	@FindBy(linkText="User Sign In")
	WebElement userSignInLink;
	@FindBy(linkText="Register")
	WebElement registerLink;
	@FindBy(linkText="Team")
	WebElement teamLink;
	@FindBy(linkText="Testimonials")
	WebElement testimonialsLink;
	@FindBy(linkText="Forgot Password")
	WebElement forgotPasswordLink;
	@FindBy(linkText="Product Features")
	WebElement productFeaturesLink;
	@FindBy(linkText="Contact")
	WebElement contactLink;
	@FindBy(linkText="Blog")
	WebElement blogLink;
	@FindBy(linkText="Featured Content")
	WebElement featuredContentLink;
	@FindBy(linkText="Home")
	WebElement homeLink;
	@FindBy(linkText="View Recent Diets")
	WebElement viewRecentDietsLink;
	@FindBy(linkText="View Recent Test Reports")
	WebElement viewRecentTestReportsLink;
	@FindBy(linkText="Add New Patient")
	WebElement addNewPatientLink;
	@FindBy(linkText="Dieticin Home")
	WebElement dieticianHomeLink;
	@FindBy(linkText="My Patients")
	WebElement myPatientsLink;
	@FindBy(linkText="Confirm Conditions and Create Plan")
	WebElement createPlanLink;
	
	
	public boolean screensLinkVisibility() {
		return screensLink.isDisplayed();
	}
	public void screensLinkClick() {
		screensLink.click();
	}
	public boolean screensMenuVisibility() {
		return screensMenu.isDisplayed();
	}
	public boolean headingVisibility() {
		return heading.isDisplayed();
	}
	public String headingText() {
		return heading.getText();
	}
	public boolean headingPublicVisibility() {
		return headingPublic.isDisplayed();
	}
	public String headingPublicText() {
		return headingPublic.getText();
	}
	public boolean headingDieticianVisibility() {
		return headingDietician.isDisplayed();
	}
	public String headingDieticianText() {
		return headingDietician.getText();
	}
	public boolean userSignInLinkVisibility() {
		return userSignInLink.isDisplayed();
	}
	public String userSignInLinkText() {
		return userSignInLink.getText();
	}
	public void userSignInLinkClick() {
		userSignInLink.click();
	}
	public boolean registerLinkVisibility() {
		return registerLink.isDisplayed();
	}
	public String registerLinkText() {
		return registerLink.getText();
	}
	public void registerLinkClick() {
		registerLink.click();
	}
	public boolean teamLinkVisibility() {
		return teamLink.isDisplayed();
	}
	public String teamLinkText() {
		return teamLink.getText();
	}
	public void teamLinkClick() {
		teamLink.click();
	}
	public boolean testimonialsLinkVisibility() {
		return testimonialsLink.isDisplayed();
	}
	public String testimonialsLinkText() {
		return testimonialsLink.getText();
	}
	public void testimonialsLinkClick() {
		testimonialsLink.click();
	}
	public boolean forgotPasswordLinkVisibility() {
		return forgotPasswordLink.isDisplayed();
	}
	public String forgotPasswordLinkText() {
		return forgotPasswordLink.getText();		
	}
	public void forgotPasswordLinkClick() {
		forgotPasswordLink.click();
	}
	public boolean productFeaturesLinkVisibility() {
		return productFeaturesLink.isDisplayed();
	}
	public String productFeaturesLinkText() {
		return productFeaturesLink.getText();
	}
	public void productFeaturesLinkClick() {
		productFeaturesLink.click();
	}
	public boolean contactLinkVisibility() {
		return contactLink.isDisplayed();
	}
	public String contactLinkText() {
		return contactLink.getText();
	}
	public void contactLinkClick() {
		contactLink.click();
	}
	public boolean blogLinkVisibility() {
		return blogLink.isDisplayed();
	}
	public String blogLinkText() {
		return blogLink.getText();
	}	
	public void blogLinkClick() {
		blogLink.click();
	}
	public boolean featuredContentLinkVisibility() {
		return featuredContentLink.isDisplayed();
	}
	public String featuredContentLinkText() {
		return featuredContentLink.getText();		
	}	
	public void featuredContentLinkClick() {
		featuredContentLink.click();
	}
	public boolean homeLinkVisibility() {
		return homeLink.isDisplayed();
	}
	public String homeLinkText() {
		return homeLink.getText();
	}
	public void homeLinkClick() {
		homeLink.click();
	}
	public boolean viewRecentDietsLinkVisibility() {
		return viewRecentDietsLink.isDisplayed();
	}
	public String viewRecentDietsLinkText() {
		return viewRecentDietsLink.getText();
	}
	public void viewRecentDietsLinkClick() {
		viewRecentDietsLink.click();
	}
	public boolean viewRecentTestReportsLinkVisibility() {
		return viewRecentTestReportsLink.isDisplayed();
	}
	
	public String viewRecentTestReportsLinkText() {
		return viewRecentTestReportsLink.getText();
	}
	public void viewRecentTestReportsLinkClick() {
		viewRecentTestReportsLink.click();
	}
	public boolean addNewPatientLinkVisibility() {
		return addNewPatientLink.isDisplayed();
	}
	public String addNewPatientLinkText() {
		return addNewPatientLink.getText();
	}
	public void addNewPatientLinkClick() {
		addNewPatientLink.click();
	}
	public boolean dieticianHomeLinkVisibility() {
		return dieticianHomeLink.isDisplayed();
	}
	public String dieticianHomeLinkText() {
		return dieticianHomeLink.getText();
	}
	public void dieticianHomeLinkClick() {
		dieticianHomeLink.click();
	}
	public boolean myPatientsLinkVisibility() {
		return myPatientsLink.isDisplayed();
	}
	public String myPatientsLinkText() {
		return myPatientsLink.getText();
	}
	public void myPatientsLinkClick() {
		myPatientsLink.click();
	}
	public boolean createPlanLinkVisibility() {
		return createPlanLink.isDisplayed();
	}
	public String createPlanLinkText() {
		return createPlanLink.getText();
	}
	public void createPlanLinkClick() {
		createPlanLink.click();
	}
	

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ApplicationUtils;

public class ViewPdfPage extends ApplicationUtils{

	public ViewPdfPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//div[@class='heading-patient details']")
	WebElement headingPatientDetails;
	@FindBy(xpath = "//div[@class='heading-doctor details']")
	WebElement headingDoctorDetails;
	@FindBy(xpath = "//div[@class='heading-patient health details']")
	WebElement headingPatientHealthDetails;
	@FindBy(xpath = "//div[@class='heading-7 days menu']")
	WebElement headingSevenDaysMenu;
	@FindBy(xpath = "//div[@class='heading-warnings']")
	WebElement headingwarnings;
	@FindBy(xpath = "//div[@class='heading-comments']")
	WebElement headingComments;
	@FindBy(xpath = "//input[@id='downloadpdf']")
	WebElement downloadPdf;
	
	public boolean headingPatientDetailsVisibility() {
		return headingPatientDetails.isDisplayed();
	}
	public boolean headingDoctorDetailsVisibility() {
		return headingDoctorDetails.isDisplayed();
	}
	public boolean headingPatientHealthDetailsVisibility() {
		return headingPatientHealthDetails.isDisplayed();
	}
	public boolean headingSevenDaysMenuVisibility() {
		return headingSevenDaysMenu.isDisplayed();
	}
	public boolean headingwarningsVisibility() {
		return headingwarnings.isDisplayed();
	}
	public boolean headingCommentsVisibility() {
		return headingComments.isDisplayed();
	}
	public boolean downloadPdfVisibility() {
		return downloadPdf.isDisplayed();
	}

}

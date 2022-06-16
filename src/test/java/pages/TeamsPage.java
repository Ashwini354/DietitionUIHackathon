package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
//import org.openqa.selenium.support.ui.Select;

import utilities.ApplicationUtils;

public class TeamsPage extends ApplicationUtils{

	public String pageTitle;
	public TeamsPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath = "//div[@id='team-heading']")
	WebElement teamHeading;
	
	@FindBy(xpath = "//div[@id='team-menu']")
	WebElement teamMenu;
	
	@FindBy(xpath = "//div[@id='team-doctor-name']")
	WebElement teamDoctorName;
	
	@FindBys({@FindBy(id="team-doctor-name")})
	public List<WebElement>doctorName;
	
	
	@FindBy(id="next-arrow")
	WebElement nextArrowTeam;
	
	@FindBy(xpath = "//div[@id='next-doctor-name']")
	WebElement teamNextDoctorName;
	
	@FindBy(xpath = "//div[@id='next-page-doctor']")
	WebElement teamNextPageDoctor;
	
	@FindBy(id="previous-arrow")
	WebElement previousArrowTeam;
	
	@FindBy(xpath = "//div[@id='previous-doctor-name']")
	WebElement teamPreviousDoctorName;
	
	
	public String headingTeam() {
		return teamHeading.getText();
	}
	
	public void clickTeamMenu() {
		teamMenu.click();
	}
	
	public String doctorNameTeam() {
		return teamDoctorName.getText();
	}
	
	
	public int getDoctorCount() {
		return doctorName.size();
	}
	
	public void clickNextArrow() {
		nextArrowTeam.click();
	}
	
	
	public boolean isEnabledNextArrow() {
		return nextArrowTeam.isEnabled();
	}
	
	public String nextDoctorNameTeam() {
		return teamNextDoctorName.getText();
	}
	
	public String nextPageDoctorTeam() {
		return teamNextPageDoctor.getText();
	}
	

	public void clickPreviousArrow() {
		previousArrowTeam.click();
	}
	
	public boolean isEnabledPreviousArrow() {
		return previousArrowTeam.isEnabled();
	}
	
	public String previousDoctorNameTeam() {
		return teamPreviousDoctorName.getText();
	}


	
}

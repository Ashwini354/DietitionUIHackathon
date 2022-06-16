package stepDefinitions;
import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TeamsPage;

public class TeamsSteps {

	
private TeamsPage teamsPage= new TeamsPage(DriverFactory.getDriver());


	@Given("User is on Dietician Website")
	public void user_is_on_dietician_website() {
		DriverFactory.getDriver().get("http://www.xyzdietician.com/");
	}
	
	@When("User lands on Teams page")
	public void user_lands_on_teams_page() {
		
    	String tabNameTeam = teamsPage.headingTeam();
		if(tabNameTeam=="TEAM") {
			teamsPage.clickTeamMenu();
		}
	}
	
	@Then("User sees Doctor's name on Doctor team page")
	public void user_sees_doctor_s_name_on_doctor_team_page() {
		
		String headingText = "Name Last Name";
		String expectedHeading = teamsPage.doctorNameTeam();
		Assert.assertEquals(headingText, expectedHeading);
	}
	
	@Then("User should see {int} default Doctor names on first Page")
	public void user_should_see_default_doctor_names_on_first_page(int int1) {
		
		int doctorCount = teamsPage.getDoctorCount();
		Assert.assertEquals(doctorCount, int1);
	}
	
	@Given("User is on Team page")
	public void user_is_on_team_page() {
		DriverFactory.getDriver().get("http://www.xyzdietician.com/teams/");
	}
	
	@When("User clicks on next button \\(>)")
	public void user_clicks_on_next_button() {
		teamsPage.clickNextArrow();
	}
	
	@Then("User should be directed to next Doctor on Team Page")
	public void user_should_be_directed_to_next_doctor_on_team_page() {
		
		String headingText = "Name Last Name";
		String expectedHeading = teamsPage.nextDoctorNameTeam();
		Assert.assertEquals(headingText, expectedHeading);
	}
	
	
	@When("User clicks on previous button \\(<)")
	public void user_clicks_on_previous_button() {
		teamsPage.clickPreviousArrow();
	}
	
	@Then("User should be directed to previous page of Team")
	public void user_should_be_directed_to_previous_page_of_team() {
		
		String headingText = "Name Last Name";
		String expectedHeading = teamsPage.previousDoctorNameTeam();
		Assert.assertEquals(headingText, expectedHeading);		
	}



}

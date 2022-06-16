package stepDefinitions;
import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DieticianHome;

public class DieticianHomeSteps {

	
private DieticianHome dieticianHomepage= new DieticianHome(DriverFactory.getDriver());
private SignInPage signinpage = new SignInPage(DriverFactory.getDriver());

	@Given("User is on the Dietician website")
	public void user_is_on_the_dietician_website() {
		DriverFactory.getDriver().get("http://www.xyzdietician.com");
	}
	
	@When("User logged in successfully to the Dietician website")
	public void user_logged_in_successfully_to_the_dietician_website() {
		signinpage.SignIn();
	}
	
	@Then("User can see the Home button on header menu")
	public void user_can_see_the_home_button_on_header_menu() {
		String headingTextHome = "Home";
		String expectedHeadingHome = dieticianHomepage.headingDieticianHome();
		Assert.assertEquals(headingTextHome, expectedHeadingHome);
	}
	
	@Then("User can see the New Patient tab from the header menu")
	public void user_can_see_the_new_patient_tab_from_the_header_menu() {
		String headingTextNewPatient = "New Patient";
		String expectedHeadingNewPatient = dieticianHomepage.headingNewPatient();
		Assert.assertEquals(headingTextNewPatient, expectedHeadingNewPatient);
	}
	
	@Then("User can see the My Patient tab from the header menu")
	public void user_can_see_the_my_patient_tab_from_the_header_menu() {
		String headingTextMyPatient = "My Patient";
		String expectedHeadingMyPatient = dieticianHomepage.headingMyPatient();
		Assert.assertEquals(headingTextMyPatient, expectedHeadingMyPatient);
	}
	
	@Then("User can see the Diet Plans tab from the header menu")
	public void user_can_see_the_diet_plans_tab_from_the_header_menu() {
		String headingTextDietPlans = "Diet Plans";
		String expectedHeadingDietPlans = dieticianHomepage.headingDietPlans();
		Assert.assertEquals(headingTextDietPlans, expectedHeadingDietPlans);
	}
	
	@Given("User is on the Dietician Home page")
	public void user_is_on_the_dietician_home_page() {
		DriverFactory.getDriver().get("http://www.xyzdietician.com/dietician-home/");
	}
	
	@When("User selects Home button")
	public void user_selects_home_button() {
		String tabNameDieticianHome = dieticianHomepage.tabNameDieticianHome();
		if(tabNameDieticianHome=="Home") {
			dieticianHomepage.clickDieticianHome();
		}
	}
	
	@Then("User lands on Home page")
	public void user_lands_on_home_page() {
		String headingTextHome = "Home";
		String expectedHeadingHome = dieticianHomepage.headingDieticianHome();
		Assert.assertEquals(headingTextHome, expectedHeadingHome);
	}
	
	@When("User selects New patient button")
	public void user_selects_new_patient_button() {
		String tabNameNewPatient = dieticianHomepage.tabNameNewPatient();
		if(tabNameNewPatient=="New Patient") {
			dieticianHomepage.clickNewPatient();
		}
	}
	
	@Then("User lands on New Patient page")
	public void user_lands_on_new_patient_page() {
		String headingTextNewPatient = "New Patient";
		String expectedHeadingNewPatient = dieticianHomepage.headingNewPatient();
		Assert.assertEquals(headingTextNewPatient, expectedHeadingNewPatient);
	}
	
	@When("User selects My Patient button")
	public void user_selects_my_patient_button() {
		String tabNameMyPatient = dieticianHomepage.tabNameMyPatient();
		if(tabNameMyPatient=="My Patient") {
			dieticianHomepage.clickMyPatient();
		}
	}
	
	@Then("User lands on My Patient page")
	public void user_lands_on_my_patient_page() {
		String headingTextMyPatient = "My Patient";
		String expectedHeadingMyPatient = dieticianHomepage.headingMyPatient();
		Assert.assertEquals(headingTextMyPatient, expectedHeadingMyPatient);
	}
	
	@When("User selects Diet Plans button")
	public void user_selects_diet_plans_button() {
		String tabNameDietPlans = dieticianHomepage.tabNameDietPlans();
		if(tabNameDietPlans=="Diet Plans") {
			dieticianHomepage.clickDietPlans();
		}
	}
	
	@Then("User lands on Diet Plans page")
	public void user_lands_on_diet_plans_page() {
		String headingTextDietPlans = "Diet Plans";
		String expectedHeadingDietPlans = dieticianHomepage.headingDietPlans();
		Assert.assertEquals(headingTextDietPlans, expectedHeadingDietPlans);
	}
	
	@Then("User can see Banner or Announcements section in right side bar")
	public void user_can_see_banner_or_announcements_section_in_right_side_bar() {
		String pageText = dieticianHomepage.dieticiansidebarBanner();
		String expectedText = "Banner or announcements wii go in this page";
		Assert.assertEquals(pageText, expectedText);
	}
	
	@Then("User can see Logged in as Dietician name message in top of right side bar")
	public void user_can_see_logged_in_as_dietician_name_message_in_top_of_right_side_bar() {
		String pageText = dieticianHomepage.dieticianLoggedInName();
		String expectedText = "Logged in as Dietcian Name";
		Assert.assertEquals(pageText, expectedText);	    
	}
	
	@Then("User can read Dietician Home page image and content")
	public void user_can_read_dietician_home_page_image_and_content() {
		String pageText = dieticianHomepage.dieticianContentHome();
		String expectedText = "Lorem ipsum";
		Assert.assertEquals(pageText, expectedText);	    
	}
	
	@When("User can see SIGN OUT button after successful login")
	public void user_can_see_sign_out_button_after_successful_login() {
		dieticianHomepage.dieticianLogOutBtn();
	}
	
	@Then("User can click on SIGN OUT button for logging off successfully")
	public void user_can_click_on_sign_out_button_for_logging_off_successfully() {
		String pageText = dieticianHomepage.dieticianLogOutMsg();
		String expectedText = "Logged Out Successfully";
		Assert.assertEquals(pageText, expectedText);
	}

	



}

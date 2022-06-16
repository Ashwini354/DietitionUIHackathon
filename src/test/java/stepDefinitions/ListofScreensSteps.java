package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ListofScreensPage;

public class ListofScreensSteps {
	private WebDriver driver = DriverFactory.getDriver();
	private ListofScreensPage screens= new ListofScreensPage(driver);
	String url = "http://www.xyzdietician.com/";
	private SigninPage signin= new SigninPage(driver);
	private HomePage home= new HomePage(driver);
	private static String[] titleOfPagePublic = new String[9];
	private static String[] titleOfPageDietician = new String[6];
	
	@When("User is on Dietician website")
	public void user_is_on_dietician_website() {
		driver.get(url);;
	}
	
	@Given("User is signed into Dietician website")
	public void user_is_signed_into_dietician_website() {
		//Selecting the Sign in link from Home page
		home.clickSigninMenu();
		//Sign In with valid credentials
		signin.SignIn("admin","password");
	}
	
	@Then("User should see a link with three horizontal lines on the Home page")
	public void user_should_see_a_link_with_three_horizontal_lines_on_the_home_page() {
		Assert.assertEquals(screens.screensLinkVisibility(), "True");		
	}
	
	@When("User selects the link with three horizontal lines on top right corner")
	public void user_selects_the_link_with_three_horizontal_lines_on_top_right_corner() {
		screens.screensLinkClick();
	}
	@Then("User should see a menu with list of clickable links is displayed")
	public void user_should_see_a_menu_with_list_of_clickable_links_is_displayed() {
		Assert.assertEquals(screens.screensMenuVisibility(), "True");	
	}
	@Then("User should see name on the list of screens as Screens")
	public void user_should_see_name_on_the_list_of_screens_as_screens() {
		Assert.assertEquals(screens.headingVisibility(), "True");
		Assert.assertEquals(screens.headingText(), "Screens");
	}
	@Then("User should see a heading with text Public in the menu")
	public void user_should_see_a_heading_with_text_public_in_the_menu() {
		Assert.assertEquals(screens.headingPublicVisibility(), "True");
		Assert.assertEquals(screens.headingPublicText(), "Public");		
	}
	@Then("User should see a heading with text Dietician in the menu")
	public void user_should_see_a_heading_with_text_dietician_in_the_menu() {
		Assert.assertEquals(screens.headingDieticianVisibility(), "True");
		Assert.assertEquals(screens.headingDieticianText(), "Public");			
	}
	@Then("User should see a link with text {string} in the Screens menu")
	public void user_should_see_a_link_with_text_in_the_screens_menu(String linkName) {
		switch(linkName) {
		case "User Sign In": 
			Assert.assertEquals(screens.userSignInLinkVisibility(), "True");
			Assert.assertEquals(screens.userSignInLinkText(), "User Sign In");	
		case "Register": 
			Assert.assertEquals(screens.registerLinkVisibility(), "True");
			Assert.assertEquals(screens.registerLinkText(), "Register");
		case "Team": 
			Assert.assertEquals(screens.teamLinkVisibility(), "True");
			Assert.assertEquals(screens.teamLinkText(), "Team");
		case "Testimonials": 
			Assert.assertEquals(screens.testimonialsLinkVisibility(), "True");
			Assert.assertEquals(screens.testimonialsLinkText(), "Testimonials");
		case "Forgot Password": 
			Assert.assertEquals(screens.forgotPasswordLinkVisibility(), "True");
			Assert.assertEquals(screens.forgotPasswordLinkText(), "Forgot Password");
		case "Product Features": 
			Assert.assertEquals(screens.productFeaturesLinkVisibility(), "True");
			Assert.assertEquals(screens.productFeaturesLinkText(), "Product Features");
		case "Contact": 
			Assert.assertEquals(screens.contactLinkVisibility(), "True");
			Assert.assertEquals(screens.contactLinkText(), "Contact");
		case "Blog": 
			Assert.assertEquals(screens.blogLinkVisibility(), "True");
			Assert.assertEquals(screens.blogLinkText(), "Blog");
		case "Featured Content": 
			Assert.assertEquals(screens.featuredContentLinkVisibility(), "True");
			Assert.assertEquals(screens.featuredContentLinkText(), "Featured Content");
		case "Home": 
			Assert.assertEquals(screens.homeLinkVisibility(), "True");
			Assert.assertEquals(screens.homeLinkText(), "Home");
		case "View Recent Diets": 
			Assert.assertEquals(screens.viewRecentDietsLinkVisibility(), "True");
			Assert.assertEquals(screens.viewRecentDietsLinkText(), "View Recent Diets");
		case "View Recent Test Reports": 
			Assert.assertEquals(screens.viewRecentTestReportsLinkVisibility(), "True");
			Assert.assertEquals(screens.viewRecentTestReportsLinkText(), "View Recent Test Reports");
		case "Add New Patient": 
			Assert.assertEquals(screens.addNewPatientLinkVisibility(), "True");
			Assert.assertEquals(screens.addNewPatientLinkText(), "Add New Patients");
		case "Dietician Home": 
			Assert.assertEquals(screens.dieticianHomeLinkVisibility(), "True");
			Assert.assertEquals(screens.dieticianHomeLinkText(), "Dietician Home");
		case "My Patients": 
			Assert.assertEquals(screens.myPatientsLinkVisibility(), "True");
			Assert.assertEquals(screens.myPatientsLinkText(), "My Patients");
		case "Confirm COnditions and Create Plan": 
			Assert.assertEquals(screens.createPlanLinkVisibility(), "True");
			Assert.assertEquals(screens.createPlanLinkText(), "Confirm COnditions and Create Plan");
		}

		}
	
	@When("User selects the link {string} from the Public menu of Screens")
	public void user_selects_the_link_from_the_public_menu_of_screens(String publicLink) {
		switch(publicLink) {
		case "User Sign In":
			screens.userSignInLinkClick();
			titleOfPagePublic[0] = driver.getTitle();
		case "Register"	: 
			screens.registerLinkClick();
			titleOfPagePublic[1] = driver.getTitle();							
		case "Team"	: 
			screens.teamLinkClick();
			titleOfPagePublic[2] = driver.getTitle();		
		case "Testimonials"	: 
			screens.testimonialsLinkClick();
			titleOfPagePublic[3] = driver.getTitle();	
		case "Forgot Password"	: 
			screens.forgotPasswordLinkClick();
			titleOfPagePublic[3] = driver.getTitle();	
		case "Product Features"	: 
			screens.productFeaturesLinkClick();
			titleOfPagePublic[4] = driver.getTitle();
		case "Contact"	: 
			screens.contactLinkClick();
			titleOfPagePublic[5] = driver.getTitle();
		case "Blogs"	: 
			screens.blogLinkClick();
			titleOfPagePublic[6] = driver.getTitle();
		case "Featured Content"	: 
			screens.featuredContentLinkClick();
			titleOfPagePublic[7] = driver.getTitle();
		case "Home"	: 
			screens.homeLinkClick();
			titleOfPagePublic[8] = driver.getTitle();
		}
	}
	@Then("User is re-directed to the public page {string}")
	public void user_is_re_directed_to_the_public_page(String titlePublic) {
		for (int i=0; i<8; i++) {
			Assert.assertEquals(titleOfPagePublic[i], titlePublic);
		}		
	}
	
	@When("User selects the link {string} from the Dietician menu of Screens")
	public void user_selects_the_link_from_the_dietician_menu_of_screens(String dieticianLink) {
	switch(dieticianLink) {
	case "View Recent Diets": 
		screens.viewRecentDietsLinkClick();
		titleOfPageDietician[0] = driver.getTitle();
	case "View Recent Test Reports": 
		screens.viewRecentTestReportsLinkClick();
		titleOfPageDietician[1] = driver.getTitle();	
	case "Add New Patient": 
		screens.addNewPatientLinkClick();
		titleOfPageDietician[2] = driver.getTitle();
	case "Dietician Home": 
		screens.dieticianHomeLinkClick();
		titleOfPageDietician[3] = driver.getTitle();
	case "My Patients": 
		screens.myPatientsLinkClick();
		titleOfPageDietician[4] = driver.getTitle();
	case "Confirm Conditions and Create Plan": 
		screens.createPlanLinkClick();
		titleOfPageDietician[5] = driver.getTitle();
		}
	}
	@Then("User is re-directed to SignIn page")
	public void user_is_re_directed_to_signin_page() {
		for (int i=0; i<5; i++) {
			Assert.assertEquals(titleOfPageDietician[i], "Sign In");
		}		
		
	}
	@Then("User is re-directed to the Dietician page {string}")
	public void user_is_re_directed_to_page(String titleDietician) {
		for (int i=0; i<5; i++) {
			Assert.assertEquals(titleOfPageDietician[i], titleDietician);
		}
		
	}
	

	
}

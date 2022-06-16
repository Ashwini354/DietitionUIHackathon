package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DietPlansPage;
import pages.ViewPdfPage;


public class DietPlansSteps {
	private WebDriver driver = DriverFactory.getDriver();
	private DietPlansPage dietPlanPage= new DietPlansPage(driver);
	private DieticianHome dieticianHome= new DieticianHome(driver);
	private SigninPage signin= new SigninPage(driver);
	private HomePage home= new HomePage(driver);
	private ViewPdfPage viewpdf= new ViewPdfPage(driver);
	String url = "http://www.xyzdietician.com/";
	
	@Given("User is on signin page")
	public void user_is_on_signin_page() {
		driver.get(url);
		//Selecting the Sign in link from Home page
		home.clickSigninMenu();			
	}
	
	@When("User clicks the signin button by entering the valid credentials")
	public void user_clicks_the_signin_button_by_entering_the_valid_credentials() {
		//Sign In with valid credentials
		signin.SignIn("admin","password");		
	}	
	
	@When("User is on View Recent Diets Page")
	public void user_is_on_view_recent_diets_page() {	
		dieticianHome.clickDietPlans();
	}
	
	@Then("User should see the heading Generated Diet Plans on the page")
	public void user_should_see_the_heading_generated_diet_plans_on_the_page() {
		Assert.assertEquals(dietPlanPage.headingText(), "Generated Diet Plans");
	}
	
	@Then("User should see that Diet Plans tab on the menu bar is selected")
	public void user_should_see_that_diet_plans_tab_on_the_menu_bar_is_selected() {
		Assert.assertEquals(dieticianHome.dietPlansMenuIsSelected(), "True");
	}
	
	@Then("View PDF button is available for the generated diet plans")
	public void view_pdf_button_is_available_for_the_generated_diet_plans() {
		Assert.assertEquals(dietPlanPage.viewpdfBtnVisibility(), "True");
		Assert.assertEquals(dietPlanPage.viewpdfBtnText(), "View PDF");
	}
	
	@Then("User should see a next page button shown as > on the page")
	public void user_should_see_a_next_button_shown_on_the_page() {
		Assert.assertEquals(dietPlanPage.nextBtnVisibility(), "True");
		Assert.assertEquals(dietPlanPage.nextBtnText(), ">");
	}
	
	@Then("User should see a next page button shown as < on the page")
	public void user_should_see_a_previous_button_shown_on_the_page() {
		Assert.assertEquals(dietPlanPage.previousBtnVisibility(), "True");
		Assert.assertEquals(dietPlanPage.previousBtnText(), "<");
	}
	
	@Then("User should see five records per page")
	public void user_should_see_five_records_per_page() {
		Assert.assertEquals(dietPlanPage.getRowSize(), "5");
	}
	
	@Given("User is viewing first page of records in the View Recent Diets Page")
	public void user_is_viewing_first_page_of_records_in_the_view_recent_diets_page() {
		Assert.assertEquals(dietPlanPage.getCurrentPage(), "1");
	}
	
	@When("User selects the next page button \\(>)")
	public void user_selects_the_next_page_button() {
		dietPlanPage.nextBtnClick();
	}
	
	@Then("User should see the second page")
	public void user_should_see_the_second_page() {
		Assert.assertEquals(dietPlanPage.getCurrentPage(), "2");
	}
	
	@Given("User is viewing second page of records in the View Recent Diets Page")
	public void user_is_viewing_second_page_of_records_in_the_View_Recent_Diets_page() {
		Assert.assertEquals(dietPlanPage.getCurrentPage(), "2");
	}
	
	@When("User selects the previous page button \\(<)")
	public void user_selects_the_previous_page_button() {
		dietPlanPage.previousBtnClick();
	}
	
	@When("User selects the View PDF button for a generated diet plan")
	public void user_selects_the_view_pdf_button_for_a_generated_diet_plan() {
		dietPlanPage.viewpdfBtnClick();
	}
	
	@Then("User should see the first page")
	public void user_should_see_the_first_page() {
		Assert.assertEquals(dietPlanPage.getCurrentPage(), "1");
	}
	
	@Then("User should see the headings Patient details, Doctor details, Patient health details, 7-day menu, warnings, commentsin the pdf")
	public void user_should_see_the_headings_for_the_generated_pdf() {
		Assert.assertEquals(viewpdf.headingPatientDetailsVisibility(), "True");
		Assert.assertEquals(viewpdf.headingDoctorDetailsVisibility(), "True");
		Assert.assertEquals(viewpdf.headingPatientHealthDetailsVisibility(), "True");
		Assert.assertEquals(viewpdf.headingSevenDaysMenuVisibility(), "True");
		Assert.assertEquals(viewpdf.headingwarningsVisibility(), "True");
		Assert.assertEquals(viewpdf.headingCommentsVisibility(), "True");
	}
	@Then("User should see download button for the PDF")
	public void user_should_see_the_downlaod_button_for_the_pdf() {
		Assert.assertEquals(viewpdf.downloadPdfVisibility(), "1");
	}	
	
}

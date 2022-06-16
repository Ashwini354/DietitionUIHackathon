package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.DriverFactory;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GenerateNewDietPlansPage;
import pages.ListofScreensPage;


public class GenerateNewDietPlanSteps {
	private WebDriver driver = DriverFactory.getDriver();
	private GenerateNewDietPlansPage createPlanPage= new GenerateNewDietPlansPage(driver);
	private ListofScreensPage listofScreens= new ListofScreensPage(driver);	
	String url = "http://www.xyzdietician.com/";
	

	@Then("User should land on Dietician Home page")
	public void user_should_land_on_dietician_home_page() {
		Assert.assertEquals(driver.getTitle(), "Dietician Home");
	}
	
	@Then("User sees the heading Confirm Health Conditions and Generate a new Diet Plan on the page")
	public void user_sees_the_heading_confirm_health_conditions_and_generate_a_new_diet_plan_on_the_page() {
		Assert.assertEquals(createPlanPage.headingText(), "Confirm Health Conditions and Generate a new Diet Plan");
	}
	
	@Then("User should see a button with name Browse on the page")
	public void user_should_see_a_button_with_name_browse_on_the_page() {
		Assert.assertEquals(createPlanPage.browseBtnVisibility(), true);
		Assert.assertEquals(createPlanPage.browseBtnText(), "Browse");		
	}
	
	@Then("User should see a button with name Upload on the page")
	public void user_should_see_a_button_with_name_upload_on_the_page() {
		Assert.assertEquals(createPlanPage.uploadBtnVisibility(), true);
		Assert.assertEquals(createPlanPage.uploadBtnText(), "Upload");			
	}
	
	@Then("User should see heading with text option {int} to update the health conditions")
	public void user_should_see_heading_with_text_option_to_update_the_health_conditions(Integer number) {
		if (number == 1) {
			String headingText = createPlanPage.option1Text();
			Assert.assertEquals(headingText, "OPTION" + number);
		}
		else if (number ==2) {
			String headingText = createPlanPage.option2Text();
			Assert.assertEquals(headingText, "OPTION" + number);
		}		
	}
	
	@Then("User should see a button with text CONFIRM in option {int} menu")
	public void user_should_see_a_button_with_text_confirm_in_option_menu(Integer number) {
		if (number == 1) {
			String btnText = createPlanPage.confirmBtn1Text();
			Assert.assertEquals(createPlanPage.confirmBtn1Visibility(), true);
			Assert.assertEquals(btnText, "CONFIRM");
		}	
		else if (number == 2) {
			String btnText = createPlanPage.confirm1Btn2Text();
			Assert.assertEquals(createPlanPage.confirmBtn2Visibility(), true);
			Assert.assertEquals(btnText, "CONFIRM");
		}	
	}	
	
	@Then("User can update the health conditions in option {int} menu")
	public void user_can_update_the_health_conditions_in_option_menu(Integer number) {
		if (number == 1) {
			createPlanPage.selectCheckbox1();
			createPlanPage.selectCheckbox2();
			createPlanPage.selectCheckbox5();
			createPlanPage.selectCheckbox6();
			createPlanPage.selectCheckbox9();
		}
		else if (number == 2) {
			createPlanPage.multiSelect1(0);
			createPlanPage.multiSelect2(1);
			createPlanPage.multiSelect3(2);
		}
		
	}	
	
	@When("User clicks the CONFIRM button in option {int} menu")
	public void user_clicks_the_confirm_button_in_option_menu(Integer number) {
		if (number == 1) {
			createPlanPage.confirmBtn1Click();
		}
		else if (number == 2) {
			createPlanPage.confirmBtn2Click();
		}
	}
	@Then("User cannot update the health conditions in option {int} menu")
	public void user_cannot_update_the_health_conditions_in_option_menu(Integer number) {
		if (number == 1) {
			Assert.assertEquals(createPlanPage.checkbox1Enabled(), false);
			Assert.assertEquals(createPlanPage.checkbox2Enabled(), false);
			Assert.assertEquals(createPlanPage.checkbox3Enabled(), false);
			Assert.assertEquals(createPlanPage.checkbox4Enabled(), false);
			Assert.assertEquals(createPlanPage.checkbox5Enabled(), false);
			Assert.assertEquals(createPlanPage.checkbox6Enabled(), false);
			Assert.assertEquals(createPlanPage.checkbox7Enabled(), false);
			Assert.assertEquals(createPlanPage.checkbox8Enabled(), false);
			Assert.assertEquals(createPlanPage.checkbox9Enabled(), false);
			Assert.assertEquals(createPlanPage.checkbox10Enabled(),false);
		}
		else if (number == 2) {		
			Assert.assertEquals(createPlanPage.multiSelect1Enabled(), false);
			Assert.assertEquals(createPlanPage.multiSelect2Enabled(), false);
			Assert.assertEquals(createPlanPage.multiSelect3Enabled(), false);
		}
		
	}

	@Then("User should see a button with text GENERATE MENU  at the bottom of the page")
	public void user_should_see_a_button_with_text_generate_menu_at_the_bottom_of_the_page() {
		Assert.assertEquals(createPlanPage.generateMenuBtnVisibility(), true);
		Assert.assertEquals(createPlanPage.generateMenuBtnText(), "GENERATE MENU");
	}
	
	@When("User clicks the GENERATE MENU button")
	public void user_clicks_the_generate_menu_button() {
		createPlanPage.generateMenuBtnClick();
	}
	@Then("User should land on View Recent Diets page")
	public void user_should_land_on_view_recent_diets_page() {
		Assert.assertEquals(driver.getTitle(), "View Recent Diets");
	}
	@When("User lands on Confirm conditions and Create Plan page")
	public void user_lands_on_confirm_conditions_and_create_plan_page() {
		listofScreens.createPlanLinkClick();
	}
}

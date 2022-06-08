package com.nn.stepdefinition;

import org.testng.Assert;

import com.nn.base.DriverFactory;
import com.nn.pages.SignIn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	private SignIn signin = new SignIn(DriverFactory.getDriver());
	private static String title;

	@Given("user is on login Page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@When("user enter the valid {string}")
	public void user_enter_the_valid(String username) {
		signin.enterInteUsernameFeild(username);
	}

	@When("user enter {string}")
	public void user_enter(String string) {
		signin.enterIntePasswordFeild(string);
	}

	@When("user click login button")
	public void user_click_login_button() {
		signin.clickLogin();
	}

	@Then("user get the tittle of the page")
	public void user_get_the_tittle_of_the_page() {
		title = signin.getTittle();
		System.out.println(title);
	}

	@Then("Page Title shoud be {string}")
	public void page_title_shoud_be(String string) {
		Assert.assertTrue(title.contains(string));
	}
}

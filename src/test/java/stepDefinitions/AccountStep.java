package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import base.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.SignIn;

public class AccountStep {
	private SignIn signin = new SignIn(DriverFactory.getDriver());
	private AccountPage accountPage;
	private String title;

	@Given("user loged into the application")
	public void user_loged_into_the_application(DataTable dataTable) {
		List<Map<String, String>> list =  dataTable.asMaps();
		String username = list.get(0).get("username");
		String password = list.get(0).get("password");
		DriverFactory.getDriver()
				.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		accountPage = signin.doLogin(username, password);
	}

	@Given("user is on account page")
	public void user_is_on_account_page() {
		 title=accountPage.getAcountTitle();
		System.out.println(title);

	}

	@Then("page tittle should be {string}")
	public void page_tittle_should_be(String string) {
		Assert.assertTrue(title.contains(string));
	

	}

	

}

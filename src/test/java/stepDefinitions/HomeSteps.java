package stepDefinitions;
import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomeSteps {

	
private HomePage homepage= new HomePage(DriverFactory.getDriver());

	//Home-Primary Menu Bar

	@Given("User is on the browser")
    public void user_is_on_the_browser() {
		
    }
	
	@When("User opens the Dietician Website")
    public void user_opens_the_dietician_website() {
		DriverFactory.getDriver().get("http://www.xyzdietician.com/");
    }
	
	@Then("User should see the title of the page as Home")
    public void user_should_see_the_title_of_the_page_as_home() {
		
		String title = homepage.titleHomePage();
		String expectedTitle = "Dietician Title";
		Assert.assertEquals(title, expectedTitle);
    }
	
	@Then("User should see a logo image with the company name on the Home Page")
    public void user_should_see_a_logo_image_with_the_company_name_on_the_home_page() {
		
		boolean value = homepage.logoHomePage();
		String expectedValue = "True";
		Assert.assertEquals(value, expectedValue);
		
    }
	
	@Then("User should see a tab with text PRODUCT on the top menu bar of the Home page")
    public void user_should_see_a_tab_with_text_product_on_the_top_menu_bar_of_the_home_page() {
        
		String title = homepage.headingProduct();
		String expectedTitle = "PRODUCT";
		Assert.assertEquals(title, expectedTitle);
    }
	
	@Then("User should see a tab with text CLIENTS on the top menu bar of the Home page")
    public void user_should_see_a_tab_with_text_clients_on_the_top_menu_bar_of_the_home_page() {
        
		String title = homepage.headingClients();
		String expectedTitle = "CLIENTS";
		Assert.assertEquals(title, expectedTitle);
    }
	
	@Then("User should see a tab with text TEAM on the top menu bar of the Home page")
    public void user_should_see_a_tab_with_text_team_on_the_top_menu_bar_of_the_home_page() {
        
		String title = homepage.headingTeam();
		String expectedTitle = "TEAM";
		Assert.assertEquals(title, expectedTitle);
    }
	
	@Then("User should see a tab with text REGISTER on the top menu bar of the Home page")
    public void user_should_see_a_tab_with_text_register_on_the_top_menu_bar_of_the_home_page() {
        
		String title = homepage.headingRegister();
		String expectedTitle = "REGISTER";
		Assert.assertEquals(title, expectedTitle);
    }
	
	
	@Given("User is on Home page")
    public void user_is_on_home_page() {
    	DriverFactory.getDriver().get("http://www.xyzdietician.com/home/");
    }
	
	@When("User clicks on PRODUCT Link on Home Page")
    public void user_clicks_on_product_link_on_home_page() {
        
		String tabNameProduct = homepage.headingProduct();
		if(tabNameProduct=="PRODUCT") {
			homepage.clickProductMenu();
		}
    }
	
	@Then("User is re-directed to Product Page")
    public void user_is_redirected_to_product_page() {
        
		String headingText = "Products List";
		String expectedHeading = homepage.headingProductMenu();
		Assert.assertEquals(headingText, expectedHeading);
    }
	
	@When("User clicks on Client link on Home Page")
    public void user_clicks_on_client_link_on_home_page() {
        
		String tabNameClients = homepage.headingClients();
		if(tabNameClients=="CLIENTS") {
			homepage.clickClientsMenu();
		}
    }
	
	@Then("User is re-directed to Client Testimonial Page")
    public void user_is_redirected_to_client_testimonial_page() {

		String headingText = "Client Testimonial";
		String expectedHeading = homepage.headingClientsMenu();
		Assert.assertEquals(headingText, expectedHeading);
    }

    @When("User clicks on Team Link on Home Page")
    public void user_clicks_on_team_link_on_home_page() {
        
    	String tabNameTeam = homepage.headingTeam();
		if(tabNameTeam=="TEAM") {
			homepage.clickTeamMenu();
		}
    }
    
    @Then("User is directed to Doctor Team page")
    public void user_is_directed_to_doctor_team_page() {
       
		String headingText = "Lorem ipsum dolor sit amet";
		String expectedHeading = homepage.headingTeamMenu();
		Assert.assertEquals(headingText, expectedHeading);
    }

    @When("User clicks on REGISTER Link on Home Page")
    public void user_clicks_on_register_link_on_home_page() {
    	
    	String tabNameRegister = homepage.headingRegister();
		if(tabNameRegister=="REGISTER") {
			homepage.clickRegisterMenu();
		}
    }

    @Then("User is directed to Register page")
    public void user_is_directed_to_register_page() {

		String headingText = "Sign Up Form";
		String expectedHeading = homepage.headingRegisterMenu();
		Assert.assertEquals(headingText, expectedHeading);

    }
    
    //Home-Secondary Menu Bar
    
    /*@Given("User is on the browser")
    public void user_is_on_the_browser() {
        
    }*/

    /*@Given("User is on  Home Page")
    public void user_is_on_home_page() {
        
    }*/

    /*@When("User opens the Dietician Website")
    public void user_opens_the_dietician_website() {
        
    }*/
    
    @Then("User should see a tab with text About on the bottom menu bar of the Home page")
    public void user_should_see_a_tab_with_text_about_on_the_bottom_menu_bar_of_the_home_page() {
        
		String title = homepage.headingAbout();
		String expectedTitle = "About";
		Assert.assertEquals(title, expectedTitle);
    }
    
    @Then("User should see a tab with text Featured on the bottom menu bar of the Home page")
    public void user_should_see_a_tab_with_text_featured_on_the_bottom_menu_bar_of_the_home_page() {
        
		String title = homepage.headingFeatured();
		String expectedTitle = "Featured";
		Assert.assertEquals(title, expectedTitle);
    }

    @Then("User should see a tab with text Blog on the bottom menu bar of the Home page")
    public void user_should_see_a_tab_with_text_blog_on_the_bottom_menu_bar_of_the_home_page() {
        
		String title = homepage.headingBlog();
		String expectedTitle = "Blog";
		Assert.assertEquals(title, expectedTitle);
    }

    @Then("User should see a tab with text Contact us on the bottom menu bar of the Home page")
    public void user_should_see_a_tab_with_text_contact_us_on_the_bottom_menu_bar_of_the_home_page() {
        
		String title = homepage.headingContact();
		String expectedTitle = "Contact";
		Assert.assertEquals(title, expectedTitle);
    }
    
    @Then("User should see a search option symbol on the bottom menu bar of the Home page")
    public void user_should_see_a_search_option_symbol_on_the_bottom_menu_bar_of_the_home_page() {
		
    	String searchtagName = homepage.searchHomePage();
		String expectedTagname = "Input";
		Assert.assertEquals(searchtagName, expectedTagname);
    }

    @Then("User should see a Signin option next to the search button on the bottom menu bar of the Home page")
    public void user_should_see_a_signin_option_next_to_the_search_button_on_the_bottom_menu_bar_of_the_home_page() {
        
    	String signintagName = homepage.signinHomePage();
		String expectedTagname = "a";
		Assert.assertEquals(signintagName, expectedTagname);
    }

    @When("User clicks on About Link on Home page")
    public void user_clicks_on_about_link_on_home_page() {
        
    	String tabNameAbout = homepage.headingAbout();
		if(tabNameAbout=="About") {
			homepage.clickAboutMenu();
		}
    }
    
    @Then("User is directed to About Page")
    public void user_is_directed_to_about_page() {
        
    	String headingText = "About Us";
		String expectedHeading = homepage.headingAboutMenu();
		Assert.assertEquals(headingText, expectedHeading);
    }

    @When("User clicks on Featured link")
    public void user_clicks_on_featured_link() {
        
    	String tabNameFeatured = homepage.headingFeatured();
		if(tabNameFeatured=="Featured") {
			homepage.clickFeaturedMenu();
		}
    }
    
    @Then("User is directed to Featured content page")
    public void user_is_directed_to_featured_content_page() {
        
    	String headingText = "Featured Heading";
		String expectedHeading = homepage.headingFeaturedMenu();
		Assert.assertEquals(headingText, expectedHeading);
    }

    @When("User clicks on Blogs link")
    public void user_clicks_on_blogs_link() {
        
    	String tabNameBlog = homepage.headingBlog();
		if(tabNameBlog=="Blog") {
			homepage.clickBlogMenu();
		}
    }
    
    @Then("User is directed to Blogs Page")
    public void user_is_directed_to_blogs_page() {
        
    	String headingText = "Blog Heading";
		String expectedHeading = homepage.headingBlogMenu();
		Assert.assertEquals(headingText, expectedHeading);
    }

    @When("User clicks on Contact us link")
    public void user_clicks_on_contact_us_link() {
        
    	String tabNameContact = homepage.headingContact();
		if(tabNameContact=="Contact us") {
			homepage.clickContactMenu();
		}
    }

    @Then("User is directed to Contact us Page")
    public void user_is_directed_to_contact_us_page() {
        
    	String headingText = "Contact Heading";
		String expectedHeading = homepage.headingContactMenu();
		Assert.assertEquals(headingText, expectedHeading);
    }


}

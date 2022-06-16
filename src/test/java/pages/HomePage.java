package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.ApplicationUtils;

public class HomePage extends ApplicationUtils{

	public String pageTitle;
	public HomePage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
		pageTitle = driver1.getTitle();
	}
	
	//Logo
	@FindBy(xpath = "//div[@id='logo-home']")
	WebElement logoHome;
	
	//Search
	@FindBy(xpath = "//div[@id='search-home']")
	WebElement searchHome;
	
	//Signin
	@FindBy(xpath = "//div[@id='signin-home']")
	WebElement signinHome;
	
	
	// Primary Menu Tab Titles
	@FindBy(xpath = "//div[@id='product-heading']")
	WebElement productHeading;
	
	@FindBy(xpath = "//div[@id='clients-heading']")
	WebElement clientsHeading;
	
	@FindBy(xpath = "//div[@id='team-heading']")
	WebElement teamHeading;
	
	@FindBy(xpath = "//div[@id='register-heading']")
	WebElement registerHeading;
	
	// Secondary Menu Tab Titles
	@FindBy(xpath = "//div[@id='about-heading']")
	WebElement aboutHeading;
	
	@FindBy(xpath = "//div[@id='featured-heading']")
	WebElement featuredHeading;
	
	@FindBy(xpath = "//div[@id='blog-heading']")
	WebElement blogHeading;
	
	@FindBy(xpath = "//div[@id='contact-heading']")
	WebElement contactHeading;
	
	
	// Primary Menu Tab Clicks
	@FindBy(xpath = "//div[@id='product-menu']")
	WebElement productMenu;
	
	@FindBy(xpath = "//div[@id='clients-menu']")
	WebElement clientsMenu;
	
	@FindBy(xpath = "//div[@id='team-menu']")
	WebElement teamMenu;
	
	@FindBy(xpath = "//div[@id='register-menu']")
	WebElement registerMenu;
	
	// Secondary Menu Tab Clicks
	@FindBy(xpath = "//div[@id='about-menu']")
	WebElement aboutMenu;
	
	@FindBy(xpath = "//div[@id='featured-menu']")
	WebElement featuredMenu;
	
	@FindBy(xpath = "//div[@id='blog-menu']")
	WebElement blogMenu;
	
	@FindBy(xpath = "//div[@id='contact-menu']")
	WebElement contactMenu;
	
	
	// Primary Menu Tab Headings
	@FindBy(xpath = "//div[@id='product-menu-heading']")
	WebElement productMenuHeading;
	
	@FindBy(xpath = "//div[@id='clients-menu-heading']")
	WebElement clientsMenuHeading;
	
	@FindBy(xpath = "//div[@id='team-menu-heading']")
	WebElement teamMenuHeading;
	
	@FindBy(xpath = "//div[@id='register-menu-heading']")
	WebElement registerMenuHeading;
	
	// Secondary Menu Tab Headings
	@FindBy(xpath = "//div[@id='about-menu-heading']")
	WebElement aboutMenuHeading;
	
	@FindBy(xpath = "//div[@id='featured-menu-heading']")
	WebElement featuredMenuHeading;
	
	@FindBy(xpath = "//div[@id='blog-menu-heading']")
	WebElement blogMenuHeading;
	
	@FindBy(xpath = "//div[@id='contact-menu-heading']")
	WebElement contactMenuHeading;
	
	
	//Title
	public String titleHomePage() {
		// TODO Auto-generated method stub
		return pageTitle;
	}
	
	//Logo
	public boolean logoHomePage() {
		return logoHome.isDisplayed();
	}
	
	//Search
	public String searchHomePage() {
		return searchHome.getTagName();		
	}
	
	//Signin
	public String signinHomePage() {
		return signinHome.getTagName();
	}
	
	public void clickSigninMenu() {
		signinHome.click();
	}
	
	// Primary Menu Tab Titles
	public String headingProduct() {
		return productHeading.getText();
	}
	
	public String headingClients() {
		return clientsHeading.getText();
	}
	
	public String headingTeam() {
		return teamHeading.getText();
	}
	
	public String headingRegister() {
		return registerHeading.getText();
	}
	
	// Secondary Menu Tab Titles
	public String headingAbout() {
		return aboutHeading.getText();
	}
	
	public String headingFeatured() {
		return featuredHeading.getText();
	}
	
	public String headingBlog() {
		return blogHeading.getText();
	}
	
	public String headingContact() {
		return contactHeading.getText();
	}	
	
	// Primary Menu Tab Clicks
	public void clickProductMenu() {
		productMenu.click();
	}	
	
	public void clickClientsMenu() {
		clientsMenu.click();
	}	
	
	public void clickTeamMenu() {
		teamMenu.click();
	}
	
	public void clickRegisterMenu() {
		registerMenu.click();
	}
	
	// Secondary Menu Tab Clicks
	public void clickAboutMenu() {
		aboutMenu.click();
	}	
	
	public void clickFeaturedMenu() {
		featuredMenu.click();
	}	
	
	public void clickBlogMenu() {
		blogMenu.click();
	}
	
	public void clickContactMenu() {
		contactMenu.click();
	}
	

	
	
	// Primary Menu Tab Headings
	public String headingProductMenu() {
		return productMenuHeading.getText();
	}	
	
	public String headingClientsMenu() {
		return clientsMenuHeading.getText();
	}	
	
	public String headingTeamMenu() {
		return teamMenuHeading.getText();
	}
	
	public String headingRegisterMenu() {
		return registerMenuHeading.getText();
	}
	
	// Secondary Menu Tab Headings
	public String headingAboutMenu() {
		return aboutMenuHeading.getText();
	}	
	
	public String headingFeaturedMenu() {
		return featuredMenuHeading.getText();
	}	
	
	public String headingBlogMenu() {
		return blogMenuHeading.getText();
	}
	
	public String headingContactMenu() {
		return contactMenuHeading.getText();
	}	



	
}

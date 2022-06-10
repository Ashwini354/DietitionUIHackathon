package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver;
	
	//Finding Elements of the page
	@FindBy(xpath = "//a[@href='/REGISTER']")
	WebElement registerLink;
	
	  //Constructor
    public HomePage(WebDriver d){

        this.driver = d;

    }
    
    
public void clickRegister() {
		
	registerLink.click();
		 

	}
}

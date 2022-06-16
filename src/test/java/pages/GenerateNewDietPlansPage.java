package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.ApplicationUtils;

public class GenerateNewDietPlansPage extends ApplicationUtils {

	public GenerateNewDietPlansPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//div[@class='heading']")
	WebElement heading;
	@FindBy(xpath = "//input[@id='Browse']")
	WebElement browseBtn;
	@FindBy(xpath = "//input[@id='Upload']")
	WebElement uploadBtn;
	@FindBy(xpath = "//input[@id='GenerateMenu']")
	WebElement generateMenuBtn;
	@FindBy(xpath = "//div[@class='option 1']")
	WebElement option1;
	@FindBy(xpath = "//div[@class='option 2']")
	WebElement option2;
	@FindBy(xpath = "//input[@id='Confirm1']")
	WebElement confirmBtn1;
	@FindBy(xpath = "//input[@id='Confirm2']")
	WebElement confirmBtn2;
	@FindBy(css="input[type='checkbox1']")
	WebElement checkbox1;
	@FindBy(css="input[type='checkbox2']")
	WebElement checkbox2;
	@FindBy(css="input[type='checkbox3']")
	WebElement checkbox3;
	@FindBy(css="input[type='checkbox4']")
	WebElement checkbox4;
	@FindBy(css="input[type='checkbox5']")
	WebElement checkbox5;
	@FindBy(css="input[type='checkbox6']")
	WebElement checkbox6;
	@FindBy(css="input[type='checkbox7']")
	WebElement checkbox7;
	@FindBy(css="input[type='checkbox8']")
	WebElement checkbox8;
	@FindBy(css="input[type='checkbox9']")
	WebElement checkbox9;
	@FindBy(css="input[type='checkbox10']")
	WebElement checkbox10;
	@FindBy(xpath = "//input[@id='Conditions']")
	WebElement multiSelector1;
	@FindBy(xpath = "//input[@id='Co-Morbidities']")
	WebElement multiSelector2;
	@FindBy(xpath = "//input[@id='Preferance']")
	WebElement multiSelector3;

	
	public String headingText() {
		return heading.getText();
	}	
	public boolean browseBtnVisibility() {
		return browseBtn.isDisplayed();
	}
	public String browseBtnText() {
		return browseBtn.getText();
	}
	public boolean uploadBtnVisibility() {
		return uploadBtn.isDisplayed();
	}
	public String uploadBtnText() {
		return uploadBtn.getText();
	}
	public boolean generateMenuBtnVisibility() {
		return generateMenuBtn.isDisplayed();
	}
	public String generateMenuBtnText() {
		return generateMenuBtn.getText();
	}
	public void generateMenuBtnClick() {
		generateMenuBtn.click();
	}
	public String option1Text() {
		return option1.getText();
	}
	public String option2Text() {
		return option1.getText();
	}
	public boolean confirmBtn1Visibility() {
		return confirmBtn1.isDisplayed();
	}
	public boolean confirmBtn2Visibility() {
		return confirmBtn2.isDisplayed();
	}
	public String confirmBtn1Text() {
		return confirmBtn1.getText();
	}
	public String confirm1Btn2Text() {
		return confirmBtn2.getText();
	}
	public void confirmBtn1Click() {
		confirmBtn1.click();
	}
	public void confirmBtn2Click() {
		confirmBtn2.click();
	}
	public void selectCheckbox1() {
		checkbox1.click();
	}
	public void selectCheckbox2() {
		checkbox2.click();
	}
	public void selectCheckbox3() {
		checkbox3.click();
	}
	public void selectCheckbox4() {
		checkbox4.click();
	}
	public void selectCheckbox5() {
		checkbox5.click();
	}
	public void selectCheckbox6() {
		checkbox6.click();
	}
	public void selectCheckbox7() {
		checkbox7.click();
	}
	public void selectCheckbox8() {
		checkbox8.click();
	}
	public void selectCheckbox9() {
		checkbox9.click();
	}
	public void selectCheckbox10() {
		checkbox10.click();
	}
	public void multiSelect1(int index) {		
		Select s = new Select(multiSelector1);
		s.selectByIndex(index);
	}
	public void multiSelect2(int index) {		
		Select s = new Select(multiSelector2);
		s.selectByIndex(index);
	}
	public void multiSelect3(int index) {		
		Select s = new Select(multiSelector3);
		s.selectByIndex(index);
	}
	public boolean multiSelect1Enabled() {		
		return multiSelector1.isEnabled();
		}
	public boolean multiSelect2Enabled() {		
		return multiSelector2.isEnabled();
		}
	public boolean multiSelect3Enabled() {		
		return multiSelector3.isEnabled();
		}
	public boolean checkbox1Enabled() {
		return checkbox1.isEnabled();
	}
	public boolean checkbox2Enabled() {
		return checkbox2.isEnabled();
	}
	public boolean checkbox3Enabled() {
		return checkbox3.isEnabled();
	}
	public boolean checkbox4Enabled() {
		return checkbox4.isEnabled();
	}
	public boolean checkbox5Enabled() {
		return checkbox5.isEnabled();
	}
	public boolean checkbox6Enabled() {
		return checkbox6.isEnabled();
	}
	public boolean checkbox7Enabled() {
		return checkbox7.isEnabled();
	}
	public boolean checkbox8Enabled() {
		return checkbox8.isEnabled();
	}
	public boolean checkbox9Enabled() {
		return checkbox9.isEnabled();
	}
	public boolean checkbox10Enabled() {
		return checkbox10.isEnabled();
	}
}

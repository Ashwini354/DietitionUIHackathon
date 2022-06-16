package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import utilities.ApplicationUtils;

public class DietPlansPage extends ApplicationUtils{

	public DietPlansPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//div[@class='heading']")
	WebElement heading;	
	@FindBy(xpath = "//input[@id='next']")
	WebElement nextBtn;
	@FindBy(xpath = "//input[@id='previous']")
	WebElement previousBtn;
	@FindBy(xpath = "//input[@id='viewpdf']")
	WebElement viewpdfBtn;
	@FindBy(xpath = "//div[@class='pagination-selected']")
	WebElement currentPageInTable;
	@FindBys({@FindBy(id="duel_select_0")	})
	public List<WebElement>dropdown;

	
	public String headingText() {
		return heading.getText();		
	}
	public String getCurrentPage() {
		return currentPageInTable.getText();		
	}
	public boolean nextBtnVisibility() {
		return nextBtn.isDisplayed();
	}
	public boolean previousBtnVisibility() {
		return previousBtn.isDisplayed();
	}
	public String nextBtnText() {
		return nextBtn.getText();
	}
	public String previousBtnText() {
		return previousBtn.getText();
	}
	public void nextBtnClick() {
		nextBtn.click();		
	}
	public void previousBtnClick() {
		previousBtn.click();		
	}
	public boolean viewpdfBtnVisibility() {
		return viewpdfBtn.isDisplayed();
	}
	public String viewpdfBtnText() {
		return viewpdfBtn.getText();
	}
	public void viewpdfBtnClick() {
		viewpdfBtn.click();
	}
	public int getRowSize() {
		return dropdown.size();
	}
	
}

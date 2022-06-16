package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ApplicationUtils;

public class MyPatientReportPage extends ApplicationUtils{
	
	public MyPatientReportPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//table//tr")
	WebElement view_PDF;
	
	@FindBy(xpath = "//table//tr")
	WebElement title;
	
	@FindBy(xpath = "//table//tr[2]")
	WebElement table;
	
	@FindBy(xpath = "//table//tr[3]")
	WebElement uploadedTime;
	
	@FindBy(xpath = "//table//tr[3]")
	WebElement healthcondition;
	
	@FindBy(xpath = "//table//tr[3]")
	WebElement DocId;
	
	@FindBy(xpath = "//table//tr[1]td")
	WebElement file_reportname;
	
	
	@FindBy(xpath = "//input[@id='page']")
	WebElement page;
	
	@FindBy(xpath = "//input[@id='pagelink']")
	WebElement page_link;
	public String getDocID() {
		return DocId.getText();
	}
	
	
	
	public String getviewPDf() {
		return view_PDF.getText();
	}
	public String fileReportName() {
		return file_reportname.getText();
	}
	
	public String getHealthCondition() {
		return healthcondition.getText();
	}
	
	public String getUplodedTime() {
		return uploadedTime.getText();
	}
	
	public String getTitle() {
		return table.getText();
	}
	
	public String getTable() {
		return title.getText();
	}
	
	public String getpage() {
		return page.getText();
	}
	
	public String getpageLink() {
		return page.getText();
	}

}

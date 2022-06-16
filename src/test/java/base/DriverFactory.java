package base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.PropertiesConfiguration;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static Properties prop;

	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

	static {
		prop = PropertiesConfiguration.loadProperties();
	}

	@Before(order = 0)
	public void Launch() {
		System.out.println("Initializing the driver from driver factory");
		String browser = prop.getProperty("browser");
		
		if (browser.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			//Headless Browser
			chromeOptions.addArguments("--headless");
			driver = new ChromeDriver(chromeOptions);
		}
		 else if (browser.equalsIgnoreCase("firefox")) 
		 {
			WebDriverManager.firefoxdriver().setup();
			FirefoxBinary firefoxBinary = new FirefoxBinary();
			FirefoxOptions options = new FirefoxOptions();
			//Headless Browser
			options.setBinary(firefoxBinary);
			options.setHeadless(true);
			driver = new FirefoxDriver(options);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		tdriver.set(driver);

	}

	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}

	public static void clickOper(WebElement ele) {
		ele.click();

	}

	@After(order = 1)
	public void closeDriver() {
		driver.quit();
	}

	//***** Uncomment below code for taking screenshot of Failed Test cases
//	@After(order = 2)
//	public void tearDown(Scenario scenario) {
//		if (scenario.isFailed()) {
//			// take screenshot:
//			String screenshotName = scenario.getName().replaceAll(" ", "_");
//			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(sourcePath, "image/png", screenshotName);
//
//		}
//	}

}

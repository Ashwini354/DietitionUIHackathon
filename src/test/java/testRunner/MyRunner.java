package testRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:/Features" , 
		glue = {"stepDefinitions", "base" }, 
		monochrome = true, 
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class MyRunner extends AbstractTestNGCucumberTests{
@Override	
@DataProvider(parallel=true)
public Object[][] scenarios(){
return super.scenarios();
}

}

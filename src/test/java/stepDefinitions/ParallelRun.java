package stepDefinitions;


import org.testng.annotations.DataProvider;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "classpath:/feature",
 					glue = {
		"com.nn.stepdefinition", "com.nn.base" }, monochrome = true, plugin = {
				"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","timeline:test-output-thread/","rerun:target/failedrerun.txt"})


public class ParallelRun extends AbstractTestNGCucumberTests{
	
					
	@DataProvider(parallel=true)
	public Object[][] scenario(){
		return super.scenarios();
		
	}

}

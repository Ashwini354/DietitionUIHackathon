package stepDefinitions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
"@target/failedrerun.txt" }, glue = {
		"com.nn.stepdefinition", "com.nn.base" }, monochrome = true, plugin = {
				"pretty","timeline:test-output-thread/","rerun:target/failedrerun.txt"})


public class FailedRun extends AbstractTestNGCucumberTests
{
					
	@DataProvider(parallel=true)
	public Object[][] scenario(){
		return super.scenarios();
		 

}
}

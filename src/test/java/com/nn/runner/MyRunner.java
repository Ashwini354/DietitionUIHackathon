package com.nn.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"/Users/ashwiniramamurthy/eclipse-workspace/DietitionUIHackathon/src/test/resources/feature" }, glue = {
				"com.nn.stepdefinition", "com.nn.base" }, monochrome = true, plugin = {
						"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

}

)

public class MyRunner {

}

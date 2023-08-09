package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"classpath:features"}, 
		glue = {"stepDefinitions"},
		tags = "@lufthansa", 
		monochrome = false, 
		dryRun = false,
		plugin = {"pretty", "json:target/cucumber.json"})

public class mainRunner extends AbstractTestNGCucumberTests {

}

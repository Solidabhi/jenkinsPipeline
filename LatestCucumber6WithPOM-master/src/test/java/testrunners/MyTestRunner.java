package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures"},
		glue = {"stepdefinitions", "AppHooks"},
		plugin = {"pretty",
				"json:target/cucumber-json-report.json",
				"html:target/cucumber-html-report.html"},
		tags = "@Reg",
		monochrome = true
		
		)

public class MyTestRunner {

}

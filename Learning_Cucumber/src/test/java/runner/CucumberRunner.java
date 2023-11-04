package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//batch execution
@CucumberOptions(
		features = {"./src/test/java/features"},//feature files path
		glue = {"stepDefinitions"},//step definitions path
		dryRun = false,//if it is true only feature file will be executed
		monochrome=false,//removes unwanted statements in the console
		plugin = {"pretty","html:reports/cucumberReports.html","json:reports/JSONReports.json"}//to generate reports
		)
public class CucumberRunner extends AbstractTestNGCucumberTests {
	
}
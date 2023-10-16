package stepdefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/main/java/featurefiles", glue = "stepdefinitions"
, plugin = {"pretty", "html:target/CucumberTestNgreports.html"}, tags = "@test")
public class RunnerTestNG  extends AbstractTestNGCucumberTests{

	
}

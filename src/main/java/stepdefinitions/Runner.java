package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// Runner can be created using either JUnit or TestNG

//Using JUnit here

//if there are multiple features package then add to features like {"src/main/java/featurefiles", "src/main/java/featurefiles1"}"
//when tags are added to cucumberoption e.g @smoke, then only those test cases who are under "@smoke" tags will be executed.

//,tags = "@test"
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/featurefiles", glue = "stepdefinitions"
, plugin = {"pretty", "html:target/Cucumberreports.html"}, tags = "@test")
public class Runner {
	
	 

}

package utility;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\Eclipse_Projects\\appiumFramework\\src\\test\\java\\featureFiles\\gestureAutomation.feature", glue = "E:\\Eclipse_Projects\\appiumFramework\\src\\test\\java\\stepDefinition\\DrapAndDrop.java", plugin = {
		"pretty" })
public class CucumberConfiguration {

}

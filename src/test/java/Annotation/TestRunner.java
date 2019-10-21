package Annotation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/CucumberTest/Feature/createForm.feature"
		,glue={"stepDefinition"}
		)
public class TestRunner {

}

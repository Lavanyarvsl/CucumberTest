package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features = "Feature"
		,glue={"stepDefinition"}
		)
public class TestRunner {

}

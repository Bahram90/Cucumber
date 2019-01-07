package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags= "@login3",
		features= "Features",
        glue= "StepDefenition",
        plugin= {"html:target/cucumber-html-report"})
public class TestRunner {

}

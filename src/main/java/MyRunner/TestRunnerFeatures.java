package MyRunner;

import cucumber.api.testng.AbstractTestNGCucumberTests;

import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = "src/main/java/features",
        glue = {"stepDefinitions"})

public class TestRunnerFeatures extends AbstractTestNGCucumberTests {

}
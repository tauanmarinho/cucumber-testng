package MyRunner;

import cucumber.api.testng.AbstractTestNGCucumberTests;

import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = "src/main/java/Features",
        glue = {"stepDefinitions"})

public class TestRunner extends AbstractTestNGCucumberTests {

}
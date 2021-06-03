package MyRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/main/java/features/featureOne.feature",
        glue = {"stepDefinitions"})

public class TestRunnerFeatureOne extends AbstractTestNGCucumberTests {

}
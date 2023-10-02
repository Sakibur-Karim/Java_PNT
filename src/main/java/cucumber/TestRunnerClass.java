package cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/main/java/cucumber/Customers.feature",

                "src/main/java/cucumber/LoginFeatures.feature"},
        //StepDefinition class
        glue = "cucumber",
        //true will check compatibility
        dryRun = false,
        //output readable
        monochrome = true,
        tags = "@Regression",
        plugin = {"pretty"}
)

public class TestRunnerClass {

}

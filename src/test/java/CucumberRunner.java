package StepDefinition;

import io.cucumber.junit.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {"io.gameta.allure.cucumber4jvm.AllureCucumber4Jvm", "pretty", "json:target/cucumber-report/report.json"},
        features = "src/test/resources/features",
        glue = "src/test/java/StepDefinition",
        tags = "@testFunctional"
)
public class CucumberRunner {
}

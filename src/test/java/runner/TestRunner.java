package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps","utils"},
        plugin = {"pretty","html:target/cucumber-report.html"},
        tags = "@smoke"
)

public class TestRunner extends AbstractTestNGCucumberTests {
}

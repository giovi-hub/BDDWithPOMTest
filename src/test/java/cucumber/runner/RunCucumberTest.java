package cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeSuite;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report.html"},
        glue = {"steps"},
        features = "src/test/resources/features",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true
)

public class RunCucumberTest { }

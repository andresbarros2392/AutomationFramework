package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"steps", "hooks"},
        tags = "@Regression or @Smoke",
        dryRun = false, //This validates that all the steps defined have their implementation. False by default.
        monochrome = false, //The report log is formatted and cleaner.
        plugin = {"pretty", "html:target/cucumber-reports/report.html",
                "json:target/cucumber-reports/report.json",
                "junit:target/cucumber-reports/cukes.xml"}
)
public class TestRunner {


}

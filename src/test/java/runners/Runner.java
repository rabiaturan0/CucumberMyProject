package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.html"
        },
        monochrome = true,
        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@login_olma",
        dryRun = false
)

public class Runner {

}
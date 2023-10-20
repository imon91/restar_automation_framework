package testRunner.webRunner.createIssue;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;



@CucumberOptions(tags ="@smoke", features = {"src/test/resources/Features/WebFeatures/loginFeature/login.feature"},
        glue = {"stepDefinition"},   monochrome = true,
        dryRun = false,
        plugin = {
                "pretty","html:build/reports/webReport/login/login.html"
        })
@Test
public class CucumberCreateIssueRunner   extends AbstractTestNGCucumberTests {

}

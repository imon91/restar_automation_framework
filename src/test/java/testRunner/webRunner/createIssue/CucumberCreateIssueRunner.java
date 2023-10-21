package testRunner.webRunner.createIssue;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;



@CucumberOptions(tags ="@smoke", features = {"src/test/resources/Features/01_login/login.feature","src/test/resources/Features/02_createIssue/createIssue.feature"},
        glue = {"stepDefinition"},   monochrome = true,
        dryRun = false,
        plugin = {
                "pretty","html:build/reports/webReport/createIssue/createIssue.html"
        })
@Test
public class CucumberCreateIssueRunner   extends AbstractTestNGCucumberTests {

}

package stepDefinition;

import core.helper.BrowserHandler;
import core.recordPlayer.RecordControl;
import core.recordPlayer.ScreenRecorderUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObject.loginPage.LoginPage;

import static core.urlDefine.WebUrl.*;

public class LoginStepdefs {
    public static WebDriver driver;
    BrowserHandler browserHandler;
    LoginPage loginPage;

    private String url = git_url;



    @Given("I am on the GitHub login page")
    public void iAmOnTheGitHubLoginPage() throws Exception {

        browserHandler = new BrowserHandler();
        String browser = System.getProperty("Browser");
        System.out.println(".............................+" + browser);
        driver = browserHandler.selectBrowser(browser,url);
        ScreenRecorderUtil.startRecord("login");
        loginPage= new LoginPage(driver);
        loginPage.clickSignInLink();




    }

    @When("I enter my GitHub {string} and {string}")
    public void iEnterMyGitHubUsernameAndPassword(String username, String password) {
        loginPage.sendUsername(username);
        loginPage.sendPassword(password);


    }

    @And("I click the  button")
    public void iClickTheButton() {
        loginPage.clickSubmitButton();
    }

    @Then("I should be logged into my GitHub account")
    public void iShouldBeLoggedIntoMyGitHubAccount() {
        String dashboardLandingText=loginPage.getDashboardConfirmText();
        Assert.assertEquals("Dashboard",dashboardLandingText);
        globalDriver = driver;


    }


}

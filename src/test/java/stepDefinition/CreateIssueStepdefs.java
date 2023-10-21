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
import pageObject.loginPage.CreateIssuePage;
import pageObject.loginPage.LoginPage;
import static core.urlDefine.WebUrl.globalDriver;

public class CreateIssueStepdefs {
    public static WebDriver driver;
    BrowserHandler browserHandler;
    CreateIssuePage createIssuePage;
     RecordControl recordControlGlobal;
     String descriptionNew;

    @Given("user is on the GitHub website")
    public void userIsOnTheGitHubWebsite() throws Exception {
        createIssuePage= new CreateIssuePage(globalDriver);

        
    }

    @When("navigates to the repository {string}")
    public void navigatesToTheRepositoryRepoName(String searchValue) {

        createIssuePage.goTargetRepo(searchValue);
        
    }

    @And("clicks on the issue tab")
    public void clicksOnTheIssueTab() {
        createIssuePage.issueButtonClick();
        
    }

    @And("selects new issue")
    public void selectsNewIssue() {
        createIssuePage.newNewIssueButton();
        
    }

    @And("fills in the issue title as {string}")
    public void fillsInTheIssueTitleAsNewIssue(String title) {
        createIssuePage.addTitle(title);


    }

    @And("adds a {string}")
    public void addsADescription(String description) {
        createIssuePage.addTitle(description);
        descriptionNew  = description;

    }

    @And("submits the issue")
    public void submitsTheIssue() {
        createIssuePage.clickSubmitButton();
        
    }

    @Then("the issue should be created successfully")
    public void theIssueShouldBeCreatedSuccessfully() throws Exception {
        String des=  createIssuePage.getIssueTitle();
        String assertValue = "new issuenot working";
        Assert.assertEquals(des,assertValue);
        ScreenRecorderUtil.stopRecord();
    }
}

package pageObject.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CreateIssuePage {
    WebDriver driver;
    // Fill out the issue details

    By searchInput = By.xpath("(//input[@data-query-name=\"q\"])[1]");
    By newIssueButton = By.xpath("//span[contains(text(), 'New issue')]");
    By issueButton = By.xpath("//a[@id=\"issues-tab\"]");
    By issueTitle = By.id("issue_title");
    By issueBody = By.xpath("issue_body");
    By submitButton = By.xpath("//button[contains(text(), 'Submit new issue')]");
    By targetUrl = By.xpath("(//a[@data-hovercard-url=\"/imon91/restar_automation_framework/hovercard\"])[2]");

    By getTextTitle = By.xpath("//bdi[@class=\"js-issue-title markdown-title\"]");

    public CreateIssuePage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    }


    public void goTargetRepo(String repoName) {
        driver.findElement(searchInput).sendKeys(repoName);
        driver.findElement(searchInput).sendKeys(Keys.RETURN);
        driver.findElement(targetUrl).click();



    }



    public void issueButtonClick(){
        driver.findElement(issueButton).click();

    }

    public void newNewIssueButton(){
        driver.findElement(newIssueButton).click();

    }

    public void addTitle(String title){
        driver.findElement(issueTitle).sendKeys(title);

    }
    public void addIssueBody(String issue){
        driver.findElement(issueBody).sendKeys(issue);

    }

    public void clickSubmitButton(){
        driver.findElement(submitButton).click();

    }


    public String getIssueTitle(){

        String getTitle = driver.findElement(getTextTitle).getText();
        return getTitle;


    }


}

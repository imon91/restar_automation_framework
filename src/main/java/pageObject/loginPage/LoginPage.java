package pageObject.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    WebDriver driver;

    By signInLink = By.linkText("Sign in");
    By loginField = By.id("login_field");
    By passwordField = By.id("password");
    By signInButton = By.name("commit");

    By dashboardText =By.xpath("//a[@class=\"AppHeader-context-item\"]");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    }

    public void clickSignInLink() {
        driver.findElement(signInLink).click();

    }

    public void sendUsername(String username) {
        driver.findElement(loginField).sendKeys(username);


    }

    public void sendPassword(String password) {

        driver.findElement(passwordField).sendKeys(password);

    }

    public void clickSubmitButton() {
        driver.findElement(signInButton).click();

    }

    public String getDashboardConfirmText(){
       String text = driver.findElement(dashboardText).getText();
       return text;

    }
}






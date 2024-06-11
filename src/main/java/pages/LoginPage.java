package pages;

import object.LoginObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    private LoginObject loginObject;

    public LoginPage(WebDriver driver) {
        super(driver);
        loginObject = new LoginObject(driver);
    }

    public void enterEmail(String email) {
        WebElement emailField = driver.findElement(loginObject.getInputEmail());
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) throws InterruptedException {
        WebElement passwordField = driver.findElement(loginObject.getInputPassword());
        passwordField.sendKeys(password);
        driver.findElement(loginObject.getRevealPassword()).click();
        this.waitForELementVisible(loginObject.getInputPassword());
    }

    public void clickLogin() {
        WebElement loginButton = driver.findElement(loginObject.getSubmitButton());
        loginButton.click();
    }

    public String getErrorEmptyEmailMessage() {
        return driver.findElement(loginObject.getErrorEmptyEmailMessage()).getText();
    }

    public String getErrorEmptyPasswordMessage() {
        return driver.findElement(loginObject.getErrorEmptyPasswordMessage()).getText();
    }

    public String getErrorWrongMessage() {
        return driver.findElement(loginObject.getErrorWrongMessage()).getText();
    }


}

package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObject {
    WebDriver driver;
    public LoginObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getLogo() { return By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/img");}
    public By getInputEmail() { return By.id("userEmail");}
    public By getInputPassword() { return By.id("password");}
    public By getRevealPassword() { return By.xpath("//*[@id=\"eye\"]");}
    public By getSubmitButton() { return  By.xpath("//*[@id=\"form-login\"]/div[3]/button");}


}

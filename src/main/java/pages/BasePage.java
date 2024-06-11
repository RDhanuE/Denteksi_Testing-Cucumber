package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public WebElement waitForELementVisible(By by) throws InterruptedException {
        Thread.sleep(1000);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void verivyELementVisible(By by) throws InterruptedException {
        waitForELementVisible(by).isDisplayed();
    }

    public void click(By by) throws InterruptedException {
        waitForELementVisible(by).click();
    }

    public String getActualURL() {
        return driver.getCurrentUrl();
    }

}

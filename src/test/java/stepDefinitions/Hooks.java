package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static WebDriver driver;

    @Before
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public static void terminate() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}

package stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test, test1, test2, test3;

    @Before
    public static void setup() {
        extent = ExtentReportManager.getInstance();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        test = extent.createTest("Login Page");
        test1 = extent.createTest("Pemeriksaan Page");
        test2 = extent.createTest("RiwayatPage");
        test3 = extent.createTest("LogoutPage");
    }

    @After
    public static void terminate() {
        driver.quit();
        test.log(Status.PASS, "Browser closed");
        extent.flush();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}

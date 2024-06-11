package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.admin.DashboardAdminPage;
import pages.dokter.DashboardDokterPage;

public class LoginSteps {


    @Given("User is in the login page")
    public void navigateToLoginPage(){

        Hooks.getDriver().get("http://127.0.0.1:8000");
    }

    @When("User submit admin credentials")
    public void submitAdminCredentials() throws InterruptedException {
        LoginPage login = new LoginPage(Hooks.getDriver());
        login.enterEmail("admin@admin.com");
        login.enterPassword("admin1234");
        login.clickLogin();
    }

    @Then("User should be redirected to admin dashboard")
    public void loginAdminSuccesful() {
        DashboardAdminPage adminPage = new DashboardAdminPage(Hooks.getDriver());
        String expectedURL = "http://127.0.0.1:8000/admin/dashboard";
        Assertions.assertEquals(expectedURL, adminPage.getActualURL());
    }

    @When("User submit dokter credentials")
    public void submitDokterCredentials() throws InterruptedException {
        LoginPage loginPage = new LoginPage(Hooks.getDriver());
        loginPage.enterEmail("dokter@dokter.com");
        loginPage.enterPassword("dokter1234");
        loginPage.clickLogin();
    }

    @Then("User should be redirected to dokter dashboard")
    public void loginDokterSuccesful() {
        DashboardDokterPage dokterPage = new DashboardDokterPage(Hooks.getDriver());
        String  expectedURL = "http://127.0.0.1:8000/orangtua/dashboard";
        Assertions.assertEquals(expectedURL, dokterPage.getActualURL());
    }

}

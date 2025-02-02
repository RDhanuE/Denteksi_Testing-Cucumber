package stepDefinitions;

import com.aventstack.extentreports.Status;
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

import static stepDefinitions.Hooks.extent;


public class LoginSteps {


    @Given("User is in the login page")
    public void navigateToLoginPage(){
        Hooks.getDriver().get("http://127.0.0.1:8000");
        Hooks.test.log(Status.PASS,"Open browser at Login Page");
    }

    @When("User submit admin credentials")
    public void submitAdminCredentials() throws InterruptedException {
        LoginPage login = new LoginPage(Hooks.getDriver());
        login.enterEmail("admin@admin.com");
        login.enterPassword("admin1234");
        login.clickLogin();
        Hooks.test.log(Status.PASS,"User submit as admin");
    }

    @Then("User should be redirected to admin dashboard")
    public void loginAdminSuccesful() {
        DashboardAdminPage adminPage = new DashboardAdminPage(Hooks.getDriver());
        String expectedURL = "http://127.0.0.1:8000/admin/dashboard";
        Assertions.assertEquals(expectedURL, adminPage.getActualURL());
        Hooks.test.log(Status.PASS,"User get on dashboard page");
    }

    @When("User submit dokter credentials")
    public void submitDokterCredentials() throws InterruptedException {
        LoginPage loginPage = new LoginPage(Hooks.getDriver());
        loginPage.enterEmail("dokter@dokter.com");
        loginPage.enterPassword("dokter1234");
        loginPage.clickLogin();
        Hooks.test.log(Status.PASS,"User submit dokter account");
    }

    @Then("User should be redirected to dokter dashboard")
    public void loginDokterSuccesful() {
        DashboardDokterPage dokterPage = new DashboardDokterPage(Hooks.getDriver());
        String  expectedURL = "http://127.0.0.1:8000/orangtua/dashboard";
        Assertions.assertEquals(expectedURL, dokterPage.getActualURL());
        Hooks.test.log(Status.PASS,"User redirect to dokter dashboard page");
    }

    @When("User submits empty credentials")
    public void submitEmptyCredentials(){
        LoginPage loginPage = new LoginPage(Hooks.getDriver());
        loginPage.clickLogin();
        Hooks.test.log(Status.PASS,"User submit credential");
    }

    @Then("User should see an error message \"Email tidak boleh kosong\" and \"Password tidak boleh kosong\"")
    public void seeErrorEmptyMessage(){
        LoginPage loginPage = new LoginPage(Hooks.getDriver());
        String expectedErrorEmailMessage = "Email tidak boleh kosong";
        String expectedErrorPasswordMessage = "Password tidak boleh kosong";
        String actualErrorEmailMessage = loginPage.getErrorEmptyEmailMessage();
        String actualErrorPasswordMessage = loginPage.getErrorEmptyPasswordMessage();
        Assertions.assertEquals(expectedErrorEmailMessage, actualErrorEmailMessage);
        Assertions.assertEquals(expectedErrorPasswordMessage, actualErrorPasswordMessage);
        Hooks.test.log(Status.PASS,"User see error message");
    }

    @When("User submits wrong credentials")
    public void submitWrongCredentials() throws InterruptedException {
        LoginPage loginPage = new LoginPage(Hooks.getDriver());
        loginPage.enterEmail("dkoter@dokter.com");
        loginPage.enterPassword("dater1234");
        loginPage.clickLogin();
        Hooks.test.log(Status.PASS,"User submit wrong credential");
    }

    @Then("User should see an error message \"Email atau kata sandi salah!\"")
    public void seeErrorWrongMessage(){
        LoginPage loginPage = new LoginPage(Hooks.getDriver());
        String expectedErrorMessage = "Email atau kata sandi salah!";
        String actualErrorMessage = loginPage.getErrorWrongMessage();
        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
        Hooks.test.log(Status.PASS,"User see error message");
    }





}

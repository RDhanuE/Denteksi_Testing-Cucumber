package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;
import pages.admin.DashboardAdminPage;

public class LogoutSteps {
    @Given("User is logged in as admin")
    public void user_is_logged_in_as_admin() throws InterruptedException {
        Hooks.getDriver().get("http://127.0.0.1:8000");
        LoginPage login = new LoginPage(Hooks.getDriver());
        login.enterEmail("admin@admin.com");
        login.enterPassword("admin1234");
        login.clickLogin();
        Hooks.test3.log(Status.PASS,"User login as admin");
    }
    @Given("User is in the admin dashboard page")
    public void user_is_in_the_admin_dashboard_page() {
        String expectedURL = "http://127.0.0.1:8000/admin/dashboard";
        Assertions.assertEquals(expectedURL, Hooks.getDriver().getCurrentUrl());
        Hooks.test3.log(Status.PASS,"User in admin dashboard page");
    }

    @When("User press the logout button")
    public void user_press_the_logout_button() throws InterruptedException {
        DashboardAdminPage dashboardAdminPage = new DashboardAdminPage(Hooks.getDriver());
        dashboardAdminPage.logout();
        Hooks.test3.log(Status.PASS,"User press logout button");
    }
    @Then("User will be redirected to login page")
    public void user_will_be_redirected_to_login_page() {
        String expectedURL = "http://127.0.0.1:8000/";
        Assertions.assertEquals(expectedURL, Hooks.getDriver().getCurrentUrl());
        Hooks.test3.log(Status.PASS,"User redirect to login page");
    }


}

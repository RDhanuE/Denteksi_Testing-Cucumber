package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.dokter.DashboardDokterPage;

public class PeriksaSekarangSteps {
    DashboardDokterPage dashboardDokter;
    @Given("User logged in as dokter")
    public void loginDokter() throws InterruptedException{
        Hooks.getDriver().get("http://127.0.0.1:8000");
        LoginPage login = new LoginPage(Hooks.getDriver());
        login.enterEmail("dokter@dokter.com");
        login.enterPassword("dokter1234");
        login.clickLogin();
    }

    @Given("User is in the dashboard page")
    public void onTheDashboardPage(){
        String expectedURL = "http://127.0.0.1:8000/admin/dashboard";
        Assertions.assertEquals(expectedURL, Hooks.getDriver().getCurrentUrl());
    }

    @Given("User click the button periksa")
    public void redirectToPagePeriksa(){
        dashboardDokter = new DashboardDokterPage(Hooks.getDriver());
        dashboardDokter.clickTombol();
    }

    @Given("User is in the pemeriksaan page")
    public void userInPagePeriksa(){
        String expectedURL = "http://127.0.0.1:8000/orangtua/anak/create";
        Assertions.assertEquals(expectedURL, Hooks.getDriver().getCurrentUrl());
    }

    @When("User fill the form")
    public void fillPemeriksaanForm(){
        dashboardDokter = new DashboardDokterPage(Hooks.getDriver());
        dashboardDokter.fillName("indah");
        dashboardDokter.fillNamaOrtu("nurdiana");
        dashboardDokter.fillNomorWhatsapp("089687349067");
//        masih kurang isi foto
        dashboardDokter.clickTombol();

    }

    @Then("Pemeriksaan page should be refresh")
    public void redirectPemeriksaanForm(){

    }
}

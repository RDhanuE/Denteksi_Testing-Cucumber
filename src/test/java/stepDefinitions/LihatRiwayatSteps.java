package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;
import pages.dokter.DashboardDokterPage;

public class LihatRiwayatSteps {

    DashboardDokterPage dashboardDokter;

//    @Given("User logged in as dokter")
//    public void loginDokter() throws InterruptedException{
//        Hooks.getDriver().get("http://127.0.0.1:8000");
//        LoginPage login = new LoginPage(Hooks.getDriver());
//        login.enterEmail("dokter@dokter.com");
//        login.enterPassword("dokter1234");
//        login.clickLogin();
//    }

//    @And("User is on the dashboard page")
//    public void onTheDashboardPage(){
//        String expectedURL = "http://127.0.0.1:8000/orangtua/dashboard";
//        Assertions.assertEquals(expectedURL, Hooks.getDriver().getCurrentUrl());
//    }

    @And("User clicks the riwayat pemeriksaan navigation")
    public void userClicksTheRiwayatPemeriksaanNavigation() {
        dashboardDokter.navigateToRiwayatPage();
    }

    @And("User is on the riwayat pemeriksaan page")
    public void userIsOnTheRiwayatPemeriksaanPage() {
        String expectedURL = "http://127.0.0.1:8000/orangtua/pemeriksaan/riwayat";
        Assertions.assertEquals(expectedURL, Hooks.getDriver().getCurrentUrl());
    }

    @When("User clicks the lihat hasil button")
    public void userClicksTheLihatHasilButton() {

    }

    @Then("User is redirected to the hasil pemeriksaan page")
    public void userIsRedirectedToTheHasilPemeriksaanPage() {

    }

    @And("User sees the hasil pemeriksaan image")
    public void userSeesTheHasilPemeriksaanImage() {

    }
}

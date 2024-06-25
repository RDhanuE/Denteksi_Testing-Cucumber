package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;
import pages.dokter.DashboardDokterPage;
import pages.dokter.RiwayatPemeriksaanPage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LihatRiwayatSteps {

    DashboardDokterPage dashboardDokter;
    RiwayatPemeriksaanPage riwayatPemeriksaan;

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
        dashboardDokter = new DashboardDokterPage(Hooks.getDriver());
        dashboardDokter.navigateToRiwayatPage();
    }

    @And("User is on the riwayat pemeriksaan page")
    public void userIsOnTheRiwayatPemeriksaanPage() {
        String expectedURL = "http://127.0.0.1:8000/orangtua/pemeriksaan/riwayat";
        Assertions.assertEquals(expectedURL, Hooks.getDriver().getCurrentUrl());
    }

    @When("User clicks the lihat hasil button")
    public void userClicksTheLihatHasilButton() throws InterruptedException {
        Thread.sleep(10000);
        riwayatPemeriksaan.clickLihatHasil();
    }

    @Then("User is redirected to the hasil pemeriksaan page")
    public void userIsRedirectedToTheHasilPemeriksaanPage() {
        String urlPattern = "http://127.0.0.1:8000/orangtua/hasil/[a-f0-9\\-]+/periksa";
        String currentURL = Hooks.getDriver().getCurrentUrl();
        Pattern pattern = Pattern.compile(urlPattern);
        Matcher matcher = pattern.matcher(currentURL);
        Assertions.assertTrue(matcher.matches());
    }

    @And("User sees the hasil pemeriksaan image")
    public void userSeesTheHasilPemeriksaanImage() {

    }
}

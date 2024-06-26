package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;
import pages.dokter.DashboardDokterPage;
import pages.dokter.HasilPemeriksaanPage;
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
        Hooks.test2.log(Status.PASS, "User navigated to page \"riwayat pemeriksaan\"");
    }

    @And("User is on the riwayat pemeriksaan page")
    public void userIsOnTheRiwayatPemeriksaanPage() {
        String expectedURL = "http://127.0.0.1:8000/orangtua/pemeriksaan/riwayat";
        Assertions.assertEquals(expectedURL, Hooks.getDriver().getCurrentUrl());
        Hooks.test2.log(Status.PASS, "Page \"Riwayat Pemeriksaan\" is correctly displayed");
    }

    @When("User clicks the lihat hasil button")
    public void userClicksTheLihatHasilButton() throws InterruptedException {
        Thread.sleep(10000);
        riwayatPemeriksaan = new RiwayatPemeriksaanPage(Hooks.getDriver());
        riwayatPemeriksaan.clickLihatHasil();
        Hooks.test2.log(Status.PASS, "User navigated to page \"Hasil Pemeriksaan\"");
    }

    @Then("User is redirected to the hasil pemeriksaan page")
    public void userIsRedirectedToTheHasilPemeriksaanPage() {
        String urlPattern = "http://127.0.0.1:8000/orangtua/hasil/[a-f0-9\\-]+/periksa";
        String currentURL = Hooks.getDriver().getCurrentUrl();
        Pattern pattern = Pattern.compile(urlPattern);
        Matcher matcher = pattern.matcher(currentURL);
        Assertions.assertTrue(matcher.matches());
        Hooks.test2.log(Status.PASS, "Page \"Hasil Pemeriksaan\" is correctly displayed");
    }

    @And("User sees the hasil pemeriksaan image")
    public void userSeesTheHasilPemeriksaanImage() {
        HasilPemeriksaanPage hasilPemeriksaanPage = new HasilPemeriksaanPage(Hooks.getDriver());
        Assertions.assertTrue(hasilPemeriksaanPage.getHasilImage());
        Hooks.test2.log(Status.PASS, "Image is correctly displayed on top of the page");
    }
}

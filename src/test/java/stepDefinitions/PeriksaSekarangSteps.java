package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
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
        Hooks.test1.log(Status.PASS,"User login dokter account");
    }

    @And("User is in the dashboard page")
    public void onTheDashboardPage(){
        String expectedURL = "http://127.0.0.1:8000/orangtua/dashboard";
        Assertions.assertEquals(expectedURL, Hooks.getDriver().getCurrentUrl());
        Hooks.test1.log(Status.PASS,"User get on dashboard page");
    }

    @And("User click the button periksa")
    public void redirectToPagePeriksa(){
        dashboardDokter = new DashboardDokterPage(Hooks.getDriver());
        dashboardDokter.clickTombolDepan();
        Hooks.test1.log(Status.PASS,"User click on button on dashboard");
    }

    @And("User is in the pemeriksaan page")
    public void userInPagePeriksa(){
        String expectedURL = "http://127.0.0.1:8000/orangtua/anak/create";
        Assertions.assertEquals(expectedURL, Hooks.getDriver().getCurrentUrl());
        Hooks.test1.log(Status.PASS,"User get on pemeriksaan form page");
    }

    @When("User fill the form")
    public void fillPemeriksaanForm(){
        dashboardDokter = new DashboardDokterPage(Hooks.getDriver());
        String imagePath = System.getProperty("user.dir") + "/images/0014-1-F1F.png";

        dashboardDokter.fillName("indah");
        dashboardDokter.fillNamaOrtu("nurdiana");
        dashboardDokter.fillNomorWhatsapp("089687349067");
        dashboardDokter.fillGambar(imagePath);
        dashboardDokter.clickTombolForm();

        Hooks.test1.log(Status.PASS,"User added data pemeriksaan form");
    }

    @When("User fill form except name")
    public void userFillFormExceptName(){
        String imagePath = System.getProperty("user.dir") + "/images/0014-1-F1F.png";
        dashboardDokter.fillNamaOrtu("nurdiana");
        dashboardDokter.fillNomorWhatsapp("089687349067");
        dashboardDokter.fillGambar(imagePath);
        dashboardDokter.clickTombolForm();
        Hooks.test1.log(Status.PASS,"User added data except name");
    }

    @When("User fill the form except photos")
    public void userFIllFormExceptPhotos(){
        dashboardDokter.fillName("indah");
        dashboardDokter.fillNamaOrtu("nurdiana");
        dashboardDokter.fillNomorWhatsapp("089687349067");
        dashboardDokter.clickTombolForm();
        Hooks.test1.log(Status.PASS,"User added data except photos");
    }


    @Then("Field shows error message")
    public void showsErrorMessageOnField(){
        Assertions.assertTrue(dashboardDokter.checkErrorMessage());
        Hooks.test1.log(Status.PASS,"error shows");
    }


    @Then("Redirect to dahsboard page")
    public void checkDashboardPage(){
        String expectedURL = "http://127.0.0.1:8000/orangtua/dashboard";
        Assertions.assertEquals(expectedURL, Hooks.getDriver().getCurrentUrl());
        Hooks.test1.log(Status.PASS,"User get on dashboard page");
    }



    @Then("Pemeriksaan page should be refresh")
    public void redirectPemeriksaanForm(){
        String expectedURL = "http://127.0.0.1:8000/orangtua/anak/create";
        Assertions.assertEquals(expectedURL, Hooks.getDriver().getCurrentUrl());
        Hooks.test1.log(Status.PASS,"Pemeriksaan page refreshed");
    }

    @Then("Form Pemeriksaan should be added")
    public void pemeriksaanAdded(){
        String expectedURL = "http://127.0.0.1:8000/orangtua/anak/create";
        Assertions.assertEquals(expectedURL, Hooks.getDriver().getCurrentUrl());
        Hooks.test1.log(Status.PASS,"User redirect to same page pemeriksaan");
    }

    @Then("User fill the form except whatsapp and orangtua")
    public void addFormExceptWhatsapp(){
        String imagePath = System.getProperty("user.dir") + "/images/0014-1-F1F.png";
        dashboardDokter.fillName("indah");
        dashboardDokter.fillGambar(imagePath);
        dashboardDokter.clickTombolForm();
        Hooks.test1.log(Status.PASS,"User added data except whatsapp and orangtua");

    }


}

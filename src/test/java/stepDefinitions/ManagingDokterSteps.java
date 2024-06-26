package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.admin.DaftarDokterPage;
import pages.admin.DashboardAdminPage;
import pages.admin.EditDokterPage;
import pages.admin.TambahDokterPage;

import javax.swing.*;

public class ManagingDokterSteps {

    TambahDokterPage tambahDokterPage;
    DaftarDokterPage daftarDokterPage;
    DashboardAdminPage dashboardAdminPage;
    EditDokterPage editDokterPage;

    @Given("User open dokter page")
    public void user_open_dokter_page() throws InterruptedException {
        dashboardAdminPage = new DashboardAdminPage(Hooks.getDriver());
        dashboardAdminPage.navigateToDokterPage();
        Hooks.test4.log(Status.PASS, "User is navigated to page \"Dokter\"");
    }
    @When("User open tambah data form")
    public void user_open_tambah_data_form() {
        daftarDokterPage = new DaftarDokterPage(Hooks.getDriver());
        daftarDokterPage.navigateToTambahDokter();
        Hooks.test4.log(Status.PASS, "User is navigated to page \"Tambah Dokter\"");
    }
    @When("Fill out the form for adding Dokter account")
    public void fill_out_the_form_for_adding_dokter_account() {
        tambahDokterPage = new TambahDokterPage(Hooks.getDriver());
        tambahDokterPage.FillInTambahDokterForm();
        Hooks.test4.log(Status.PASS, "Field data is filled and submitted succesfully");
    }

    @Then("Dokter account should be added to dokter list")
    public void dokter_account_should_be_added_to_dokter_list() {
        String ExpectedURL = "http://127.0.0.1:8000/admin/orangtua";
        Assertions.assertEquals(ExpectedURL, Hooks.getDriver().getCurrentUrl());
        Assertions.assertTrue(daftarDokterPage.checkTambahDokter());
        Hooks.test4.log(Status.PASS, "Dokter account is added and displayed correctly");
    }

    @When("Change the data for that Dokter")
    public void change_the_data_for_that_dokter() {
        editDokterPage = new EditDokterPage(Hooks.getDriver());
        editDokterPage.changeDokterName();
        Hooks.test4.log(Status.PASS, "Field name is succesfully changed");
    }
    @When("User press the edit button of one of the dokter account")
    public void user_press_the_edit_button_of_one_of_the_dokter_account() {
        daftarDokterPage = new DaftarDokterPage(Hooks.getDriver());
        daftarDokterPage.navigateToEditDokter();
        Hooks.test4.log(Status.PASS, "User is navigated to page \"edit dokter\"");
    }
    @Then("The dokter account should be changed")
    public void the_dokter_account_should_be_changed() {
        String ExpectedURL = "http://127.0.0.1:8000/admin/orangtua";
        Assertions.assertEquals(ExpectedURL, Hooks.getDriver().getCurrentUrl());
        Assertions.assertEquals("Testing2", daftarDokterPage.checkUbahDokter());
        Hooks.test4.log(Status.PASS, "Dokter account's name is changed and displayed succesfully");
    }

    @When("User press the delete button of one of the dokter account")
    public void user_press_the_delete_button_of_one_of_the_dokter_account() {
        daftarDokterPage = new DaftarDokterPage(Hooks.getDriver());
        daftarDokterPage.deleteDokter();
        Hooks.test4.log(Status.PASS, "Delete button is pressed succesfully");
    }
    @When("Confirm the deletion")
    public void confirm_the_deletion() {
        daftarDokterPage.confirmDeleteDokter();
        Hooks.test4.log(Status.PASS, "Confirmation pop-up displayed succesfully");
    }
    @Then("The dokter account should be removed")
    public void the_dokter_account_should_be_removed() {
        String ExpectedURL = "http://127.0.0.1:8000/admin/orangtua";
        Assertions.assertEquals(ExpectedURL, Hooks.getDriver().getCurrentUrl());
        Assertions.assertEquals("Data Berhasil di hapus.", daftarDokterPage.hapusDataMessage());
        Hooks.test4.log(Status.PASS, "Delete message pop-up displayed and dokter account is deleted succesfully");
    }



}

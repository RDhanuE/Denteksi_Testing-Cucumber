package pages.admin;

import object.admin.DaftarAdminObject;
import object.admin.DaftarPasienObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class DaftarPasienPage extends BasePage {

    private DaftarPasienObject daftarPasienObject;

    public DaftarPasienPage(WebDriver driver) {
        super(driver);
        daftarPasienObject = new DaftarPasienObject(driver);
    }

    public void navigateToTambahPasien(){
        WebElement buttonTambahPasien = driver.findElement(daftarPasienObject.getTambahDataButton());
        buttonTambahPasien.click();
    }

    public void navigateToEditPasien(){
        WebElement buttonEditPasien = driver.findElement(daftarPasienObject.getEditButton());
        buttonEditPasien.click();
    }

    public void deletePasien(){
        WebElement buttonDeletePasien = driver.findElement(daftarPasienObject.getDeleteButton());
        buttonDeletePasien.click();
    }

    public void confirmDeletePasien(){
        WebElement buttonConfirmDelete = driver.findElement(daftarPasienObject.getDeleteConfirmationButton());
        buttonConfirmDelete.click();
    }

}

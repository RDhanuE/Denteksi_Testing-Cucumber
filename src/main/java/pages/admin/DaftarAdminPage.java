package pages.admin;

import object.admin.DaftarAdminObject;
import object.admin.DaftarDokterObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class DaftarAdminPage extends BasePage {

    private DaftarAdminObject daftarAdminObject;

    public DaftarAdminPage(WebDriver driver) {
        super(driver);
        daftarAdminObject = new DaftarAdminObject(driver);
    }

    public void navigateToTambahAdmin(){
        WebElement buttonTambahAdmin = driver.findElement(daftarAdminObject.getTambahDataButton());
        buttonTambahAdmin.click();
    }

    public void navigateToEditAdmin(){
        WebElement buttonEditAdmin = driver.findElement(daftarAdminObject.getEditButton());
        buttonEditAdmin.click();
    }

    public void deleteAdmin(){
        WebElement buttonDeleteAdmin = driver.findElement(daftarAdminObject.getDeleteButton());
        buttonDeleteAdmin.click();
    }

    public void confirmDeleteDokter(){
        WebElement buttonConfirmDelete = driver.findElement(daftarAdminObject.getDeleteConfirmationButton());
        buttonConfirmDelete.click();
    }

}

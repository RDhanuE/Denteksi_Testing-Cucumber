package pages.admin;

import object.admin.DaftarDokterObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class DaftarDokterPage extends BasePage {

    private DaftarDokterObject daftarDokterObject;

    public DaftarDokterPage(WebDriver driver) {
        super(driver);
        daftarDokterObject = new DaftarDokterObject(driver);
    }

    public void navigateToTambahDokter(){
        WebElement buttonTambahDokter = driver.findElement(daftarDokterObject.getTambahDataButton());
        buttonTambahDokter.click();
    }

    public void navigateToEditDokter(){
        WebElement buttonEditDokter = driver.findElement(daftarDokterObject.getEditDataButton());
        buttonEditDokter.click();
    }

    public void deleteDokter(){
        WebElement buttonDeleteDokter = driver.findElement(daftarDokterObject.getDeleteDataButton());
        buttonDeleteDokter.click();
    }

    public void confirmDeleteDokter(){
        WebElement buttonConfirmDelete = driver.findElement(daftarDokterObject.getDeleteConfirmation());
        buttonConfirmDelete.click();
    }

    public boolean checkTambahDokter() {
        return driver.findElement(By.xpath("//*[@id=\"table-orangtua\"]/tbody/tr[2]/td[2]")).isDisplayed();
    }

    public String checkUbahDokter() {
        return driver.findElement(By.xpath("//*[@id=\"table-orangtua\"]/tbody/tr[2]/td[3]")).getText();
    }

    public String hapusDataMessage() {
        return driver.findElement(daftarDokterObject.getHapusDataMessage()).getText();
    }

}

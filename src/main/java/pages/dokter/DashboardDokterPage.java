package pages.dokter;

import object.dokter.DashboardDokterObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class DashboardDokterPage extends BasePage {
    private DashboardDokterObject dokterObject;

    public DashboardDokterPage(WebDriver driver) {
        super(driver);
        dokterObject = new DashboardDokterObject(driver);
    }
    public void navigateToRiwayatPage() {
        WebElement navLink = driver.findElement(dokterObject.getRiwayatNavigation());
        navLink.click();
    }
    public void clickTombolForm(){
        WebElement clickElement = driver.findElement(dokterObject.getTombolPeriksaSekarang());
        clickElement.submit();
    }
    public void clickTombolDepan(){
        WebElement clickElement = driver.findElement(dokterObject.getTombolPeriksaSekarang());
        clickElement.click();
    }
    public void clickTombolCancel(){
        WebElement clickElement = driver.findElement(dokterObject.getTombolCancel());
        clickElement.submit();
    }
    public void fillName(String name){
        WebElement clickElement = driver.findElement(dokterObject.getName());
        clickElement.sendKeys(name);
    }
    public void fillNamaOrtu(String namaOrtu){
        WebElement clickElement = driver.findElement(dokterObject.getNamaOrangtua());
        clickElement.sendKeys(namaOrtu);
    }
    public Boolean checkErrorMessage(){
        WebElement messageName = driver.findElement(dokterObject.getErrorMessage());
        return messageName.isDisplayed();
    }


    public void fillNomorWhatsapp(String nomor){
        WebElement clickElement = driver.findElement(dokterObject.getNomorWhatsapp());
        clickElement.sendKeys(nomor);
    }

    public void fillGambar(String gambar){
        WebElement fileInput = driver.findElement(dokterObject.getGambarForm());
        fileInput.sendKeys(gambar);
    }
}

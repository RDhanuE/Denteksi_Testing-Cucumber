package pages.dokter;

import object.dokter.DashboardDokterObject;
import object.dokter.PemeriksaanGigiObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class PemeriksaanGigiPage extends BasePage {
    private PemeriksaanGigiObject pemeriksaanObject;

    public PemeriksaanGigiPage(WebDriver driver) {
        super(driver);
        pemeriksaanObject = new PemeriksaanGigiObject(driver);
    }

    public void clickTombolPeriksa(){
        WebElement clickElement = driver.findElement(pemeriksaanObject.getPeriksaButton());
        clickElement.submit();
    }
    public void clickTombolScanQR(){
        WebElement clickElement = driver.findElement(pemeriksaanObject.getScanQRButton());
        clickElement.click();
    }
    public void fillName(String name){
        WebElement clickElement = driver.findElement(pemeriksaanObject.getNamaTextBox());
        clickElement.sendKeys(name);
    }
    public void fillNamaOrtu(String namaOrtu){
        WebElement clickElement = driver.findElement(pemeriksaanObject.getNamaOrtuTextBox());
        clickElement.sendKeys(namaOrtu);
    }

    public void fillNomorWhatsapp(String nomor){
        WebElement clickElement = driver.findElement(pemeriksaanObject.getNoWhatsappTextBox());
        clickElement.sendKeys(nomor);
    }

    public void fillGambar(String gambar){
        WebElement fileInput = driver.findElement(pemeriksaanObject.getUploadPhoto());
        fileInput.sendKeys(gambar);
    }
}

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
    public void clickTombol(){
        WebElement clickElement = driver.findElement(dokterObject.getTombolPeriksaSekarang());
        clickElement.click();
    }
    public void fillName(String name){
        WebElement clickElement = driver.findElement(dokterObject.getName());
        clickElement.sendKeys(name);
    }
    public void fillNamaOrtu(String namaOrtu){
        WebElement clickElement = driver.findElement(dokterObject.getNamaOrangtua());
        clickElement.sendKeys(namaOrtu);
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

package object.dokter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PemeriksaanGigiObject {
    WebDriver driver;

    public PemeriksaanGigiObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getNamaTextBox() {return By.id("nama");}
    public By getNamaOrtuTextBox() {return By.id("nama_orangtua");}
    public By getNoWhatsappTextBox() {return By.id("no_whatsapp");}
    public By getUploadPhoto() {return By.xpath("/html/body/div/div/div/div[1]/div/div/div[2]/form/div[4]/div/div/input");}
    public By scanQRButton() {return By.xpath("/html/body/div/div/div/div[1]/div/div/div[2]/form/div[5]/button[1]");}
    public By periksaButton() {return By.xpath("/html/body/div/div/div/div[1]/div/div/div[2]/form/div[5]/button[3]");}
}

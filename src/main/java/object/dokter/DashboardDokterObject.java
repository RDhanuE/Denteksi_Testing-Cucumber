package object.dokter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardDokterObject {
    WebDriver driver;

    public DashboardDokterObject(WebDriver driver){
        this.driver = driver;
    }

    public By getTombolPeriksaSekarang(){ return By.id("btn-periksa");}
    public By getTombolCancel(){ return By.id("btn-cancel");}

    public By getErrorMessage(){
        return By.xpath("//*[text()='Nama wajib diisi']");
    }

    public By getName(){
        return By.id("nama");
    }
    public By getNamaOrangtua(){
        return By.id("nama_orangtua");
    }
    public By getGambarForm(){
        return By.id("gambar1");
    }
    public By getNomorWhatsapp(){
        return By.id("no_whatsapp");
    }
    public By getGambar(){ return By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/img");}
}

package object.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TambahDokterObject {

    WebDriver webDriver;

    public TambahDokterObject(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public By getNamaDokter(WebDriver webDriver) { return By.id("nama"); }

    public By getEmailDokter(WebDriver driver) { return By.id("email"); }

    public By getPasswordDokter(WebDriver driver) { return By.id("password"); }

    public By getPasswordKonfirmasi(WebDriver driver) { return By.xpath("/html/body/div/div/div/div/div[2]/div/div/form/div[4]/input"); }

    public By getTambahButton(WebDriver driver) { return By.xpath("//*[@id=\"orangtua-store\"]/div[5]/button"); }
}

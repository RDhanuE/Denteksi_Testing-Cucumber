package object.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditDokterObject {

    WebDriver driver;

    public EditDokterObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getNamaDokter(){ return By.id("nama"); }
    public By getUbahButton(){ return By.xpath("//*[@id=\"orangtua-store\"]/div[5]/button"); }

}

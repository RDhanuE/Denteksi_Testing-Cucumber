package object.dokter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HasilPemeriksaanObject {

    WebDriver driver;

    public HasilPemeriksaanObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getHasilImage(){ return By.id("gigi-depan-asli") ;}

}

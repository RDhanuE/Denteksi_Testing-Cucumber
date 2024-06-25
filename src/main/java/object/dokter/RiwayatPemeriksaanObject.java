package object.dokter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RiwayatPemeriksaanObject {

    WebDriver webDriver;

    public RiwayatPemeriksaanObject(WebDriver driver) {
        this.webDriver = driver;
    }

    public By getLihatHasilButton() {
        return By.xpath("//a[contains(text(), 'Lihat Hasil')]");
    }
}

package object.dokter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RiwayatPemeriksaanObject {

    WebDriver webDriver;

    public RiwayatPemeriksaanObject(WebDriver driver) {
        this.webDriver = driver;
    }

    public By getLihatHasilButton() {
        return By.xpath("//*[@id=\"table-gigi\"]/tbody/tr[3]/td[4]/a[1]");
    }
}

package pages.dokter;

import object.dokter.RiwayatPemeriksaanObject;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class RiwayatPemeriksaanPage extends BasePage {

    private RiwayatPemeriksaanObject riwayatObject;

    public RiwayatPemeriksaanPage(WebDriver driver) {
        super(driver);
        riwayatObject = new RiwayatPemeriksaanObject(driver);
    }

}

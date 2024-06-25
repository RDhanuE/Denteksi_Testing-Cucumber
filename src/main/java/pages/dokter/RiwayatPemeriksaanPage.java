package pages.dokter;

import object.dokter.RiwayatPemeriksaanObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;

public class RiwayatPemeriksaanPage extends BasePage {

    private RiwayatPemeriksaanObject riwayatObject;

    public RiwayatPemeriksaanPage(WebDriver driver) {
        super(driver);
        riwayatObject = new RiwayatPemeriksaanObject(driver);
    }

    public void clickLihatHasil() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(riwayatObject.getLihatHasilButton()));
        button.click();
    }
}

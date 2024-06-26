package pages.dokter;

import object.dokter.HasilPemeriksaanObject;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class HasilPemeriksaanPage extends BasePage {
    private HasilPemeriksaanObject hasilPemeriksaanObject;

    public HasilPemeriksaanPage(WebDriver driver) {
        super(driver);
        hasilPemeriksaanObject = new HasilPemeriksaanObject(driver);
    }

    public boolean getHasilImage(){
        return  driver.findElement(hasilPemeriksaanObject.getHasilImage()).isDisplayed();
    }
}

package pages.admin;

import object.admin.TambahDokterObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class TambahDokterPage extends BasePage {

    TambahDokterObject tambahDokterObject;

    public TambahDokterPage(WebDriver driver) {
        super(driver);
        tambahDokterObject = new TambahDokterObject(driver);
    }

    public void FillInTambahDokterForm() {
        WebElement name = driver.findElement(tambahDokterObject.getNamaDokter(driver));
        name.sendKeys("Testing");
        WebElement email = driver.findElement(tambahDokterObject.getEmailDokter(driver));
        email.sendKeys("Testing@Testing.com");
        WebElement password = driver.findElement(tambahDokterObject.getPasswordDokter(driver));
        WebElement passwordConfirmation = driver.findElement(tambahDokterObject.getPasswordKonfirmasi(driver));
        String passwordDokter = "Testing";
        password.sendKeys(passwordDokter);
        passwordConfirmation.sendKeys(passwordDokter);
        driver.findElement(tambahDokterObject.getTambahButton(driver)).click();
    }


}

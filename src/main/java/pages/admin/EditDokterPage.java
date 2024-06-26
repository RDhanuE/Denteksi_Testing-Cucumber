package pages.admin;

import object.admin.EditDokterObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class EditDokterPage extends BasePage {

    private EditDokterObject editDokterObject;
    public EditDokterPage(WebDriver driver) {
        super(driver);
        editDokterObject = new EditDokterObject(driver);
    }

    public void changeDokterName(){
        WebElement dokterName = driver.findElement(editDokterObject.getNamaDokter());
        dokterName.clear();
        dokterName.sendKeys("Testing2");
        driver.findElement(editDokterObject.getUbahButton()).click();
    }



}

package object.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPasienObject {

    WebDriver driver;

    public EditPasienObject(WebDriver driver){
        this.driver = driver;
    }

    public By getNamaTextBox(){return By.id("nama");}
    public By getNamaOrangTuaTextBox(){return By.id("nama_orangtua");}
    public By getNoWhatsappTextBox(){return By.id("no_whatsapp");}
    public By getPasswordToggleButtton() {return By.id("chk");}
    public By getSubmitButton() {return By.xpath("/html/body/div/div/div/div/div[2]/div/div/form/div[5]/button");}
}

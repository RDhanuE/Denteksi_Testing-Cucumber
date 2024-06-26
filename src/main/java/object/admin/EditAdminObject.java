package object.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditAdminObject {

    WebDriver driver;

    public EditAdminObject(WebDriver driver){
        this.driver = driver;
    }

    public By getPasswordToggleButtton() {return By.id("chk");}
    public By getPasswordTextBox() {return By.id("password");}
    public By getEmailTextBox() {return By.id("email");}
    public By getSubmitButton() {return By.xpath("/html/body/div/div/div/div/div[2]/div/div/form/div[5]/button");}
}

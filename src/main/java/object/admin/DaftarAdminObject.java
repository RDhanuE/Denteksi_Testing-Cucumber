package object.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DaftarAdminObject {
    WebDriver driver;

    public DaftarAdminObject(WebDriver driver){
        this.driver = driver;
    }

    public By getTambahDataButton(){return By.id("btn-create");}
    public By getSearchBarAdmin(){return By.xpath("//*[@id=\"table-admin_filter\"]/label/input");}
    public By getEditButton(){return By.id("btn-edit");}
    public By getDeleteButton(){return By.id("btn-delete");}
    public By getDeleteConfirmationButton(){return By.xpath("/html/body/div[2]/div/div[3]/button[1]");}


}

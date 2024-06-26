package object.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DaftarDataAdminObject {
    WebDriver driver;

    public DaftarDataAdminObject(WebDriver driver){
        this.driver = driver;
    }

    public By getTambahDataButton(){return By.id("btn-create");}
    public By getSearchBarAdmin(){return By.xpath("//*[@id=\"table-admin_filter\"]/label/input");}
    public By getEditButton(){return By.id("btn-edit");}
    public By getDeleteButton(){return By.id("btn-delete");}

}

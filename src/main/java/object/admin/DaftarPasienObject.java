package object.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DaftarPasienObject {
    WebDriver driver;

    public DaftarPasienObject(WebDriver driver){
        this.driver = driver;
    }

    public By getTambahDataButton(){return By.id("btn-create");}
    public By getSearchBarPasien(){return By.xpath("//*[@id=\"table-anak_filter\"]/label/input");}
    public By getEditButton(){return By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr/td[4]/a[1]");}
    public By getDeleteButton(){return By.id("btn-delete");}
    public By getDeleteConfirmationButton(){return By.xpath("/html/body/div[2]/div/div[3]/button[1]");}
    public By getCetakQRButton(){return By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr/td[4]/a[3]");}


}

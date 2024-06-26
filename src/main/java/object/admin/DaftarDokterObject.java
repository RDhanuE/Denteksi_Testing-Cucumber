package object.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DaftarDokterObject {

    WebDriver webDriver;

    public DaftarDokterObject(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public By getTambahDataButton(){ return By.id("btn-create"); }

    public By getEditDataButton(){ return By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[2]/td[4]/a[1]"); }

    public By getDeleteDataButton(){ return By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[2]/td[4]/a[2]"); }

    public By getDeleteConfirmation(){ return By.xpath("/html/body/div[2]/div/div[3]/button[1]"); }

    public By getHapusDataMessage(){ return By.xpath("//*[@id=\"swal2-content\"]");}
}

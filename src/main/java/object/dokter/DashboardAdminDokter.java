package object.dokter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardAdminDokter {
    WebDriver driver;

    public DashboardAdminDokter(WebDriver driver){
        this.driver = driver;
    }

    public By getTombolPeriksa(){ return By.id("");}
    public By getGambar(){ return By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/img");}


}

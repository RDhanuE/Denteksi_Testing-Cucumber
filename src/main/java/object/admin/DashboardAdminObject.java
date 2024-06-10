package object.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardAdminObject {
    WebDriver driver;

    public DashboardAdminObject(WebDriver driver){
        this.driver = driver;
    }

    public By getLogo(){return By.xpath("/html/body/div/nav/div[1]/a/img");}
    public By getBurgerButton(){return By.xpath("/html/body/div/nav/div[1]/div");}
    public By getDashboardMenu(){return By.xpath("/html/body/div/nav/div[2]/ul/li[2]/a");}
    public By getDataPenggunaMenu(){return By.xpath("/html/body/div/nav/div[2]/ul/li[2]/a");}
    public By getAdminLink(){return By.linkText("Admin");}
    public By getDokterLink(){return By.linkText("Dokter");}
    public By getPasienLink(){return By.linkText("Pasien");}
    public By getDashboardData(){return By.className("card");}
    public By getNotificationButton(){return By.id("notificationDropdown");}
    public By getProfileButton(){return By.xpath("//*[@id=\"profileDropdown\"]/div");}
    public By getProfilePhoto(){return By.xpath("/html/body/div/div/nav/div/ul/li[2]/div/div/div[1]/img");}
    public By getProfileName(){return By.xpath("/html/body/div/div/nav/div/ul/li[2]/div/div/div[2]/p[1]");}
    public By getProfileEmail(){return By.xpath("/html/body/div/div/nav/div/ul/li[2]/div/div/div[2]/p[2]");}
    public By getLogoutButton(){return By.linkText("Log Out");}
}

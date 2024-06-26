package pages.admin;

import io.cucumber.messages.types.Hook;
import object.admin.DashboardAdminObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class DashboardAdminPage extends BasePage {
    private DashboardAdminObject dashboardAdminObject;
    public DashboardAdminPage(WebDriver driver) {
        super(driver);
        dashboardAdminObject = new DashboardAdminObject(driver);
    }

    public void logout() throws InterruptedException {
        WebElement profilePopUp = driver.findElement(dashboardAdminObject.getProfileButton());
        profilePopUp.click();
        this.waitForELementVisible(dashboardAdminObject.getLogoutButton());
        WebElement profileLogout = driver.findElement(dashboardAdminObject.getLogoutButton());
        profileLogout.click();
    }

    public void navigateToDokterPage() throws InterruptedException {
        WebElement dataPengguna = driver.findElement(dashboardAdminObject.getDataPenggunaMenu());
        dataPengguna.click();
        Thread.sleep(1000);
        WebElement menuDokter = driver.findElement(dashboardAdminObject.getDokterLink());
        menuDokter.click();
    }

}

package pages.admin;

import object.admin.DashboardAdminObject;
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







}

package cucumber.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainScreen extends BaseScreen {
    /**Constructor*/
    public MainScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    /**Mobile Elements*/
    By btn_locationPermission_WhileUsingTheApp = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    By btn_locationPermission_OnlyThisTime = By.id("com.android.permissioncontroller:id/permission_allow_one_time_button");
    By btn_locationPermission_Deny = By.id("com.android.permissioncontroller:id/permission_deny_button");

    By ls_jobs = By.id("com.isinolsun.app:id/rootRelativeView");
    By profileIconBy = By.xpath("//android.widget.LinearLayout[4]/android.widget.ImageView");

    /**Actions*/
    @SneakyThrows
    public void clickOnJob(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ls_jobs)).get(index).click();
        //Thread.sleep(4000); //Just Wait for a while
    }

    public void allowLocationPermissionWhileUsingTheApp() {
        if (wait.until(ExpectedConditions.visibilityOfElementLocated(btn_locationPermission_WhileUsingTheApp)).isDisplayed()) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(btn_locationPermission_WhileUsingTheApp)).click();
        }
    }

    public void allowLocationPermissionOnlyThisTime() {
        if (wait.until(ExpectedConditions.visibilityOfElementLocated(btn_locationPermission_OnlyThisTime)).isDisplayed()) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(btn_locationPermission_OnlyThisTime)).click();
        }
    }

    public void denyLocationPermission() {
        if (wait.until(ExpectedConditions.visibilityOfElementLocated(btn_locationPermission_Deny)).isDisplayed()) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(btn_locationPermission_Deny)).click();
        }
    }
}

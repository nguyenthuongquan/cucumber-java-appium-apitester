package cucumber.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.*;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Objects;

public class MainScreen extends BaseScreen {

    public MainScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    @iOSXCUITFindBy(id = "poorQuanNoMacbook")
    MobileElement btn_LocationPermission_WhileUsingTheApp;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_one_time_button")
    @iOSXCUITFindBy(id = "poorQuanNoMacbook")
    MobileElement btn_LocationPermission_OnlyThisTime;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
    @iOSXCUITFindBy(id = "poorQuanNoMacbook")
    MobileElement btn_LocationPermission_Deny;

    By android_ls_jobs = By.id("com.isinolsun.app:id/rootRelativeView");
    By ios_ls_jobs = By.id("poorQuanNoMacbook");

    public void clickOnJob(int index) {
        String platformName = driver.getPlatformName();
        assert platformName != null;
        if (platformName.equalsIgnoreCase("android"))
            waitAndFindAllElements(android_ls_jobs).get(index).click();
        else if (platformName.equalsIgnoreCase("ios"))
            waitAndFindAllElements(ios_ls_jobs).get(index).click();
    }

    public void allowLocationPermissionWhileUsingTheApp() {
        clickIfDisplayed(btn_LocationPermission_WhileUsingTheApp);
    }

    public void allowLocationPermissionOnlyThisTime() {
        clickIfDisplayed(btn_LocationPermission_OnlyThisTime);
    }

    public void denyLocationPermission() {
        clickIfDisplayed(btn_LocationPermission_Deny);
    }
}

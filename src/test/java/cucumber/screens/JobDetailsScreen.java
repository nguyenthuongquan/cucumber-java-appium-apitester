package cucumber.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class JobDetailsScreen extends BaseScreen{
    /**Constructor*/
    public JobDetailsScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    /**Mobile Elements*/
    By toolBarTitleBy   = By.id("com.isinolsun.app:id/toolbarTitle");

    /**Actions*/
    public boolean isToolBarTitleContains(String text) {
        String toolBarTitleStr = wait.until(ExpectedConditions.visibilityOfElementLocated(toolBarTitleBy)).getText();
        return toolBarTitleStr.toLowerCase().contains(text);
    }
}

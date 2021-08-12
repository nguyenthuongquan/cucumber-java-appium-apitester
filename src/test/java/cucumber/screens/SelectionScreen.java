package cucumber.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SelectionScreen extends BaseScreen {
    /**Constructor*/
    public SelectionScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    /**Mobile Elements*/
    By btn_searchingForAJob = By.id("com.isinolsun.app:id/bluecollar_type_button");

    /**Actions*/
    public void clickSearchingForJobButton() {
        waitAndClick(btn_searchingForAJob);
    }
}

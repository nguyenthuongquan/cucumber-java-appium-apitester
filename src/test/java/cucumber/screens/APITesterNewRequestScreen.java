package cucumber.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class APITesterNewRequestScreen extends BaseScreen {

    public APITesterNewRequestScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    By android_lbl_optionItem(String optionName) {
        return By.xpath("//*[contains(@text, '" + optionName + "')]");
    }

    By ios_lbl_optionItem(String optionName) {
        return By.id("poorQuanNoMacbook" + optionName);
    }


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    @iOSXCUITFindBy(id = "poorQuanNoMacbook")
    MobileElement btn_Get;


    public boolean isSpecificOptionDisplayed(String optionName) {
        String platformName = driver.getPlatformName();
        assert platformName != null;
        if (platformName.equalsIgnoreCase("android"))
            return waitAndFindElement(android_lbl_optionItem(optionName)).isDisplayed();
        else if (platformName.equalsIgnoreCase("ios"))
            return waitAndFindElement(ios_lbl_optionItem(optionName)).isDisplayed();
        return false;
    }

    public void clickSpecificItem(String itemText) {
        String platformName = driver.getPlatformName();
        assert platformName != null;
        if (platformName.equalsIgnoreCase("android"))
            waitAndFindElement(android_lbl_optionItem(itemText)).click();
        else if (platformName.equalsIgnoreCase("ios"))
            waitAndFindElement(ios_lbl_optionItem(itemText)).click();
    }

    public void clickGet() {
        waitAndClick(btn_Get);
    }
}

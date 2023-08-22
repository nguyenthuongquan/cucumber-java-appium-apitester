package cucumber.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class APITesterRequestDetailsGETScreen extends BaseScreen {

    public APITesterRequestDetailsGETScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    By android_lbl_optionItem(String optionName) {
        return By.xpath("//*[contains(@text, '" + optionName + "')]");
    }

    By ios_lbl_optionItem(String optionName) {
        return By.id("poorQuanNoMacbook" + optionName);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText")
    @iOSXCUITFindBy(id = "poorQuanNoMacbook")
    MobileElement tbx_URL;

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

    public void enterURL(String url) {
        sendKey(tbx_URL, url);
    }
}

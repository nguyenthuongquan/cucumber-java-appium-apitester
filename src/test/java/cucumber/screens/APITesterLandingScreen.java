package cucumber.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class APITesterLandingScreen extends BaseScreen {

    public APITesterLandingScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    @iOSXCUITFindBy(id = "poorQuanNoMacbook")
    MobileElement ico_TopSettings;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
    @iOSXCUITFindBy(id = "poorQuanNoMacbook")
    MobileElement ico_TopSearchBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView")
    @iOSXCUITFindBy(id = "poorQuanNoMacbook")
    MobileElement ico_MoreOptions;

    private static final String desiredText = "Run all requests";
    @AndroidFindBy(xpath = "//*[contains(@text, '" + desiredText + "')]")
    @iOSXCUITFindBy(id = "poorQuanNoMacbook")
    MobileElement lbl_option_RunAllRequests;


    By android_lbl_optionItem(String optionName) {
        return By.xpath("//*[contains(@text, '" + optionName + "')]");
    }

    By ios_lbl_optionItem(String optionName) {
        return By.id("poorQuanNoMacbook" + optionName);
    }

    public boolean isSpecificOptionDisplayed(String optionName) {
        String platformName = driver.getPlatformName();
        assert platformName != null;
        if (platformName.equalsIgnoreCase("android"))
            return waitAndFindElement(android_lbl_optionItem(optionName)).isDisplayed();
        else if (platformName.equalsIgnoreCase("ios"))
            return waitAndFindElement(ios_lbl_optionItem(optionName)).isDisplayed();
        return false;
    }

    public void clickTopSettingsIcon() {
        waitAndClick(ico_TopSettings);
    }

    public void clickMoreOptionsIcon() {
        waitAndClick(ico_MoreOptions);
    }

    public boolean isTopSettingsIconDisplayed() {return ico_TopSettings.isDisplayed();}

    public boolean isTopSearchBoxDisplayed() {return ico_TopSearchBox.isDisplayed();}

    public boolean isMoreOptionIconDisplayed() {return ico_MoreOptions.isDisplayed();}

    public boolean isMoreOptionRunAllRequestDisplayed() {return lbl_option_RunAllRequests.isDisplayed();}
}

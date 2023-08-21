package cucumber.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class APITesterLandingScreen extends BaseScreen{

    public APITesterLandingScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "00000000-0000-0097-ffff-ffff0000001c")
    @iOSXCUITFindBy(id = "poorQuanNoMacbook")
    MobileElement ico_TopSettings;

    public void clickTopSettingsIcon() {
        waitAndClick(ico_TopSettings);
    }

    public boolean isTopSettingsIconDisplayed() {return ico_TopSettings.isDisplayed();}
}

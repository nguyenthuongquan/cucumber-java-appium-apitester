package cucumber.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectionScreen extends BaseScreen {

    public SelectionScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.isinolsun.app:id/bluecollar_type_button")
    @iOSXCUITFindBy(id = "poorQuanNoMacbook")
    MobileElement btn_SearchingForAJob;

    public void clickSearchingForJobButton() {
        waitAndClick(btn_SearchingForAJob);
    }
}

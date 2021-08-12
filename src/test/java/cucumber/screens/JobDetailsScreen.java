package cucumber.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JobDetailsScreen extends BaseScreen{

    public JobDetailsScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.isinolsun.app:id/toolbarTitle")
    @iOSXCUITFindBy(id = "poorQuanNoMacbook")
    MobileElement lbl_ToolBarTitle;

    public boolean isToolBarTitleContains(String text) {
        String toolBarTitleStr = getText(lbl_ToolBarTitle);
        return toolBarTitleStr.contains(text);
    }
}

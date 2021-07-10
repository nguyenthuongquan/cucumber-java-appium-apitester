package cucumber.tests;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utilities.DesiredCapabilitiesUtil;
import utilities.ScreenUtil;
import utilities.ThreadLocalDriver;

import java.io.IOException;
import java.net.URL;

public class BaseTest {
    private final DesiredCapabilitiesUtil desiredCapabilitiesUtil = new DesiredCapabilitiesUtil();

    @BeforeMethod
    @Parameters({ "udid", "platformVersion" })
    public void setup(@Optional String udid, @Optional String platformVersion) throws IOException {
        System.out.println("----------------- (@BeforeMethod) BaseTest - setup -----------------");
        DesiredCapabilities caps = desiredCapabilitiesUtil.getDesiredCapabilities(udid, platformVersion);
        ThreadLocalDriver.setTLDriver(new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps));
    }

    @AfterMethod ()
    public static synchronized void teardown(ITestResult testResult) throws IOException {
        System.out.println("----------------- (@AfterMethod) BaseTest - teardown -----------------");
        if (testResult.getStatus() == 2) //FAILURE
            ScreenUtil.getScreenshot(TestRunner.scenarioName);
        ThreadLocalDriver.getTLDriver().quit();
    }

}

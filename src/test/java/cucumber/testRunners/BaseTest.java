package cucumber.testRunners;

import io.appium.java_client.android.AndroidDriver;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utilities.DesiredCapabilitiesUtil;
import utilities.ReadConfigFile;
import utilities.ThreadLocalDriver;

import java.io.IOException;
import java.net.URL;

public class BaseTest {
    private final DesiredCapabilitiesUtil desiredCapabilitiesUtil = new DesiredCapabilitiesUtil();
    static ReadConfigFile readConfigFile = ConfigFactory.create(ReadConfigFile.class);

    @BeforeMethod
    @Parameters({"platform", "platformVersion", "udid", "appiumServer"})
    public void setup(@Optional String platform, @Optional String platformVersion, @Optional String udid, @Optional String appiumServer) throws IOException {
        if (platform == null) platform = readConfigFile.mobilePlatformName();
        if (appiumServer == null) appiumServer = readConfigFile.appiumServerURL();
        DesiredCapabilities caps = desiredCapabilitiesUtil.getDesiredCapabilities(platform, platformVersion, udid);

        if (platform.equalsIgnoreCase("android"))
            ThreadLocalDriver.setTLDriver(new AndroidDriver<>(new URL(appiumServer), caps));
        else if (platform.equalsIgnoreCase("ios"))
            ThreadLocalDriver.setTLDriver(new AndroidDriver<>(new URL(appiumServer), caps));
        else
            throw new UnsupportedOperationException("Invalid mobile platform name " + platform);

    }

    @AfterMethod()
    public synchronized void teardown() {
        ThreadLocalDriver.getTLDriver().quit();
    }
}

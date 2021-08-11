package utilities;

import io.appium.java_client.remote.MobileCapabilityType;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesUtil {

    public DesiredCapabilities getDesiredCapabilities(String platformName, String platformVersion, String udid ) {
        ReadConfigFile readConfigFile = ConfigFactory.create(ReadConfigFile.class);
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, readConfigFile.isNoReset());

        if (platformName.equalsIgnoreCase("ios")) {
            desiredCapabilities.setCapability(MobileCapabilityType.UDID, udid);
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, readConfigFile.iosAutomationName());
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, readConfigFile.iosDeviceName());
            desiredCapabilities.setCapability(MobileCapabilityType.APP, readConfigFile.iosAppPath());

        } else if(platformName.equalsIgnoreCase("android")) {
            desiredCapabilities.setCapability(MobileCapabilityType.UDID, udid);
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, readConfigFile.androidAutomationName());
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, readConfigFile.androidDeviceName());
            desiredCapabilities.setCapability(MobileCapabilityType.APP, readConfigFile.androidAppPath());
            desiredCapabilities.setCapability("appPackage", readConfigFile.androidAppPackageName());
            desiredCapabilities.setCapability("appActivity", readConfigFile.androidAppActivityName());
            desiredCapabilities.setCapability("skipUnlock", readConfigFile.isAndroidSkipUnlock());
        }
        else
            throw new UnsupportedOperationException("Invalid mobile platform name " + platformName);
        return desiredCapabilities;
    }
}

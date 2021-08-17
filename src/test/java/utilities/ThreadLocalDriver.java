package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.aeonbits.owner.ConfigFactory;

public class ThreadLocalDriver {
    private static final ThreadLocal<AppiumDriver<MobileElement>> tlDriver = new ThreadLocal<>();
    private static final String platform = ConfigFactory.create(ReadConfigFile.class).mobilePlatformName();

    public static synchronized void setTLAndroidDriver(AndroidDriver<MobileElement> driver) {
        tlDriver.set(driver);
    }

    public static synchronized void setTLIOSDriver(IOSDriver<MobileElement> driver) {
        tlDriver.set(driver);
    }

    public static synchronized AppiumDriver<MobileElement> getTLDriver() {
        if (platform.equalsIgnoreCase("android"))
            return getTLAndroidDriver();
        else if (platform.equalsIgnoreCase("ios"))
            return getTLIOSDriver();
        else
            throw new UnsupportedOperationException("Invalid mobile platform name " + platform);
    }

    public static synchronized AndroidDriver<MobileElement> getTLAndroidDriver() {
        return (AndroidDriver<MobileElement>) tlDriver.get();
    }

    public static synchronized IOSDriver<MobileElement> getTLIOSDriver() {
        return (IOSDriver<MobileElement>) tlDriver.get();
    }


}

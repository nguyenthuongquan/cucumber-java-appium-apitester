package utilities;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.*;

@LoadPolicy(Config.LoadType.MERGE)
@Sources({
        "classpath:config.properties",
        "classpath:cucumber.properties",
        "classpath:environment.properties",
})
public interface ReadConfigFile extends Config {
    /*** File config.properties */
    @Config.Key("takeScreenshotForEveryStep") Boolean isScreenshotTakenForEveryStep();
    @Config.Key("takeScreenshotForVerificationStep") Boolean isScreenshotTakenForVerificationStep();
    @Config.Key("takeScreenshotWhenScenarioFails") Boolean isScreenshotTakenWhenScenarioFails();
    @Config.Key("browserHeadless") Boolean isBrowserHeadless();
    String appiumServerURL();
    String mobileAutomationName();
    String mobilePlatformName();
    String mobilePlatformVersion();
    String mobileDeviceName();
    String mobileAppPath();
    String mobileAppActivityName();
    String mobileAppPackageName();

    /*** File cucumber.properties */
    @Config.Key("cucumber.publish.enabled") Boolean isCucumberPublishEnabled();

    /*** File environment.properties */
    @Config.Key("Device") String device();
    @Config.Key("Build.Version") String buildVersion();
}
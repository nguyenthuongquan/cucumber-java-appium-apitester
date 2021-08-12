package cucumber.steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import cucumber.screens.CandidateMainScreen;
import cucumber.screens.JobScreen;
import cucumber.screens.SelectionScreen;
import cucumber.screens.SplashScreen;

public class BaseSteps {
    protected SplashScreen        splashScreen;
    protected SelectionScreen     selectionScreen;
    protected CandidateMainScreen candidateMainScreen;
    protected JobScreen           jobScreen;

    public void setupScreens(AppiumDriver<MobileElement> driver) {
        splashScreen = new SplashScreen(driver);
        selectionScreen = new SelectionScreen(driver);
        candidateMainScreen = new CandidateMainScreen(driver);
        jobScreen = new JobScreen(driver);
    }
}
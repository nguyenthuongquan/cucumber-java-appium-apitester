package cucumber.steps;

import cucumber.screens.SplashScreen;
import io.cucumber.java.en.Given;
import utilities.ThreadLocalDriver;

public class SplashScreenSteps {

    private final SplashScreen splashScreen = new SplashScreen(ThreadLocalDriver.getTLDriver());

    @Given("user clicks 'Welcome' button in Splash screen")
    public void userClicksWelcomeButtonInSplashScreen() {
        splashScreen.clickWelcomeButton();
    }


}

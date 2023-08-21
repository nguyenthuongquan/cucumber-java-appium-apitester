package cucumber.steps;

import cucumber.screens.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.ThreadLocalDriver;

public class APITesterLandingScreenSteps {
    private final APITesterLandingScreen  apiTesterLandingScreen = new APITesterLandingScreen(ThreadLocalDriver.getTLDriver());

    @Given("verify user should see info in APITester Landing screen")
    public void userShouldSeeInfoInAPITesterLandingScreen() {
        Assert.assertTrue(apiTesterLandingScreen.isTopSettingsIconDisplayed());
    }
}

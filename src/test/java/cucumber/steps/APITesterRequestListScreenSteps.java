package cucumber.steps;

import cucumber.screens.APITesterNewRequestScreen;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ThreadLocalDriver;

public class APITesterRequestListScreenSteps {
    private final APITesterNewRequestScreen apiTesterNewRequestScreen = new APITesterNewRequestScreen(ThreadLocalDriver.getTLDriver());
    @When("verify user should see the item {string} in Request List screen")
    public void verifyUserShouldSeeTheItemInRequestListScreen(String optionName) {
        apiTesterNewRequestScreen.isSpecificOptionDisplayed(optionName);
    }
}

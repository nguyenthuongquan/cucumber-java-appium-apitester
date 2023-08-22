package cucumber.steps;

import cucumber.screens.APITesterRequestDetailsGETScreen;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ThreadLocalDriver;

public class APITesterRequestDetailsGETScreenSteps {
    private final APITesterRequestDetailsGETScreen apiTesterRequestDetailsGETScreen = new APITesterRequestDetailsGETScreen(ThreadLocalDriver.getTLDriver());
    @Then("user taps on {string} button in Request Details screen")
    public void userTapsOnButtonInRequestDetailsScreen(String methodName) {
        apiTesterRequestDetailsGETScreen.clickSpecificItem(methodName);
    }

    @When("verify user should see the item {string} in Request Details screen")
    public void verifyUserShouldSeeTheItemInRequestListScreen(String optionName) {
        apiTesterRequestDetailsGETScreen.isSpecificOptionDisplayed(optionName);
    }
    
    @Then("user types {string} into URL in Request Details screen")
    public void userTypesIntoURLInRequestDetailsScreen(String url) {
        apiTesterRequestDetailsGETScreen.enterURL(url);
    }


}

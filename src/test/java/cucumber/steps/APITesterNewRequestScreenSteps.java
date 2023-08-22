package cucumber.steps;

import cucumber.screens.APITesterLandingScreen;
import cucumber.screens.APITesterNewRequestScreen;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.ThreadLocalDriver;

public class APITesterNewRequestScreenSteps {
    private final APITesterNewRequestScreen apiTesterNewRequestScreen = new APITesterNewRequestScreen(ThreadLocalDriver.getTLDriver());

    @When("verify user should see item {string} in Create New Request screen")
    public void verifyUserShouldSeeItemInCreateNewRequestScreen(String optionName) {
        apiTesterNewRequestScreen.isSpecificOptionDisplayed(optionName);
    }

    @Then("user taps on {string} Requests button in Create New Request screen")
    public void userTapsOnRequestsButtonInCreateNewRequestScreen(String methodName) {

        switch(methodName.toLowerCase()) {
            case "get":
                apiTesterNewRequestScreen.clickGet();
                break;
            case "post":
                // code block
                break;
            case "put":
                // code block
                break;
            case "patch":
                // code block
                break;
            case "delete":
                // code block
                break;
            case "head":
                // code block
                break;
            default:
                System.out.println("Method: '" + methodName + "' does not exist in Create New Request screen");
        }
    }


}

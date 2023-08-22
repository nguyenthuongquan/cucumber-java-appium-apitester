package cucumber.steps;

import cucumber.screens.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.ThreadLocalDriver;

public class APITesterLandingScreenSteps {
    private final APITesterLandingScreen apiTesterLandingScreen = new APITesterLandingScreen(ThreadLocalDriver.getTLDriver());

    @Then("verify user should see Setting icon in top of APITester Landing screen")
    public void userShouldSeeIconInTopOfAPITesterLandingScreen() {
        Assert.assertTrue(apiTesterLandingScreen.isTopSettingsIconDisplayed());
    }

    @Then("verify user should see Search box in top of APITester Landing screen")
    public void userShouldSeeSearchBoxInTopOfAPITesterLandingScreen() {
        Assert.assertTrue(apiTesterLandingScreen.isTopSearchBoxDisplayed());
    }

    @Then("verify user should see More Option icon in top of Landing screen")
    public void userShouldSeeMoreOptionIconInTopOfAPITesterLandingScreen() {
        Assert.assertTrue(apiTesterLandingScreen.isMoreOptionIconDisplayed());
    }

    @Then("verify user should see Add request icon in top of Landing screen")
    public void userShouldSeeAddRequestIconInTopOfAPITesterLandingScreen() {
        Assert.assertTrue(apiTesterLandingScreen.isAddRequestsIconDisplayed());
    }


    @Then("user taps on More Option icon in top of Landing screen")
    public void userTapsOnMoreOptionIconInTopOfLandingScreen() {
        apiTesterLandingScreen.clickMoreOptionsIcon();

    }

    @Then("user taps on Setting icon in top of APITester Landing screen")
    public void userTapsOnSettingIconInTopOfLandingScreen() {
        apiTesterLandingScreen.clickTopSettingsIcon();
    }

    @Then("user taps on Add Requests icon in top of APITester Landing screen")
    public void userTapsOnAddRequestsIconInTopOfLandingScreen() {
        apiTesterLandingScreen.clickAddRequestIcon();
    }

    @When("verify user should see option {string} in More Option panel")
    public void verifyUserShouldSeeOptionInMoreOptionPanel(String optionName) {
        apiTesterLandingScreen.isSpecificOptionDisplayed(optionName);
    }

    @When("verify user should see item {string} in Settings panel")
    public void verifyUserShouldSeeItemInSettingsPanel(String optionName) {
        apiTesterLandingScreen.isSpecificOptionDisplayed(optionName);
    }

    @When("user taps on {string} in More Option panel")
    public void userTapsOnInMoreOptionPanel(String optionName) {
        apiTesterLandingScreen.clickSpecificItem(optionName);
    }

    @And("user confirms {string} in delete all requests popup")
    public void userConfirmsInDeleteAllRequestsPopup(String optionName) {
        apiTesterLandingScreen.clickSpecificItem(optionName);
    }

    @And("verify user should see item {string} in Landing screen")
    public void verifyUserShouldSeeItemInLandingScreen(String optionName) {
        apiTesterLandingScreen.isSpecificOptionDisplayed(optionName);
    }

    @And("verify user should see item {string}")
    public void verifyUserShouldSeeItem(String optionName) {
        apiTesterLandingScreen.isSpecificOptionDisplayed(optionName);
    }
}

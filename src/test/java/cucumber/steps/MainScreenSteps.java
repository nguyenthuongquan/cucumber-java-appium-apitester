package cucumber.steps;

import cucumber.screens.MainScreen;
import cucumber.screens.SelectionScreen;
import cucumber.screens.SplashScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.ThreadLocalDriver;

public class MainScreenSteps {

    private final MainScreen searchMainScreen = new MainScreen(ThreadLocalDriver.getTLDriver());
    private final SplashScreen splashScreen = new SplashScreen(ThreadLocalDriver.getTLDriver());
    private final SelectionScreen selectionScreen = new SelectionScreen(ThreadLocalDriver.getTLDriver());

    @Given("user is on the jobs listing in Main screen")
    public void userIsOnTheJobsListingScreen() {
        splashScreen.clickWelcomeButton();
        selectionScreen.clickSearchingForJobButton();
        searchMainScreen.allowLocationPermissionWhileUsingTheApp();
    }

    @And("user allows to access device's location while using the app in Main screen")
    public void userAllowsToAccessDeviceSLocationWhileUsingTheAppInMainScreen() {
        searchMainScreen.allowLocationPermissionWhileUsingTheApp();
    }

    @And("user allows to access device's location ony this time in Main screen")
    public void userAllowsToAccessDeviceSLocationOnyThisTimeInMainScreen() {
        searchMainScreen.allowLocationPermissionOnlyThisTime();
    }

    @And("user denies to access device's location in Main screen")
    public void userDeniesToAccessDeviceSLocationInMainScreen() {
        searchMainScreen.denyLocationPermission();
    }

    @When("user opens a job which has index of {int} in Main screen")
    public void userOpensAJobWhichHasIndexOfInMainScreen(int index) {
        searchMainScreen.clickOnJob(index);
    }
}

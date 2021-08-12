package cucumber.steps;

import cucumber.screens.SelectionScreen;
import io.cucumber.java.en.Given;
import utilities.ThreadLocalDriver;

public class SelectionScreenSteps {

    private final SelectionScreen selectionScreen = new SelectionScreen(ThreadLocalDriver.getTLDriver());

    @Given("user clicks 'Searching for a job' button in Selection screen")
    public void userClicksLookingForAJobButtonInSelectionScreen() {
        selectionScreen.clickSearchingForJobButton();
    }


}

package cucumber.steps;

import cucumber.screens.JobDetailsScreen;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utilities.ThreadLocalDriver;

public class JobsDetailsScreenSteps {

    private final JobDetailsScreen jobDetailsScreen = new JobDetailsScreen(ThreadLocalDriver.getTLDriver());

    @Then("verify user should see info in Jobs Details screen")
    public void userShouldSeeTheJobsDetails() {
        Assert.assertTrue(jobDetailsScreen.isToolBarTitleContains("detay"));
    }


}

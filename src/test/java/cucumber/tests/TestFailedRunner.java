package cucumber.tests;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
    features = "@target/failedRerun.txt",
    glue = "cucumber.steps",
    publish = true,
    plugin = {
            "pretty",
            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
            "timeline:reports/thread/",
            "rerun:target/failedRerun.txt"}
)

public class TestFailedRunner extends BaseTest {
    private TestNGCucumberRunner testNGCucumberRunner;
    public static String scenarioName;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @DataProvider
    public Object[][] scenarios() {
        return testNGCucumberRunner.provideScenarios();
    }

    @Test(groups = "cucumber", description = "Run Cucumber Features.", dataProvider = "scenarios")
    public void scenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        scenarioName = pickleWrapper.getPickle().getName();
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        testNGCucumberRunner.finish();
    }
}
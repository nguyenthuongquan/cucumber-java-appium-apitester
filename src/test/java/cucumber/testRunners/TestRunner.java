package cucumber.testRunners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.FileUtil;

import java.io.IOException;

@CucumberOptions(
        //tags = "not @skip",
        features = "src/test/java/cucumber/features",
        glue = "cucumber.steps",
        publish = true,
        plugin = {
                "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:reports/thread/",
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
                "rerun:target/failedRerun.txt"}
)

public class TestRunner extends BaseTest {
    private TestNGCucumberRunner testNGCucumberRunner;

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
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws IOException {
        FileUtil.copyEnvironmentFileToAllureResultsFolder();
        testNGCucumberRunner.finish();
    }
}
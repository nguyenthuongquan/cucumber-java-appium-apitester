package cucumber.tests;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        tags = "not @skip_scenario",
        monochrome = true,
        features = "src/test/java/cucumber/features",
        glue = "cucumber.steps",
        publish = true,
        plugin = {
                "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:reports/thread/",
                "rerun:target/failedRerun.txt"}
)


public class TestRunner extends BaseTest {
    private TestNGCucumberRunner testNGCucumberRunner;
    public static String scenarioName;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        System.out.println("----------------- (@BeforeClass) TestRunner - setUpClass -----------------");
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @DataProvider
    public Object[][] scenarios() {
        System.out.println("----------------- (@DataProvider) TestRunner - scenarios -----------------");
        return testNGCucumberRunner.provideScenarios();
    }

    @Test(groups = "cucumber", description = "Run Cucumber Features.", dataProvider = "scenarios")
    public void scenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        System.out.println("----------------- (@Test) TestRunner - scenario -----------------");
        scenarioName = pickleWrapper.getPickle().getName();
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        System.out.println("----------------- (@AfterClass) TestRunner - tearDownClass -----------------");
        testNGCucumberRunner.finish();
    }
}
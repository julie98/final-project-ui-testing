package runners;

import drivers.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "classpath:features",
//        features = "src/test/resources/features/group.feature",
        glue = "classpath:stepDefinitions"
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @AfterTest
    public void quitBrowser() {
        DriverFactory.getDriver().quit();
    }

}

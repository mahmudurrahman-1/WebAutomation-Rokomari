package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//       features = "src/test/java/features/registration.feature",
//        features = "src/test/java/features/login.feature",
        features = "src/test/java/features/reset.feature",

        glue = "step_def",
        plugin={"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/", "rerun:target/failedrerun.txt"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}

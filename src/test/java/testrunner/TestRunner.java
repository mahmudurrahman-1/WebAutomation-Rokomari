package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//        features = "src/test/java/features/registration.feature",
        features = "src/test/java/features/login.feature",

        glue = "step_def"
)
public class TestRunner extends AbstractTestNGCucumberTests {

}

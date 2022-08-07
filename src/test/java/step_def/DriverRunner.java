package step_def;

import drivers.MainDriver;
import drivers.PageDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DataParser;

import java.util.Properties;

public class DriverRunner extends MainDriver {

    Properties prop = DataParser.loadProperties("driver.properties");

    //This will be started before all the tests
    @Before
    public void startsBrowser() {
        driver = setup(prop.getProperty("br1"));
    }

    // After all the test browser will be closed here
    @After
    public void closeBrowser() {
        PageDriver.getCurrentDriver().close();
    }
}

package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import utilities.DataParser;

import java.time.Duration;
import java.util.Properties;

public class MainDriver {
public WebDriver driver =null;
Properties prop = DataParser.loadProperties("driver.properties");
public WebDriver setup(String browser){
    if(browser.contains("chrome")){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

    }
   else if(browser.contains("firefox")){
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();

    }
    else if(browser.contains("opera")){
        WebDriverManager.operadriver().setup();
        driver=new OperaDriver();

    }
    else {
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
    }
    // driver manages necessary things
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get(prop.getProperty("siteurl"));
    return driver;
}
}

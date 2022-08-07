package drivers;

import org.openqa.selenium.WebDriver;

public class PageDriver {
    private static final ThreadLocal<WebDriver> webdriver = new ThreadLocal<>();
    private static PageDriver instance = null;

    private PageDriver() {
        //empty
    }

    //create instance
    public static PageDriver getInstance() {
        if (instance == null) {
            instance = new PageDriver();
        }
        return instance;
    }

    //set driver
    public void setWebdriver(WebDriver driver) {
        webdriver.set(driver);
    }

    //get webdriver
    public WebDriver getDriver() {
        return webdriver.get();
    }

    // Get current driver
    public static WebDriver getCurrentDriver() {
        return getInstance().getDriver();
    }
}

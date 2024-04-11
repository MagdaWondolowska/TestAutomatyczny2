package myStore;


import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class AbstractTest {

    WebDriver driver;
    WebDriverWait wait;

    public void setUp(String browser) {
        driver = getDriver(browser);
        wait = new WebDriverWait(driver, 3);
    }

//        @After
//    public void closeBrowser() {
//        driver.quit();
//    }

    private WebDriver getDriver(String browser) {
        switch (browser.toUpperCase()) {
            case "EDGE": {
                System.setProperty("webdriver.edge.driver", "src/main/resources/drivers/msedgedriver.exe");
                return new EdgeDriver();
            }
            default: {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
                return new ChromeDriver();
            }
        }
    }
}
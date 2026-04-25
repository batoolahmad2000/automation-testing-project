package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.ConfigReader;
import utilities.DriverFactory;

public class BaseTest {

    public static WebDriver driver;

    @BeforeMethod
    public void setup() {

        // Load config.properties
        ConfigReader.loadProperties();

        // Initialize Driver
        driver = DriverFactory.initializeDriver();

        // Open Website
        driver.get(
                ConfigReader.getProperty("baseUrl")
        );
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
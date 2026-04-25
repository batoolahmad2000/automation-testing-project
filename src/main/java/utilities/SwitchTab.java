package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;

public class SwitchTab {

    public static String switchToNewTab(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));


        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());


        driver.switchTo().window(tabs.get(1));


        return driver.getCurrentUrl();
    }

    public static void closeTabAndReturn(WebDriver driver) {

        driver.close();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
    }
}
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // --- Locators ---

    By loginBtn = By.cssSelector("a[href*='/auth/login']");
    By createAccountBtn = By.cssSelector("a[href*='/auth/register']");


    By searchField = By.cssSelector("input[placeholder='بحث عن الدورات التدريبية']");

    By allCoursesBtn = By.linkText("عرض الدورات التدريبية");

    public By facebookLink = By.cssSelector("a[href*='facebook.com']");
    public By linkedinLink = By.cssSelector("a[href*='linkedin.com']");
    public By youtubeLink  = By.cssSelector("a[href*='youtube.com']");

    // --- Actions ---

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public void clickCreateAccount() {
        driver.findElement(createAccountBtn).click();
    }

    public void searchCourse(String keyword) {
        WebElement field = driver.findElement(searchField);
        field.clear();
        field.sendKeys("كيف تنضم إلى البنك" + Keys.ENTER); //
    }

    public void openAllCourses() {
        driver.findElement(allCoursesBtn).click();
    }

    private void scrollToBottom() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    private void safeClick(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        scrollToBottom();

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        try {
            element.click();
        } catch (Exception e) {

            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
    }

    public void clickYoutube() {
        safeClick(youtubeLink);
    }

    public void clickLinkedIn() {
        safeClick(linkedinLink);
    }

    public void clickFacebook() {
        safeClick(facebookLink);
    }
}
// pages/CourseDetailsPage.java

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CourseDetailsPage {

    WebDriver driver;

    public CourseDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    By courseDetailsSection = By.xpath(
            "//*[contains(text(),'حول الدورة التدريبية') or contains(text(),'Course Details')]"
    );

    By subscribeButton = By.xpath(
            "//button[contains(text(),'Enroll') or contains(text(),'Subscribe') or contains(text(),'اشترك')]"
    );

    public boolean isCourseDetailsSectionDisplayed() {
        return driver.findElement(courseDetailsSection).isDisplayed();
    }

    public void clickSubscribeButton() {
        driver.findElement(subscribeButton).click();
    }
}
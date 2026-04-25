package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoursesPage {

    WebDriver driver;

    public CoursesPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstCourseCard = By.xpath(
            "(//button[contains(text(),'Enroll') or contains(text(),'Subscribe')])[1]"
    );

    By courseImage = By.xpath("(//img)[1]");
    By courseTitle = By.xpath("(//h3 | //h4)[1]");
    By instructorName = By.xpath(
            "(//*[contains(text(),'Instructor') or contains(text(),'With')])[1]"
    );
    By subscribeButton = By.xpath(
            "(//button[contains(text(),'Enroll') or contains(text(),'Subscribe')])[1]"
    );

    public void openFirstCourse() {
        driver.findElement(firstCourseCard).click();
    }

    public void subscribeToFirstCourse() {
        driver.findElement(subscribeButton).click();
    }

    public boolean isCourseImageDisplayed() {
        return driver.findElement(courseImage).isDisplayed();
    }

    public boolean isCourseTitleDisplayed() {
        return driver.findElement(courseTitle).isDisplayed();
    }

    public boolean isInstructorNameDisplayed() {
        return driver.findElement(instructorName).isDisplayed();
    }

    public boolean isSubscribeButtonDisplayed() {
        return driver.findElement(subscribeButton).isDisplayed();
    }
}
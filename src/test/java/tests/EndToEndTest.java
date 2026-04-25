package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CourseDetailsPage;
import pages.CoursesPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;

public class EndToEndTest extends BaseTest {

    @Test
    public void subscribeToCourseEndToEndTest() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        CoursesPage coursesPage = new CoursesPage(driver);
        CourseDetailsPage courseDetailsPage =
                new CourseDetailsPage(driver);

        // Login Page
        homePage.clickLogin();

        // Valid Login
        loginPage.login(
                ConfigReader.getProperty("validEmail"),
                ConfigReader.getProperty("validPassword")
        );

        // Open All Courses
        homePage.openAllCourses();

        // Open First Course
        coursesPage.openFirstCourse();

        // Subscribe
        courseDetailsPage.clickSubscribeButton();

        // Assertion
        Assert.assertTrue(
                driver.getPageSource().contains("My Courses")
                        || driver.getPageSource().contains("Subscribed")
                        || driver.getPageSource().contains("Cart"),
                "Course subscription failed"
        );
    }
}
package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CourseDetailsPage;
import pages.CoursesPage;
import pages.HomePage;

public class CoursesTest extends BaseTest {

    /*
     * Test Case #2
     * Open course details
     */

    @Test
    public void openCourseDetailsTest() {

        HomePage homePage = new HomePage(driver);
        CoursesPage coursesPage = new CoursesPage(driver);
        CourseDetailsPage courseDetailsPage =
                new CourseDetailsPage(driver);

        // Open all courses
        homePage.openAllCourses();

        // Open first course
        coursesPage.openFirstCourse();

        // Assertion 1
        Assert.assertTrue(
                driver.getCurrentUrl().contains("course"),
                "Course details page did not open"
        );

        // Assertion 2
        Assert.assertTrue(
                courseDetailsPage.isCourseDetailsSectionDisplayed(),
                "Course details section is not displayed"
        );
    }

    /*
     * Test Case #11
     * Verify course card UI
     */

    @Test
    public void verifyCourseCardUITest() {

        HomePage homePage = new HomePage(driver);
        CoursesPage coursesPage = new CoursesPage(driver);

        // Open all courses
        homePage.openAllCourses();

        Assert.assertTrue(
                coursesPage.isCourseImageDisplayed(),
                "Course image is missing"
        );

        Assert.assertTrue(
                coursesPage.isCourseTitleDisplayed(),
                "Course title is missing"
        );

        Assert.assertTrue(
                coursesPage.isInstructorNameDisplayed(),
                "Instructor name is missing"
        );

        Assert.assertTrue(
                coursesPage.isSubscribeButtonDisplayed(),
                "Subscribe button is missing"
        );
    }
}
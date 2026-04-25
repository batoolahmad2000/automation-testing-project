package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    /*
     * Test Case #5
     * Login with invalid credentials
     */

    @Test
    public void invalidLoginTest() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        // Open Login Page
        homePage.clickLogin();

        // Invalid Login
        loginPage.login(
                "wrong@test.com",
                "123456"
        );

        // Assertion
        Assert.assertTrue(
                driver.getCurrentUrl().contains("login")
                        || driver.getPageSource().contains("Invalid")
                        || driver.getPageSource().contains("error"),
                "Error message is not displayed"
        );
    }

    /*
     * Test Case #6
     * Login with empty fields
     */

    @Test
    public void emptyLoginFieldsTest() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        // Open Login Page
        homePage.clickLogin();

        // Click login without entering data
        loginPage.clickLoginOnly();

        String validation =
                loginPage.getEmailValidationMessage();

        // Assertion
        Assert.assertTrue(
                validation.contains("fill")
                        || validation.contains("required"),
                "Validation message is not displayed"
        );
    }
}
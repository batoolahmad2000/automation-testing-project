package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {

    /*
     * Test Case #3
     * Open registration page
     */

    @Test
    public void openRegistrationPageTest() {

        HomePage homePage = new HomePage(driver);

        homePage.clickCreateAccount();

        Assert.assertTrue(
                driver.getCurrentUrl().contains("register")
                        || driver.getCurrentUrl().contains("signup"),
                "Registration page did not open"
        );
    }

    /*
     * Test Case #4
     * Register with empty username field
     */

    @Test
    public void registerWithEmptyUsernameTest() {

        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);

        // Open register page
        homePage.clickCreateAccount();

        // Fill all fields except username
        registerPage.registerWithoutUsername(
                "testtest001@gmail.com",
                "Egypt",
                "Cairo",
                "Female",
                "01012345678",
                "Test@12345"
        );

        // Assertion
        Assert.assertTrue(
                driver.getPageSource().contains("required")
                        || driver.getPageSource().contains("اسم المستخدم مطلوب"),
                "Validation message is not displayed"
        );



    }

    @Test
    public void  loginPageClick (){
        HomePage homePages = new HomePage(driver);
        RegisterPage registerPages = new RegisterPage(driver);

        homePages.clickCreateAccount();
        registerPages.LoginPage();
    }
}
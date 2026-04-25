package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;

public class SearchTest extends BaseTest {

    /*
     * Test Case #1
     * Search with valid keyword
     */

    @Test
    public void searchValidKeywordTest() {
        HomePage homePage = new HomePage(driver);

        homePage.searchCourse(ConfigReader.getProperty("searchKeyword"));

        Assert.assertTrue(driver.getPageSource().contains("كيف تنضم إلى البنك"),
                "نتائج البحث لم تظهر بشكل صحيح!");
    }
}
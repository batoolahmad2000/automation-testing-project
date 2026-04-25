package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.SwitchTab;

public class SocialLinksTest extends BaseTest {

    @Test
    public void verifyFacebookLinkTest() {
        HomePage homePage = new HomePage(driver);

        homePage.clickFacebook();

        String currentUrl = SwitchTab.switchToNewTab(driver);

        Assert.assertTrue(
                currentUrl.toLowerCase().contains("facebook"),
                "Expected URL to contain 'facebook' but found: " + currentUrl
        );
    }

    @Test
    public void verifyLinkedInLinkTest() {
        HomePage homePage = new HomePage(driver);

        homePage.clickLinkedIn();

        String currentUrl = SwitchTab.switchToNewTab(driver);

        Assert.assertTrue(
                currentUrl.toLowerCase().contains("linkedin"),
                "Expected URL to contain 'linkedin' but found: " + currentUrl
        );
    }

    @Test
    public void verifyYoutubeLinkTest() {
        HomePage homePage = new HomePage(driver);

        homePage.clickYoutube();

        String currentUrl = SwitchTab.switchToNewTab(driver);

        Assert.assertTrue(
                currentUrl.toLowerCase().contains("youtube"),
                "Expected URL to contain 'youtube' but found: " + currentUrl
        );
    }
}
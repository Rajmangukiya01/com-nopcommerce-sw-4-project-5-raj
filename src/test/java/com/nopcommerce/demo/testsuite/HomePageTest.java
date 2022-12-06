package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToComputer() {
        homePage.selectMenu("Computers");
        Assert.assertEquals(homePage.getVerifyComputer(), "Computers", "Computer message is not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToElectronics() {
        homePage.selectMenu("Electronics");
        Assert.assertEquals(homePage.getVerifyElectronics(), "Electronics", "Electronics message is not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToApparel() {
        homePage.selectMenu("Apparel");
        Assert.assertEquals(homePage.getVerifyApparel(), "Apparel", "Apparel message is not displayed");
    }
}

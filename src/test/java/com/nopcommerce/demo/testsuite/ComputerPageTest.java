package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerPageTest extends BaseTest {
    ComputerPage computerPage = new ComputerPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        computerPage.clickOnComputerMenu();
        computerPage.clickOnDesktops();
        computerPage.selectSortZToA();
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computerPage.clickOnComputerMenu();
        computerPage.clickOnDesktops();
        computerPage.selectSortAToZ();
        Thread.sleep(5000);
        computerPage.clickOnAddToCartButton();
        String expectedText = "Build your own computer";
        Assert.assertEquals(computerPage.getBuildYourOwnComputerText(), expectedText, "Build your own computer is not displayed");
        computerPage.selectProcessor();
        computerPage.selectRam();
        computerPage.selectHdd();
        computerPage.selectVistaPremiumOs();
        computerPage.clickOnTotalCommander();
        Thread.sleep(5000);
        String expectedPrice = "$1,475.00";
        Assert.assertEquals(computerPage.getPrice(), expectedPrice, "$1,475.00 is not displayed");
        computerPage.clickOnAddToCart();
        String expectedText1 = "The product has been added to your shopping cart";
        Assert.assertEquals(computerPage.getProductAddedText(), expectedText1, "The product has been added to your shopping cart is not displayed");
        computerPage.clickOnCloseButton();
        computerPage.mouseHoverOnShoppingCart();
        computerPage.clickOnGoToCartButton();
        String expectedText2 = "Shopping cart";
        Assert.assertEquals(computerPage.getShoppingCartText(), expectedText2, "Shopping cart is not displayed");
        computerPage.changeQuantity();
        computerPage.clickOnUpdateCart();
        String expectedTotal = "$2,950.00";
        Assert.assertEquals(computerPage.getTotal(), expectedTotal, "$2,950.00 is not displayed");
        computerPage.clickOnCheckBox();
        computerPage.clickOnCheckoutButton();
        Assert.assertEquals(computerPage.getWelcomeText(), "Welcome, Please Sign In!", "Welcome, Please Sign In! is not displayed");
        computerPage.clickOnCheckoutAsGuest();
        computerPage.fillMandatoryField();
        computerPage.clickOnNextDayAirButton();
        computerPage.setClickContinue();
        computerPage.clickOnCreditCardRadioButton();
        computerPage.setClickOnContinue();
        computerPage.selectMasterCard();
        computerPage.fillPaymentDetails();
        Assert.assertEquals(computerPage.getCreditCardText(), "Credit Card", "Credit Card payment method is not displayed");
        Assert.assertEquals(computerPage.getNextDayAirText(), "Next Day Air", "Next Day Air shipping method not displayed");
        computerPage.clickOnConfirmButton();
        Assert.assertEquals(computerPage.getThankYouText(), "Thank you", "Thank you text is not displayed");
        Assert.assertEquals(computerPage.getSuccessfullyMessage(), "Your order has been successfully processed!", "Successfully message is not displayed");
        computerPage.setContinueButtonClick();
        Assert.assertEquals(computerPage.getWelcomeToStoreText(), "Welcome to our store", "Welcome to our store textis not displayed");

    }
}

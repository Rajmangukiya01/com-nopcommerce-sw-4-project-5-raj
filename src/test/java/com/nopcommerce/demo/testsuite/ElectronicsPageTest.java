package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsPageTest extends BaseTest {
    ElectronicsPage electronicsPage = new ElectronicsPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        electronicsPage.mouseHoverOnElectronicTab();
        electronicsPage.clickOnCellPhones();
        Assert.assertEquals(electronicsPage.getCellPhoneText(), "Cell phones", "Cell phones is not displayed");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        electronicsPage.mouseHoverOnElectronicTab();
        electronicsPage.clickOnCellPhones();
        Assert.assertEquals(electronicsPage.getCellPhoneText(), "Cell phones", "Cell phones is not displayed");
        electronicsPage.clickOnListViewTab();
        Thread.sleep(5000);
        electronicsPage.clickOnNokiaLumiaProduct();
        Assert.assertEquals(electronicsPage.verifyNokiaLumiaText(), "Nokia Lumia 1020", "Nokia Lumia 1020 is not displayed");
        Assert.assertEquals(electronicsPage.verifyPrice(), "$349.00", "$349.00 is not displayed");
        electronicsPage.changeTheQuantity();
        electronicsPage.clickOnAddToCartButton();
        String expectedText = "The product has been added to your shopping cart";
        Assert.assertEquals(electronicsPage.verifyProductAddedInShoppingCartText(), expectedText, "Product add in shopping cart is not displayed");
        electronicsPage.clickOnCloseButton();
        electronicsPage.hoverOnShoppingCartAndClickOnGoToCartButton();
        Assert.assertEquals(electronicsPage.verifyShoppingCartText(), "Shopping cart", "Shopping cart is not displayed");
        Thread.sleep(5000);
        Assert.assertEquals(electronicsPage.verifyTheQuantity(), "(2)", "2 is not displayed");
        Assert.assertEquals(electronicsPage.verifyTheTotal(), "$698.00", "$698.00 is not displayed");
        electronicsPage.clickOnCheckBox();
        electronicsPage.clickOnCheckoutButton();
        Assert.assertEquals(electronicsPage.verifyWelcomeMessage(), "Welcome, Please Sign In!", "Welcome message is not displayed");
        electronicsPage.clickOnRegisterTab();
        Assert.assertEquals(electronicsPage.verifyRegisterText(), "Register", "Register is not displayed");
        electronicsPage.mandatoryFields();
        electronicsPage.clickOnRegistrationButton();
        Assert.assertEquals(electronicsPage.verifyRegistrationText(), "Your registration completed", "Registration text is not displayed");
        electronicsPage.clickOnContinueTab();
        Assert.assertEquals(electronicsPage.checkShoppingCartText(), "Shopping cart", "Shopping cart is not displayed");
        electronicsPage.clickOnCheckBox();
        electronicsPage.clickOnCheckoutButton();
        electronicsPage.fillDeliveryAddressFields();
        electronicsPage.clickOnContinueButton();
        electronicsPage.clickOn2ndDayAirButton();
        electronicsPage.clickContinue();
        electronicsPage.selectCreditCardRadioButton();
        electronicsPage.clickCon();
        electronicsPage.selectVisaFromDropDown();
        electronicsPage.fillCardDetails();
        electronicsPage.clickConBtn();
        Assert.assertEquals(electronicsPage.verifyCreditCardText(), "Credit Card", "Credit Card is not displayed");
        Assert.assertEquals(electronicsPage.verify2ndDayAirText(), "2nd Day Air", "2nd Day Air is not displayed");
        Assert.assertEquals(electronicsPage.verifyFinalTotal(), "$698.00", "$698.00 is not displayed");
        electronicsPage.clickOnConfirmButton();
        Assert.assertEquals(electronicsPage.verifyThankYouText(), "Thank you", "Thank you is not displayed");
        Assert.assertEquals(electronicsPage.verifySuccessfullyProcessedMessage(), "Your order has been successfully processed!", "Successfully processed message is not displayed");
        electronicsPage.clickOnContinue();
        Assert.assertEquals(electronicsPage.verifyWelcomeToOurStoreText(), "Welcome to our store", "Welcome to our store is not displayed");
        electronicsPage.clickOnLogoutLink();


    }
}

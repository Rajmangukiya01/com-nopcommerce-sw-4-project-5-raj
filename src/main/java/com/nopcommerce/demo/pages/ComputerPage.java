package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By selectMenu = By.xpath("");
    By computerMenu = By.xpath("//ul[1]/li/a[text()='Computers ']");
    By desktops = By.xpath("//img[@alt='Picture for category Desktops']");
    By sortZToA = By.name("products-orderby");
    By sortAToZ = By.name("products-orderby");
    By addToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    By buildYourOwnComputer = By.xpath("//h1[text()='Build your own computer']");
    By processor = By.name("product_attribute_1");
    By ram = By.name("product_attribute_2");
    By hdd = By.id("product_attribute_3_7");
    By vistaPremium = By.id("product_attribute_4_9");
    By totalCommander = By.id("product_attribute_5_12");
    By price = By.id("price-value-1");
    By addToCartButton = By.id("add-to-cart-button-1");
    By productAddedText = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeButton = By.xpath("//span[@class='close']");
    By hoverShoppingCart = By.xpath("//span[@class='cart-label']");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By shoppingCartText = By.xpath("//h1[text()='Shopping cart']");
    By clearQuantity = By.xpath("//input[@value='1']");
    By addQuantity = By.xpath("//input[@value='1']");
    By updateCart = By.id("updatecart");
    By total = By.xpath("//tbody/tr[1]/td[6]/span[1]");
    By checkBox = By.name("termsofservice");
    By checkout = By.id("checkout");
    By welcomeText = By.xpath("//h1[text()='Welcome, Please Sign In!']");
    By checkOutAsGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By firstName = By.id("BillingNewAddress_FirstName");
    By lastName = By.id("BillingNewAddress_LastName");
    By emailId = By.id("BillingNewAddress_Email");
    By country = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address = By.id("BillingNewAddress_Address1");
    By postCode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By continueButton = By.name("save");
    By nextDayButton = By.id("shippingoption_1");
    By clickContinue = By.xpath("//button[@onclick='ShippingMethod.save()']");
    By creditCardRadioButton = By.id("paymentmethod_1");
    By clickOnContinue = By.xpath("//li[4]/div[2]/div[1]/button[1]");
    By masterCard = By.id("CreditCardType");
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expireMonth = By.id("ExpireMonth");
    By expireYear = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By clickContinueButton = By.xpath("//li[5]/div[2]/div[1]/button[1]");
    By creditCardText = By.xpath("//span[contains(text(),'Credit Card')]");
    By nextDayAirText = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]");
    By confirm = By.xpath("//button[contains(text(),'Confirm')]");
    By thankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By successfullyMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButtonClick = By.xpath("//button[contains(text(),'Continue')]");
    By welcomeToStoreText = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public void clickOnComputerMenu() {
        clickOnElement(computerMenu);
    }

    public void clickOnDesktops() {
        clickOnElement(desktops);
    }

    public void selectSortZToA() {
        selectByVisibleTextFromDropDown(sortZToA, "Name: Z to A");
    }

    public void selectSortAToZ() {
        selectByVisibleTextFromDropDown(sortAToZ, "Name: A to Z");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }

    public String getBuildYourOwnComputerText() {
        return getTextFromElement(buildYourOwnComputer);
    }

    public void selectProcessor() {
        selectByVisibleTextFromDropDown(processor, "2.2 GHz Intel Pentium Dual-Core E2200");
    }

    public void selectRam() {
        selectByVisibleTextFromDropDown(ram, "8GB [+$60.00]");
    }

    public void selectHdd() {
        clickOnElement(hdd);
    }

    public void selectVistaPremiumOs() {
        clickOnElement(vistaPremium);
    }

    public void clickOnTotalCommander() {
        clickOnElement(totalCommander);
    }

    public String getPrice() {
        return getTextFromElement(price);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCartButton);
    }

    public String getProductAddedText() {
        return getTextFromElement(productAddedText);
    }

    public void clickOnCloseButton() {
        clickOnElement(closeButton);
    }

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElement(hoverShoppingCart);
    }

    public void clickOnGoToCartButton() {
        clickOnElement(goToCart);
    }

    public String getShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    public void changeQuantity() {
        driver.findElement(clearQuantity).clear();
        sendTextToElements(addQuantity, "2");
    }

    public void clickOnUpdateCart() {
        clickOnElement(updateCart);
    }

    public String getTotal() {
        return getTextFromElement(total);
    }

    public void clickOnCheckBox() {
        clickOnElement(checkBox);
    }

    public void clickOnCheckoutButton() {
        clickOnElement(checkout);
    }

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void clickOnCheckoutAsGuest() {
        clickOnElement(checkOutAsGuest);
    }

    public void fillMandatoryField() {
        sendTextToElements(firstName, "Jack");
        sendTextToElements(lastName, "Leach");
        sendTextToElements(emailId, "jack999@gmail.com");
        selectByVisibleTextFromDropDown(country, "United Kingdom");
        sendTextToElements(city, "London");
        sendTextToElements(address, "100, High road");
        sendTextToElements(postCode, "A1 2AB");
        sendTextToElements(phoneNumber, "07171002233");
        clickOnElement(continueButton);
    }


    public void clickOnNextDayAirButton() {
        clickOnElement(nextDayButton);
    }

    public void setClickContinue() {
        clickOnElement(clickContinue);
    }

    public void clickOnCreditCardRadioButton() {
        clickOnElement(creditCardRadioButton);
    }

    public void setClickOnContinue() {
        clickOnElement(clickOnContinue);
    }

    public void selectMasterCard() {
        selectByVisibleTextFromDropDown(masterCard, "Master card");
    }

    public void fillPaymentDetails() {
        sendTextToElements(cardHolderName, "Jack Leach");
        sendTextToElements(cardNumber, "5555555555554444");
        selectByVisibleTextFromDropDown(expireMonth, "06");
        selectByVisibleTextFromDropDown(expireYear, "2026");
        sendTextToElements(cardCode, "624");
        clickOnElement(clickContinueButton);
    }

    public String getCreditCardText() {
        return getTextFromElement(creditCardText);
    }

    public String getNextDayAirText() {
        return getTextFromElement(nextDayAirText);
    }

    public void clickOnConfirmButton() {
        clickOnElement(confirm);
    }

    public String getThankYouText() {
        return getTextFromElement(thankYouText);
    }

    public String getSuccessfullyMessage() {
        return getTextFromElement(successfullyMessage);
    }

    public void setContinueButtonClick() {
        clickOnElement(continueButtonClick);
    }

    public String getWelcomeToStoreText() {
        return getTextFromElement(welcomeToStoreText);
    }

}

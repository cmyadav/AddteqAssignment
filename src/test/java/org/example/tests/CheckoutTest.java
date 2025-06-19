package org.example.tests;

import org.example.Pages.CheckoutPage;
import org.example.Pages.LoginPage;
import org.example.Pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class CheckoutTest extends BaseTest{

    @Test
    public void completeCheckoutFlow() {
     driver.get("https://www.saucedemo.com/");

    LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");

    ProductPage products = new ProductPage(driver);
        products.addBackpackToCart();

    CheckoutPage checkout = new CheckoutPage(driver);
        checkout.proceedToCheckout("John", "Doe", "12345");

        Assert.assertTrue(checkout.getSuccessMessage().contains("Thank you"));
}
}

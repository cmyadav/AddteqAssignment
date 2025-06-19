package org.example.Pages;

import org.example.Utilts.HandleAlerts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    private By backpackAddToCart = By.id("add-to-cart-sauce-labs-backpack");
    private By cartBadge = By.className("shopping_cart_link");

    public void addBackpackToCart() {
        driver.findElement(backpackAddToCart).click();
    }

    public String getCartCount() {
        return driver.findElement(cartBadge).getText();
    }
}

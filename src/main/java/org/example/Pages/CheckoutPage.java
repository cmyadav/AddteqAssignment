package org.example.Pages;

import org.example.Utilts.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    private WebDriver driver;
    Waits waits=new Waits();

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    private By cartIcon = By.className("shopping_cart_link");
    private By checkoutBtn = By.id("checkout");
    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postalCode = By.id("postal-code");
    private By continueBtn = By.id("continue");
    private By finishBtn = By.id("finish");
    private By successMsg = By.className("complete-header");

    public void proceedToCheckout(String f, String l, String p) {
        waits.waitForElementTobeClickable(driver.findElement(cartIcon)).click();
        waits.waitForElementTobeClickable(driver.findElement(checkoutBtn)).click();
        waits.waitForElementTobeClickable(driver.findElement(firstName)).sendKeys(f);
        waits.waitForElementTobeClickable(driver.findElement(lastName)).sendKeys(l);
        waits.waitForElementTobeClickable(driver.findElement(postalCode)).sendKeys(p);
        waits.waitForElementTobeClickable(driver.findElement(continueBtn)).click();
        waits.waitForElementTobeClickable(driver.findElement(finishBtn)).click();
    }


    public String getSuccessMessage() {
        return driver.findElement(successMsg).getText();
    }
}

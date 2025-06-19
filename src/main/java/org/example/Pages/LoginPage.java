package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;}

        private By username = By.id("user-name");
        private By password = By.id("password");
        private By loginBtn = By.id("login-button");
        private By errorMsg = By.cssSelector("[data-test='error']");

    public void login(String user, String pass){
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }

    public String getErrorMsg() {
        return driver.findElement(errorMsg).getText();
    }
}

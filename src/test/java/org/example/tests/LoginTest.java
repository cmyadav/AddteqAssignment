package org.example.tests;

import org.example.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData", dataProviderClass = DataProviders.class, retryAnalyzer = RetryAnalyzer.class)
    public void loginDataDriven(String username, String password, String expected) {
        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
        switch (expected){
            case("success"):
                Assert.assertTrue(driver.getTitle().contains("Swag Labs"));
            case ("wrong"):
                Assert.assertTrue(loginPage.getErrorMsg().toLowerCase().contains("Username and password do not match"));
            case("locked"):
                Assert.assertTrue(loginPage.getErrorMsg().toLowerCase().contains("locked out"));

        }
    }
}

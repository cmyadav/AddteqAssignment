package org.example.Utilts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class HandleAlerts {
    public void acceptAlertIfPresent(WebDriver driver) {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
            System.out.println("Alert was present and accepted.");
        } catch (NoAlertPresentException e) {
            System.out.println("No alert present.");
        }
    }
}

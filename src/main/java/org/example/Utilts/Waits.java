package org.example.Utilts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    static WebDriverWait wait=new WebDriverWait(DriverFactory.initDriver(), Duration.ofSeconds(30));
    public static WebElement waitForElementTobeClickable(WebElement element){
       return wait.until(ExpectedConditions.elementToBeClickable(element));
    };

}

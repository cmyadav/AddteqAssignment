package org.example.Utilts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {
    public static WebDriver initDriver(){
        ChromeOptions options = new ChromeOptions();
        // Disable the password manager
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);

        return new ChromeDriver(options);
    }
}

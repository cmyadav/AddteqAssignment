package org.example.Utilts;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {
    public static String captureScreenshot(WebDriver driver, String testName) {
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = "screenshots/" + testName + "_" + timestamp + ".png";
        try {
            FileUtils.copyFile(src, new File(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return path;
    }
}
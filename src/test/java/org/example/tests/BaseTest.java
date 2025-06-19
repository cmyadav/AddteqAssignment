package org.example.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.example.Utilts.DriverFactory;
import org.example.Utilts.Log;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected ExtentReports extent = new ExtentReports();;

    @BeforeSuite
    public void setupReport() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("reports/extent-report.html");
        reporter.config().setTheme(Theme.STANDARD);
        reporter.config().setDocumentTitle("Swag Labs Automation Report");
        extent.attachReporter(reporter);
    }
    @BeforeMethod
    public void setUp(){
        driver= DriverFactory.initDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Log.info("Driver initialized");
    }

    @AfterMethod
    public void teardown(){

        if(driver!=null){
            driver.quit();
            Log.info("Driver closed.");
        }
    }

    @AfterSuite
    public void tearDownReport() {
        extent.flush();
    }
}

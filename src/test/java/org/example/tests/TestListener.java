package org.example.tests;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.example.Utilts.ScreenshotUtils;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener extends BaseTest implements ITestListener {
    ExtentTest test;
    @Override
    public void onTestFailure(ITestResult result) {
        Object currentClass = result.getInstance();
        WebDriver driver = ((BaseTest) currentClass).driver;
        String screenshotPath = ScreenshotUtils.captureScreenshot(driver, result.getName());
        test = extent.createTest(result.getName());
        test.log(Status.FAIL, "Test Failed: " + result.getThrowable());
        test.addScreenCaptureFromPath(screenshotPath);
    }

    @Override
    public void onTestStart(ITestResult result) {
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.SKIP, "Test Skipped");
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
    }
}

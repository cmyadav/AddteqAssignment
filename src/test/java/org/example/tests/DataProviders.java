package org.example.Utilts;

import org.testng.annotations.DataProvider;
import java.io.IOException;

public class DataProviders {
    @DataProvider(name = "loginData")
    public Object[][] loginData() throws IOException {
        return ExcelUtils.getTestData("data/loginData.xlsx", "Sheet1");
    }
}

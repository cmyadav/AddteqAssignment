package org.example.Utilts;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {
    public static Object[][] getTestData(String filePath, String sheetName) throws IOException {
        FileInputStream file = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount - 1][colCount];
        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                DataFormatter formatter = new DataFormatter();
                data[i - 1][j] = formatter.formatCellValue(sheet.getRow(i).getCell(j));
            }
        }
        workbook.close();
        file.close();
        return data;
    }
}

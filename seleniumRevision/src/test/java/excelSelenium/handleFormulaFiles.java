package excelSelenium;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class handleFormulaFiles {

    public static void main(String[] args) throws IOException {

        String excelFilePath = ".\\dataFiles\\Formula File.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(1).getLastCellNum();

        for (int r = 0; r <= rows; r++){
            XSSFRow row = sheet.getRow(r);
            for(int c = 0; c < cols; c++){
                XSSFCell cell = row.getCell(c);

                switch (cell.getCellTypeEnum()){
                    case STRING: {
                        System.out.print(cell.getStringCellValue());
                        break;
                    }
                    case NUMERIC:
                    case FORMULA: {
                        System.out.print(cell.getNumericCellValue());
                        break;
                    }
                    case BOOLEAN: {
                        System.out.print(cell.getBooleanCellValue());
                        break;
                    }
                }
                System.out.print("|");
            }
            System.out.println();
        }


    }
}

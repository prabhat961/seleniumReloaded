package excelSelenium;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFormulaCell1 {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Formula calculation");
        XSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue(10);
        row.createCell(1).setCellValue(20);
        row.createCell(2).setCellValue(30);
        row.createCell(3).setCellFormula("A1*B1*C1");

        String FilePAth = ".\\dataFiles\\Calculation.xlsx";
        FileOutputStream outputStream = new FileOutputStream(FilePAth);
        workbook.write(outputStream);

        outputStream.close();

        System.out.println("Calculation file created with Formulas.............");

        };
    }

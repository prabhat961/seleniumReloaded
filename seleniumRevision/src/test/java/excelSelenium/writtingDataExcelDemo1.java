package excelSelenium;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class writtingDataExcelDemo1 {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("EmpInfo");
        Object empData[][] = {{"EmpID","Name","Job"},
                {101, "Prabhat","Engineer"},
                {102, "Peeyush","Loyer"},
                {103, "Rakesh","Analyst"}
        };
        //Using For loop
//        int row = empData.length;
//        int col = empData[0].length;
//
//        //Printing row and column
//        System.out.println("No.of rows:"+row);
//        System.out.println("No.of rows:"+col);
//
//        for (int r = 0; r < row; r++){
//            XSSFRow rows = sheet.createRow(r);
//            for (int c = 0; c < col; c++){
//                XSSFCell cols = rows.createCell(c);
//                Object value = empData[r][c];
//
//                if (value instanceof String)
//                    cols.setCellValue((String)value);
//
//                if (value instanceof Integer)
//                    cols.setCellValue((Integer)value);
//
//                if (value instanceof Boolean)
//                    cols.setCellValue((Boolean) value);
//            }
//        }

        //Using FOr eachLoop

        int rowCount = 0;
        for (Object emp[]: empData){
         XSSFRow row = sheet.createRow(rowCount++);
         int colCount = 0;
         for (Object value: emp){
             XSSFCell col = row.createCell(colCount++);

             if (value instanceof String)
                   col.setCellValue((String)value);

                if (value instanceof Integer)
                    col.setCellValue((Integer)value);

                if (value instanceof Boolean)
                    col.setCellValue((Boolean) value);

         }
        }

        String FilePAth = ".\\dataFiles\\empInfo.xlsx";
        FileOutputStream outputStream = new FileOutputStream(FilePAth);
        workbook.write(outputStream);

        outputStream.close();

        System.out.println("File updated sucesfully........");
    }
}

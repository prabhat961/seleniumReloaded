package excelSelenium;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.imageio.ImageTranscoder;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class readingDataFromExcel {
    public static void main(String[] args) throws IOException {
        String excelFilePath = ".\\dataFiles\\Countries.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        // Using For Loop
//        int rows = sheet.getLastRowNum();
//        int cols = sheet.getRow(1).getLastCellNum();
//
//        for (int r = 0; r <= rows; r++){
//            XSSFRow row = sheet.getRow(r);
//            for(int c = 0; c < cols; c++){
//                XSSFCell cell = row.getCell(c);
//
//                switch (cell.getCellTypeEnum()){
//                    case STRING: {
//                        System.out.print(cell.getStringCellValue());
//                        break;
//                    }
//                    case NUMERIC: {
//                        System.out.print(cell.getNumericCellValue());
//                        break;
//                    }
//                    case BOOLEAN: {
//                        System.out.print(cell.getBooleanCellValue());
//                        break;
//                    }

//                }
//                System.out.print("|");
//            }
//            System.out.println();
//        }

        //Using Itrator

        Iterator itrator = sheet.iterator();
        while (itrator.hasNext()){
            XSSFRow row = (XSSFRow) itrator.next();
            Iterator cellIterator = row.cellIterator();
            while (cellIterator.hasNext()){
                XSSFCell cell = (XSSFCell) cellIterator.next();
                switch (cell.getCellTypeEnum()){
                    case STRING: {
                        System.out.print(cell.getStringCellValue());
                        break;
                    }
                    case NUMERIC: {
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

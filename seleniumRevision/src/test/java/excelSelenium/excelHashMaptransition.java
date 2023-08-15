package excelSelenium;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class excelHashMaptransition {

    public static void main(String[] args) throws IOException {
//        XSSFWorkbook workbook = new XSSFWorkbook();
//        XSSFSheet sheet = workbook.createSheet("Student Info");
//        //Map to Excel
//
//        Map<String, String> data = new HashMap<>();
//        data.put("101", "Prabhat");
//        data.put("102", "Chitra");
//        data.put("103", "Pallavi");
//        data.put("104", "Nidhi");
//        data.put("105", "Khwahish");
//        data.put("106", "Deepak");
//
//        int rowNo = 0;
//        for(Map.Entry entry:data.entrySet()){
//            XSSFRow row = sheet.createRow(rowNo++);
//
//            row.createCell(0).setCellValue((String) entry.getKey());
//            row.createCell(1).setCellValue((String) entry.getValue());
//        }
//
//        FileOutputStream fos = new FileOutputStream(".\\dataFiles\\StudentInfo.xlsx");
//
//        workbook.write(fos);
//        fos.close();
//        System.out.println("Done Sucesfully!!!!!!!!!");
        //Excel to HashMap

        FileInputStream fis = new FileInputStream(".\\dataFiles\\StudentInfo.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Student Info");
        int rowNum = sheet.getLastRowNum();
        HashMap<String, String> data = new HashMap<>();

        //Reading data from excel to hashmap
        for (int r =0; r <= rowNum; r++){
            String key = sheet.getRow(r).getCell(0).getStringCellValue();
            String value = sheet.getRow(r).getCell(1).getStringCellValue();
            data.put(key, value);

        }
        // Read and print the hashmap data
        for(Map.Entry entry:data.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }




    }
}

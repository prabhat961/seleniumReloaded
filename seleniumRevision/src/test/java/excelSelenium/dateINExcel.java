package excelSelenium;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class dateINExcel {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("DateFIle");

        //Date in Nummber Format
        XSSFCell cell = sheet.createRow(0).createCell(0);
        cell.setCellValue(new Date());

        //FOrmate date cells
       XSSFCreationHelper creationHelper = workbook.getCreationHelper();
       CellStyle style = workbook.createCellStyle();
       style.setDataFormat(creationHelper.createDataFormat().getFormat("mm-dd-yyyy"));
       XSSFCell cell1 = sheet.createRow(1).createCell(0);
       cell1.setCellValue(new Date());
       cell1.setCellStyle(style);

       FileOutputStream fos = new FileOutputStream(".//dataFiles//dateFormates.xlsx");
        workbook.write(fos);
        workbook.close();
        fos.close();

        System.out.println("Operation Done Successfully!!!!!!");
    }

}

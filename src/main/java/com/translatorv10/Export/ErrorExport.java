package com.translatorv10.Export;

import com.translatorv10.controller.Controller;
import com.translatorv10.domain.ERROR_NLS;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ErrorExport {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<ERROR_NLS> error_nlsList;

    public ErrorExport(List<ERROR_NLS> error_nlsList) {
        this.error_nlsList = error_nlsList;
        workbook = new XSSFWorkbook();
        sheet=workbook.createSheet("ERROR_NLS");

    }


    private void writeHeaderRow(){
        Row row = sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue("ERROR_ID");
        cell=row.createCell(1);
        cell.setCellValue("TEXT");
        cell=row.createCell(2);
        cell.setCellValue("LONG_TEXT");
        cell=row.createCell(3);
        cell.setCellValue(Controller.currentlanguage.toUpperCase()+"_TEXT");
        cell=row.createCell(4);
        cell.setCellValue(Controller.currentlanguage.toUpperCase()+"_LONG_TEXT");
        cell=row.createCell(5);
        cell.setCellValue("STATUS");
    }


    private void writeDataRows(){
        int rowCount = 1 ;
        for (ERROR_NLS errorNls : error_nlsList){
            Row row = sheet.createRow(rowCount++);
            Cell cell = row.createCell(0);
            cell.setCellValue(errorNls.getERROR_ID());
            cell = row.createCell(1);
            cell.setCellValue(errorNls.getTEXT());
            cell = row.createCell(2);
            cell.setCellValue(errorNls.getLONG_TEXT());
            cell = row.createCell(3);
            cell.setCellValue(errorNls.getTr_TEXT());
            cell = row.createCell(4);
            cell.setCellValue(errorNls.getTr_LONG_TEXT());
            cell = row.createCell(5);
            cell.setCellValue(errorNls.getSTATUS());



        }
    }


    public void export(HttpServletResponse response) throws IOException{
        writeHeaderRow();
        writeDataRows();
        ServletOutputStream outputStream= response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();



}
}

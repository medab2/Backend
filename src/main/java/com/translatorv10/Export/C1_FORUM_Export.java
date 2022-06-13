package com.translatorv10.Export;

import com.translatorv10.controller.Controller;
import com.translatorv10.domain.C1_FORUM_NLS;
import com.translatorv10.domain.ERROR_NLS;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class C1_FORUM_Export {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<C1_FORUM_NLS> c1ForumNlsList;

    public C1_FORUM_Export(List<C1_FORUM_NLS> c1ForumNlsList) {
        this.c1ForumNlsList = c1ForumNlsList;
        workbook = new XSSFWorkbook();
        sheet = workbook.createSheet("C1_FORUM_NLS");

    }

    private void writeHeaderRow() {
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("ID_FORUM");
        cell = row.createCell(1);
        cell.setCellValue("ID_CLASSIF1");
        cell = row.createCell(2);
        cell.setCellValue("DESCR_CLASSIF1");
        cell = row.createCell(3);
        cell.setCellValue(Controller.currentlanguage.toUpperCase() +"_DESCR_CLASSIF1");
        cell = row.createCell(4);
        cell.setCellValue("STATUS");
    }

    private void writeDataRows() {
        int rowCount = 1;
        for (C1_FORUM_NLS c1ForumNls : c1ForumNlsList) {
            Row row = sheet.createRow(rowCount++);
            Cell cell = row.createCell(0);
            cell.setCellValue(c1ForumNls.getID_FORUM());
            cell = row.createCell(1);
            cell.setCellValue(c1ForumNls.getID_CLASSIF1());
            cell = row.createCell(2);
            cell.setCellValue(c1ForumNls.getDESCR_CLASSIF1());
            cell = row.createCell(3);
            cell.setCellValue(c1ForumNls.getTr_DESCR_CLASSIF1());
            cell = row.createCell(4);
            cell.setCellValue(c1ForumNls.getSTATUS());


        }

    }

    public void export(HttpServletResponse response) throws IOException {
        writeHeaderRow();
        writeDataRows();
        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

    }

}
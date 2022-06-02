/*
package com.translatorv10.services;

import com.translatorv10.controller.Controller;
import com.translatorv10.domain.ERROR_NLS;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class ExportService {

    public static ByteArrayInputStream errorExcel(List<ERROR_NLS >error_nls) {

        String[] columns = {"error_id", "text","long_text", Controller.currentlanguage+"_text", Controller.currentlanguage + "_long_text", "status"};
        try (Workbook workbook = new XSSFWorkbook();
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream();) {

            CreationHelper creationHelper = workbook.getCreationHelper();

            Sheet sheet = workbook.createSheet("ERROR_NLS");
            sheet.autoSizeColumn(columns.length);

            Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerFont.setColor(IndexedColors.BLACK.getIndex());

            CellStyle cellStyle = workbook.createCellStyle();
            cellStyle.setFont(headerFont);

            //Row For header
            Row headerRow = sheet.createRow(0);

            for (int col = 0; col < columns.length; col++) {
                Cell cell = headerRow.createCell(col);
                cell.setCellValue(columns[col]);
                cell.setCellStyle(cellStyle);

            }

            CellStyle cellStyle1=workbook.createCellStyle();
            cellStyle1.setDataFormat(creationHelper.createDataFormat().getFormat("s"));

            int rowIndex = 1;
            for(ERROR_NLS errorNls:error_nls){
                Row row =sheet.createRow(rowIndex++);

                row.createCell(0).setCellValue(errorNls.getERROR_ID());
                row.createCell(1).setCellValue(errorNls.getTEXT());
                row.createCell(2).setCellValue(errorNls.getLONG_TEXT());
                row.createCell(3).setCellValue(errorNls.getTr_TEXT());
                row.createCell(4).setCellValue(errorNls.getTr_LONG_TEXT());
                row.createCell(5).setCellValue(errorNls.getSTATUS());


            }
                workbook.write(outputStream);

            return new ByteArrayInputStream(outputStream.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}
*/

package com.translatorv10.controller;

import com.translatorv10.domain.C1_FORUM_NLS;
import com.translatorv10.domain.ERROR_NLS;
import com.translatorv10.repo.ERROR_NLS_Repo;
import com.translatorv10.services.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

;


@RestController
@CrossOrigin(origins = "*")
public class Controller {

    //@Autowired
    //private Vr_Ln_Service vrLnService;

    public static String currentlanguage ;

    public  String currentversion ;


    @Autowired
    public ERROR_NLS_Repo error_nls_repo;


     @Autowired
    private C1_FORUM_NLS_Service c1_forum_nls_service;

    @Autowired
    private ERROR_NLS_Service error_nls_service;
    @Autowired
    private C2_FORUM_NLS_Service c2_forum_nls_service;

    @Autowired
    private C3_FORUM_NLS_Service c3_forum_nls_service;



    @RequestMapping(path = "/")
    public void setDatainDB() {
        try {
           // vrLnService.saveln_vr(currentlanguage , currentversion);
            error_nls_service.saveError(currentlanguage);
            error_nls_service.updateERRORSt();
            c1_forum_nls_service.saveC1(currentlanguage);
            c2_forum_nls_service.saveC2(currentlanguage);
            c1_forum_nls_service.updatedC1ST();
        } catch (DataIntegrityViolationException e) {
            System.out.println("history already exist");
        } catch (SQLIntegrityConstraintViolationException e) {
            e.printStackTrace();
        }

    }


    @GetMapping("/ERROR_NLS")
    List<ERROR_NLS> getErrorNls()
    {
        return error_nls_service.findAllError();
    }


    @RequestMapping("/version")
    public static String savelanguage(@RequestBody String language) {
        currentlanguage = language;
        System.out.println(currentlanguage);

        return  currentlanguage.toString() ;
    }


    @GetMapping("/C1_Forum_NLS")
    List<C1_FORUM_NLS> getC1() {
        return c1_forum_nls_service.findAllC1();
    }


  /*  @GetMapping(value = "/ERROR_NLS/export/excel")
    public ResponseEntity<InputStreamResource> exportErrorExcel(){
        List<ERROR_NLS> error_nls=(List<ERROR_NLS>) error_nls_repo.findAll();
        ByteArrayInputStream byteArrayInputStream = exportService.errorExcel(error_nls);
        HttpHeaders headers = new HttpHeaders();
        headers.add("content.Disposition","inline; filename=ERROR_NLS.xlsx");

        return ResponseEntity.ok().headers(headers).body(new InputStreamResource(byteArrayInputStream));
    }
*/

  @RequestMapping(value = "/import-excel", method = RequestMethod.POST)
  public ResponseEntity<List<ERROR_NLS>> importExcelFile(@RequestParam("file") MultipartFile files) throws IOException {
      HttpStatus status = HttpStatus.OK;
      List<ERROR_NLS> error_nlsList = new ArrayList<>();

      XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());
      XSSFSheet worksheet = workbook.getSheetAt(0);

      for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
          if (index > 0) {
              ERROR_NLS error_nls = new ERROR_NLS();

              XSSFRow row = worksheet.getRow(index);

              String id = (String) row.getCell(0).getStringCellValue();
              error_nls.setERROR_ID(id.toString());
              if (row.getCell(1)==(null)){
                  error_nls.setTEXT(null);
              }else{
              error_nls.setTEXT(row.getCell(1).getStringCellValue());}
              if (row.getCell(2)==(null)){
                  error_nls.setLONG_TEXT(null);
              }else{
              error_nls.setLONG_TEXT(row.getCell(2).getStringCellValue());}
              if (row.getCell(3)==(null)){
                  error_nls.setTr_TEXT(null);
              }else {
              error_nls.setTr_TEXT(row.getCell(3).getStringCellValue());}
              if (row.getCell(4)==(null)){
                  error_nls.setTr_LONG_TEXT(null);
              }else{
              error_nls.setTr_LONG_TEXT(row.getCell(4).getStringCellValue());}

              error_nls.setSTATUS(row.getCell(5).getStringCellValue());

              error_nlsList.add(error_nls);
          }
      }
      error_nls_service.importError(error_nlsList);
      return new ResponseEntity<>(error_nlsList, status);
  }
}












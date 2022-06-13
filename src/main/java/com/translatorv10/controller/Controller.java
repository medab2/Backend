package com.translatorv10.controller;

import com.translatorv10.Export.C1_FORUM_Export;
import com.translatorv10.Export.ErrorExport;
import com.translatorv10.domain.C1_FORUM_NLS;
import com.translatorv10.domain.ERROR_NLS;
import com.translatorv10.keys.C1_Keys;
import com.translatorv10.repo.C1_FORUM_NLS_Repo;
import com.translatorv10.repo.ERROR_NLS_Repo;
import com.translatorv10.services.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

;import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;


@RestController
@CrossOrigin(origins = "*")
public class Controller {



    public static String currentlanguage ;

    public static String currentversion ;

    public static String oldVersion;

    @Autowired
    public ERROR_NLS_Repo error_nls_repo;

    @Autowired
    public C1_FORUM_NLS_Repo c1_forum_nls_repo;

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


    @PostMapping("/version")
    public static String savelanguage( @RequestParam String newVersion , @RequestParam String language,@RequestParam String old) {
        currentlanguage=language;
        currentversion=newVersion;
        oldVersion=old;
        System.out.println(currentlanguage.toUpperCase());
        System.out.println(currentversion);
        System.out.println(oldVersion);
       return  currentlanguage.toString()+  currentversion.toString() +'\t'+oldVersion.toString() ;

    }


    @GetMapping("/C1_Forum_NLS")
    List<C1_FORUM_NLS> getC1() {
        return c1_forum_nls_service.findAllC1();
    }



  @RequestMapping(value = "/import-excel", method = RequestMethod.POST)
  public ResponseEntity<List<ERROR_NLS>> importExcelFile(@RequestParam("file") MultipartFile files) throws IOException {
      HttpStatus status = HttpStatus.OK;
      String filename = files.getOriginalFilename();
      System.out.println(filename);
      List<ERROR_NLS> error_nlsList = null;
      if (files.getOriginalFilename().equals("ERROR_NLS.xlsx")) {
          error_nlsList = new ArrayList<>();
          XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());
          XSSFSheet worksheet = workbook.getSheetAt(0);

          for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
              if (index > 0) {
                  ERROR_NLS error_nls = new ERROR_NLS();
                  XSSFRow row = worksheet.getRow(index);
                  String id = (String) row.getCell(0).getStringCellValue();
                  error_nls.setERROR_ID(id.toString());



                  if (row.getCell(1) == (null)) {
                      error_nls.setTEXT(null);
                  } else {
                      error_nls.setTEXT(row.getCell(1).getStringCellValue());
                  }

                  if (row.getCell(2) == (null)) {
                      error_nls.setLONG_TEXT(null);
                  } else {
                      error_nls.setLONG_TEXT(row.getCell(2).getStringCellValue());
                  }

                  if (row.getCell(3) == (null)) {
                      error_nls.setTr_TEXT(null);
                  } else {
                      error_nls.setTr_TEXT(row.getCell(3).getStringCellValue());
                  }

                  if (row.getCell(4) == (null)) {
                      error_nls.setTr_LONG_TEXT(null);
                  } else {
                      error_nls.setTr_LONG_TEXT(row.getCell(4).getStringCellValue());
                  }

                  error_nls.setSTATUS(row.getCell(5).getStringCellValue());
                  error_nlsList.add(error_nls);
              }
          }

          System.out.println(error_nlsList);
          error_nls_service.importError(error_nlsList);

      }

      if (files.getOriginalFilename().equals("C1_FORUM_NLS.xlsx")) {
          List<C1_FORUM_NLS> c1ForumNlsList = new ArrayList<>();
          XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());
          XSSFSheet worksheet = workbook.getSheetAt(0);

          for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
              if (index > 0) {
                  C1_FORUM_NLS c1_forum_nls = new C1_FORUM_NLS();
                  XSSFRow row = worksheet.getRow(index);
                  String id = (String) row.getCell(0).getStringCellValue();
                  c1_forum_nls.setID_FORUM(id.toString());


                  if (row.getCell(1) == (null)) {
                      c1_forum_nls.setID_CLASSIF1(null);
                  } else if (String.valueOf(row.getCell(1).getCellType()).equals("NUMERIC")) {
                      int i = (int) row.getCell(1).getNumericCellValue();
                      c1_forum_nls.setID_CLASSIF1(String.valueOf(i));
                  } else {
                      c1_forum_nls.setID_CLASSIF1(row.getCell(1).getStringCellValue());
                  }
                  if (row.getCell(2) == (null)) {
                      c1_forum_nls.setDESCR_CLASSIF1(null);
                  } else if (String.valueOf(row.getCell(2).getCellType()).equals("NUMERIC")) {
                      c1_forum_nls.setDESCR_CLASSIF1(String.valueOf(row.getCell(2).getNumericCellValue()));
                  } else {
                      c1_forum_nls.setDESCR_CLASSIF1(row.getCell(2).getStringCellValue());
                  }

                  if (row.getCell(3) == (null)) {
                      c1_forum_nls.setTr_DESCR_CLASSIF1(null);
                  } else if (String.valueOf(row.getCell(2).getCellType()).equals("NUMERIC")) {
                      c1_forum_nls.setTr_DESCR_CLASSIF1(String.valueOf(row.getCell(3).getNumericCellValue()));
                  }
                  else{ c1_forum_nls.setTr_DESCR_CLASSIF1(row.getCell(3).getStringCellValue());

                  }
                  if (row.getCell(4) == null) {
                      c1_forum_nls.setSTATUS(null);
                  } else {
                      c1_forum_nls.setSTATUS(row.getCell(4).getStringCellValue());
                  }
                  c1ForumNlsList.add(c1_forum_nls);
              }
          }

          System.out.println(c1ForumNlsList);
          c1_forum_nls_service.importc1(c1ForumNlsList);

      }

      return new ResponseEntity<>(error_nlsList, status);
  }
    @PutMapping("/ERROR_NLS/{Error_id}")
    public ResponseEntity<ERROR_NLS> updateERRORColumn(@PathVariable("Error_id") String Error_id ,@RequestBody ERROR_NLS error_nls)
  {
      Optional<ERROR_NLS> errorNls =error_nls_repo.findById(Error_id);
      if(errorNls.isPresent()){

          ERROR_NLS errornls= errorNls.get();
          errornls.setERROR_ID(error_nls.getERROR_ID());
          errornls.setTEXT(error_nls.getTEXT());
          errornls.setTr_TEXT(error_nls.getTr_TEXT());
          errornls.setTr_LONG_TEXT(error_nls.getTr_LONG_TEXT());
          errornls.setSTATUS(error_nls.getSTATUS());
          return new ResponseEntity<>(error_nls_repo.save(errornls),HttpStatus.OK);

      }else {

          return new ResponseEntity<>(HttpStatus.NOT_FOUND);

      }
  }

    @PutMapping("/C1_FORUM_NLS/update")
    public ResponseEntity<C1_FORUM_NLS> updateC1Column(@RequestBody C1_FORUM_NLS c1_forum_nls)
    {   C1_Keys c1_keys = new C1_Keys(c1_forum_nls.getID_FORUM(),c1_forum_nls.getID_CLASSIF1());
        Optional<C1_FORUM_NLS> c1_forum_nls1 =c1_forum_nls_repo.findById(c1_keys);
        if(c1_forum_nls1.isPresent()){

            C1_FORUM_NLS c1ForumNls= c1_forum_nls1.get();
            c1ForumNls.setID_CLASSIF1(c1_forum_nls.getID_CLASSIF1());
            c1ForumNls.setID_FORUM(c1_forum_nls.getID_FORUM());
            c1ForumNls.setDESCR_CLASSIF1(c1_forum_nls.getDESCR_CLASSIF1());
            c1ForumNls.setTr_DESCR_CLASSIF1(c1_forum_nls.getTr_DESCR_CLASSIF1());
            c1ForumNls.setSTATUS(c1_forum_nls.getSTATUS());
            return new ResponseEntity<>(c1_forum_nls_repo.save(c1ForumNls),HttpStatus.OK);

        }else {

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }}

  @GetMapping("/ERROR_NLS/export/excel")
    public void exportEroorToExcel(HttpServletResponse respons) throws IOException{
      respons.setContentType("application/octet-stream");
      String headerKey="Content-Disposition";
      String headerValue="attachement;filename=ERROR_NLS.xlsx";
      respons.setHeader(headerKey,headerValue);
      List<ERROR_NLS> error_nlsList= error_nls_service.findAllError();
      ErrorExport errorExport = new ErrorExport(error_nlsList);
      errorExport.export(respons);

    }
    @GetMapping("/C1_FORUM_NLS/export/excel")
    public void exportToExcel(HttpServletResponse respons) throws IOException{
        respons.setContentType("application/octet-stream");
        String headerKey="Content-Disposition";
        String headerValue="attachement;filename=C1_FORUM_NLS.xlsx";
        respons.setHeader(headerKey,headerValue);
        List<C1_FORUM_NLS> c1ForumNlsList= c1_forum_nls_service.findAllC1();
        C1_FORUM_Export c1_forum_export= new C1_FORUM_Export(c1ForumNlsList);
        c1_forum_export.export(respons);

    }


}












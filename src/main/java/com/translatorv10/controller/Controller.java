package com.translatorv10.controller;

import com.translatorv10.domain.C1_FORUM_NLS;
import com.translatorv10.domain.ERROR_NLS;
import com.translatorv10.repo.ERROR_NLS_Repo;
import com.translatorv10.repo.VR_Ln_Repo;
import com.translatorv10.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.*;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class Controller {
    @Autowired
    private Vr_Ln_Service vrLnService;

    public static String currentlanguage ;

    public  String currentversion ;

    @Autowired
    private ERROR_NLS_Repo error_nls_repo;
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
            vrLnService.saveln_vr(currentlanguage , currentversion);
            error_nls_service.saveError(currentlanguage);
            c1_forum_nls_service.saveC1(currentlanguage);
            c2_forum_nls_service.saveC2(currentlanguage);
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
    public  String savelanguage(@RequestBody String language) {
        currentlanguage = language;
        System.out.println(currentlanguage);
        return  currentlanguage;
    }


    @GetMapping("/C1_Forum_NLS")
    List<C1_FORUM_NLS> getC1() {
        return c1_forum_nls_service.findAllC1();
    }




}









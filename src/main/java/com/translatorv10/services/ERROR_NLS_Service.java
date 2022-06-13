package com.translatorv10.services;

import com.translatorv10.controller.Controller;
import com.translatorv10.domain.ERROR_NLS;
import com.translatorv10.repo.ERROR_NLS_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ERROR_NLS_Service {


    private List<ERROR_NLS> listNew =new ArrayList<>();
    private List<ERROR_NLS> listChanged =new ArrayList<>();
    private List<ERROR_NLS> listDeleted =new ArrayList<>();
    private Map<String,ERROR_NLS> errorlist1 = new HashMap<>();
    private Map<String,ERROR_NLS> errorlist2 = new HashMap<>();
    @Autowired
    private ERROR_NLS_Repo error_nls_repo;


    public ERROR_NLS_Service(ERROR_NLS_Repo error_nls_repo) {
        this.error_nls_repo = error_nls_repo;
    }


    public void saveError(String currentlanguage) throws SQLIntegrityConstraintViolationException{
        System.out.println("11"+currentlanguage);

        try{

            Connection con= DriverManager.getConnection("jdbc:db2://10.93.30.7:50000/PFE03","db2admin","db2admin");
            Statement stmt=con.createStatement();
            String query= "SELECT fn.ERROR_ID ,fn.TEXT, fn.LONG_TEXT, fn1.TEXT, fn1.LONG_TEXT FROM THERA.ERROR_NLS fn LEFT OUTER JOIN  THERA.ERROR_NLS fn1 ON fn.ERROR_ID = fn1.ERROR_ID  AND fn.LANGUAGE='it' AND fn1.LANGUAGE='"+currentlanguage+"' WHERE fn.LANGUAGE='it'";
            ResultSet rs=stmt.executeQuery(query);

                while(rs.next()) {
                    ERROR_NLS error_nls1 = new ERROR_NLS();
                    error_nls1.setERROR_ID(rs.getString(1).trim());
                    error_nls1.setTEXT(rs.getString(2));
                    error_nls1.setLONG_TEXT(rs.getString(3));
                    error_nls1.setTr_TEXT(rs.getString(4));
                    error_nls1.setTr_LONG_TEXT(rs.getString(5));
                    System.out.println(currentlanguage + "23");
                    error_nls_repo.save(error_nls1);
                    }

                } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List findAllError() {
        return error_nls_repo.findAll();
    }

    public void  updateERRORSt() {

        try {

            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/translatorv10", "root", "root");
            Connection con2 = DriverManager.getConnection("jdbc:db2://JUPITER2:50000/TRANS_FR", "db2admin", "db2admin");

            Statement stmt1 = con1.createStatement();
            Statement stmt2 = con2.createStatement();

            ResultSet rs1 = stmt1.executeQuery("select * from translatorv10.ERROR_NLS");
            ResultSet rs2 = stmt2.
                    executeQuery("select * from "+ Controller.currentlanguage.toUpperCase() +"040641.ERROR_NLS  ");

            while (rs1.next()) {
                ERROR_NLS error_nls = new ERROR_NLS();
                error_nls.setERROR_ID(rs1.getString(1).trim());
                error_nls.setTEXT(rs1.getString(4));
                error_nls.setLONG_TEXT(rs1.getString(5));
                error_nls.setTr_LONG_TEXT(rs1.getString(2));
                error_nls.setSTATUS(rs1.getString(3));
                errorlist1.put(error_nls.getERROR_ID(),error_nls);
            }

            while (rs2.next()) {
                ERROR_NLS error_nls = new ERROR_NLS();
                error_nls.setERROR_ID(rs2.getString(1).trim());
                error_nls.setTEXT(rs2.getString(2));
                error_nls.setLONG_TEXT(rs2.getString(3));
                error_nls.setTr_LONG_TEXT(rs2.getString(4));
                error_nls.setSTATUS(rs2.getString(5));
                errorlist2.put(error_nls.getERROR_ID(),error_nls);
            }

            for (Map.Entry mapentry : errorlist1.entrySet()) {

                   String MapKey =(String)mapentry.getKey();
                    if (errorlist2.containsKey(MapKey)){

                        ERROR_NLS error_nls =(ERROR_NLS) mapentry.getValue();
                        String DESC = error_nls.getTEXT();
                        ERROR_NLS error_nls2 =(ERROR_NLS) errorlist2.get(MapKey);
                        String DESC2 = error_nls2.getTEXT();

                        if(DESC!=null && error_nls2!=null && !DESC.equals(DESC2)) {

                            error_nls.setSTATUS("C");
                            listChanged.add(error_nls);

                        }
                    }else {

                        ERROR_NLS error_nls =(ERROR_NLS) mapentry.getValue();
                        error_nls.setSTATUS("N");
                        listNew.add(error_nls);

                    }
                    }
            for (Map.Entry mapentry : errorlist2.entrySet()) {

                String MapKey = (String) mapentry.getKey();
                if (!errorlist1.containsKey(MapKey)) {

                    ERROR_NLS error_nls = (ERROR_NLS) mapentry.getValue();
                    error_nls.setSTATUS("D");
                    listDeleted.add(error_nls);

                }
            }
        }
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        for (ERROR_NLS error_nls : listNew ) {

            ERROR_NLS errorNls = error_nls_repo.getById(error_nls.getERROR_ID().trim());
            errorNls.setSTATUS(error_nls.getSTATUS());
            error_nls_repo.save(errorNls);

        }

        for (ERROR_NLS error_nls  : listChanged ) {

            ERROR_NLS errorNls = error_nls_repo.getById(error_nls.getERROR_ID().trim());
            errorNls.setSTATUS(error_nls.getSTATUS());
            error_nls_repo.save(errorNls);

        }

        for (ERROR_NLS error_nls  : listDeleted ) {
            ERROR_NLS errorNls =new ERROR_NLS();
            errorNls.setERROR_ID(error_nls.getERROR_ID().trim());
            errorNls.setTEXT(error_nls.getTEXT());
            errorNls.setTr_LONG_TEXT(error_nls.getTr_LONG_TEXT());
            errorNls.setSTATUS(error_nls.getSTATUS().trim());
            error_nls_repo.save(errorNls);
        }
    }


    
    public void importError(List<ERROR_NLS> error_nlsList) {

            for (ERROR_NLS errornls : error_nlsList) {

                ERROR_NLS error_nls = error_nls_repo.getById(errornls.getERROR_ID());
                System.out.println(error_nls);
                error_nls.setERROR_ID(errornls.getERROR_ID().trim());
                error_nls.setTEXT(errornls.getTEXT());
                error_nls.setTr_LONG_TEXT(errornls.getTr_LONG_TEXT());
                error_nls.setTr_TEXT(errornls.getTr_TEXT());
                error_nls.setLONG_TEXT(errornls.getLONG_TEXT());
                error_nls.setSTATUS(errornls.getSTATUS());
                error_nls_repo.save(error_nls);

            }

    }

}
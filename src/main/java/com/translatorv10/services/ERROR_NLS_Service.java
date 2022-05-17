package com.translatorv10.services;

import com.translatorv10.domain.ERROR_NLS;
import com.translatorv10.repo.ERROR_NLS_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.List;

@Service
public class ERROR_NLS_Service {


    @Autowired
    private ERROR_NLS_Repo error_nls_repo;
    public void saveError(String currentlanguage) throws SQLIntegrityConstraintViolationException{

        System.out.println("11"+currentlanguage);

        try{

            Connection con= DriverManager.getConnection("jdbc:db2://10.93.30.7:50000/PFE03","db2admin","db2admin");
            Statement stmt=con.createStatement();
            String query= "SELECT fn.ERROR_ID ,fn.TEXT, fn.LONG_TEXT, fn1.TEXT, fn1.LONG_TEXT FROM THERA.ERROR_NLS fn LEFT OUTER JOIN  THERA.ERROR_NLS fn1 ON fn.ERROR_ID = fn1.ERROR_ID  AND fn.LANGUAGE='it' AND fn1.LANGUAGE='"+currentlanguage+"' WHERE fn.LANGUAGE='it'";
            ResultSet rs=stmt.executeQuery(query);


                while(rs.next()) {
                    ERROR_NLS error_nls1 = new ERROR_NLS();
                    error_nls1.setERROR_ID(rs.getString(1));
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
    }

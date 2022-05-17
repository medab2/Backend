package com.translatorv10.services;

import com.translatorv10.domain.C1_FORUM_NLS;
import com.translatorv10.repo.C1_FORUM_NLS_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.List;

@Service
public class C1_FORUM_NLS_Service {

    @Autowired
    private C1_FORUM_NLS_Repo c1_forum_nls_repo;


    public C1_FORUM_NLS_Service (C1_FORUM_NLS_Repo c1_forum_nls_repo){
        this.c1_forum_nls_repo=c1_forum_nls_repo;
    }

    public void saveC1(String currentlanguage) throws SQLIntegrityConstraintViolationException {
        System.out.println("service called");

        try{

            Connection con= DriverManager.getConnection("jdbc:db2://10.93.30.7:50000/PFE03","db2admin","db2admin");
            Statement stmt=con.createStatement();
            String schema="THERA";
            String query= "SELECT fn.ID_FORUM ,fn.ID_CLASSIF1, fn.DESCR_CLASSIF1, fn1.DESCR_CLASSIF1 FROM THERA.C1_FORUM_NLS fn " +
                    "LEFT OUTER JOIN  THERA.C1_FORUM_NLS fn1 ON fn.ID_FORUM = fn1.ID_FORUM AND fn.ID_CLASSIF1 = fn1.ID_CLASSIF1 " +
                    "AND fn.ID_LINGUA='it' AND fn1.ID_LINGUA='"+currentlanguage+"' WHERE fn.ID_LINGUA='it'";
            ResultSet rs=stmt.executeQuery(query);

            while(rs.next()) {
                C1_FORUM_NLS c1ForumNls = new C1_FORUM_NLS();
                c1ForumNls.setID_FORUM(rs.getString(1));
                c1ForumNls.setID_CLASSIF1(rs.getString(2));
                c1ForumNls.setDESCR_CLASSIF1(rs.getString(3));
                c1ForumNls.setTr_DESCR_CLASSIF1(rs.getString(4));
                c1_forum_nls_repo.save(c1ForumNls);
                }

            } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public List<C1_FORUM_NLS> findAllC1(){
        return c1_forum_nls_repo.findAll();
    }

    public C1_FORUM_NLS updateC1(C1_FORUM_NLS c1_forum_nls){
        return c1_forum_nls_repo.save(c1_forum_nls);
    }

    public void deleteC1(String ID_FORUM){
        c1_forum_nls_repo.deleteById(ID_FORUM);
    }


}

package com.translatorv10.services;

import com.translatorv10.domain.C1_FORUM_NLS;
import com.translatorv10.domain.C2_FORUM_NLS;
import com.translatorv10.domain.ERROR_NLS;
import com.translatorv10.repo.C2_FORUM_NLS_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.List;

@Service
public class C2_FORUM_NLS_Service {

    @Autowired
    private C2_FORUM_NLS_Repo c2_forum_nls_repo;


    public C2_FORUM_NLS_Service(C2_FORUM_NLS_Repo c2_forum_nls_repo){
        this.c2_forum_nls_repo= c2_forum_nls_repo;
    }

    public void saveC2(String currentlanguage) throws SQLIntegrityConstraintViolationException {
        try {


            Connection con = DriverManager.getConnection("jdbc:db2://10.93.30.7:50000/PFE03", "db2admin", "db2admin");
            Statement stmt = con.createStatement();
            String schema = "THERA";
            String query = "SELECT fn.ID_FORUM ,fn.ID_CLASSIF2, fn.DESCR_CLASSIF2, fn2.DESCR_CLASSIF2 FROM THERA.C2_FORUM_NLS fn LEFT OUTER JOIN  THERA.C2_FORUM_NLS fn2 ON fn.ID_FORUM = fn2.ID_FORUM AND fn.ID_CLASSIF2 = fn2.ID_CLASSIF2 AND fn.ID_LINGUA='it' AND fn2.ID_LINGUA='" + currentlanguage + "' WHERE fn.ID_LINGUA='it'";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                C2_FORUM_NLS c2ForumNls = new C2_FORUM_NLS();
                c2ForumNls.setID_FORUM(rs.getString(1));
                c2ForumNls.setID_CLASSIF2(rs.getString(2));
                c2ForumNls.setDESCR_CLASSIF2(rs.getString(3));
                c2ForumNls.setTr_DESCR_CLASSIF2(rs.getString(4));
                c2_forum_nls_repo.save(c2ForumNls);

            }


        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<C2_FORUM_NLS> findAllC2(){
        return c2_forum_nls_repo.findAll();
    }



    public C2_FORUM_NLS updateC2(C2_FORUM_NLS c2_forum_nls){
        return c2_forum_nls_repo.save(c2_forum_nls);
    }


}

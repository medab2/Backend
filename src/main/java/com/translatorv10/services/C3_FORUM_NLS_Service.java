package com.translatorv10.services;

import com.translatorv10.domain.C3_FORUM_NLS;
import com.translatorv10.repo.C3_FORUM_NLS_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.List;

@Service
public class C3_FORUM_NLS_Service {
    @Autowired
    private C3_FORUM_NLS_Repo c3_forum_nls_repo;


    public C3_FORUM_NLS_Service(C3_FORUM_NLS_Repo c3_forum_nls_repo){
        this.c3_forum_nls_repo= c3_forum_nls_repo;
    }



    public void saveC3() throws SQLIntegrityConstraintViolationException {
        try{

            Connection con= DriverManager.getConnection("jdbc:db2://10.93.30.7:50000/PFE03","db2admin","db2admin");
            Statement stmt=con.createStatement();
            String schema="THERA";
            String query= "SELECT * FROM " +schema+".C3_FORUM_NLS WHERE ID_LINGUA ='it'";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()) {
                C3_FORUM_NLS c3ForumNls = new C3_FORUM_NLS();
                c3ForumNls.setID_FORUM(rs.getString(1));
                c3ForumNls.setID_CLASSIF3(rs.getString(2));
                c3ForumNls.setDESCR_CLASSIF3(rs.getString(4));
                c3_forum_nls_repo.save(c3ForumNls);
            }

        }catch(Exception e)
        { System.out.println(e);}
    }


    public List<C3_FORUM_NLS> findAllC3(){
        return c3_forum_nls_repo.findAll();
    }



    public C3_FORUM_NLS updateC3(C3_FORUM_NLS c3_forum_nls){
        return c3_forum_nls_repo.save(c3_forum_nls);
    }

    public void deleteC3(String ID_FORUM){
        c3_forum_nls_repo.deleteById(ID_FORUM);
    }


}

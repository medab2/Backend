package com.translatorv10.services;

import com.translatorv10.domain.C1_FORUM_NLS;
import com.translatorv10.keys.C1_Keys;
import com.translatorv10.repo.C1_FORUM_NLS_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class C1_FORUM_NLS_Service {
    public List<C1_FORUM_NLS> listNew =new ArrayList<>();
    public List<C1_FORUM_NLS> listChanged =new ArrayList<>();
    public List<C1_FORUM_NLS> listDeleted =new ArrayList<>();

    public Map<String,C1_FORUM_NLS> c1ForumNlsList= new HashMap<>();
    public Map<String,C1_FORUM_NLS> c1ForumNlsList2= new HashMap<>();

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

    public void  updatedC1ST(){

        try{
                  Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/translatorv10", "root", "root");
                  Connection con2 = DriverManager.getConnection("jdbc:db2://JUPITER2:50000/TRANS_FR", "db2admin", "db2admin");
                  Statement stmt1 = con1.createStatement();
                  Statement stmt2 = con2.createStatement();
                  ResultSet rs1 = stmt1.executeQuery("select * from translatorv10.C1_FORUM_NLS");
                  ResultSet rs2 = stmt2.executeQuery("select * from EN040005.C1_FORUM_NLS  ");

            while (rs1.next()){

                C1_FORUM_NLS c1ForumNls=new C1_FORUM_NLS();
                c1ForumNls.setID_FORUM(rs1.getString(2));
                c1ForumNls.setID_CLASSIF1(rs1.getString(1));
                c1ForumNls.setDESCR_CLASSIF1(rs1.getString(3));
                c1ForumNls.setTr_DESCR_CLASSIF1(rs1.getString(5));
                c1ForumNls.setSTATUS(rs1.getString(4));
                c1ForumNlsList.put(c1ForumNls.getID_CLASSIF1(),c1ForumNls);

            }

            while (rs2.next()){

                C1_FORUM_NLS c1ForumNls=new C1_FORUM_NLS();
                c1ForumNls.setID_FORUM(rs2.getString(1));
                c1ForumNls.setID_CLASSIF1(rs2.getString(2));
                c1ForumNls.setDESCR_CLASSIF1(rs2.getString(3));
                c1ForumNls.setTr_DESCR_CLASSIF1(rs2.getString(4));
                c1ForumNls.setSTATUS(rs2.getString(5));
                c1ForumNlsList2.put(c1ForumNls.getID_CLASSIF1(),c1ForumNls);

            }

            for (Map.Entry mapentry : c1ForumNlsList.entrySet()) {

                String MapKey =(String)mapentry.getKey();
                if (c1ForumNlsList2.containsKey(MapKey)){

                    C1_FORUM_NLS c1_forum_nls =(C1_FORUM_NLS) mapentry.getValue();
                    String DESC = c1_forum_nls.getDESCR_CLASSIF1();
                    C1_FORUM_NLS c1_forum_nls2 =(C1_FORUM_NLS) c1ForumNlsList2.get(MapKey);
                    String DESC2 = c1_forum_nls2.getDESCR_CLASSIF1();

                    if(DESC!=null && c1_forum_nls2!=null && !DESC.equals(DESC2)) {

                        c1_forum_nls.setSTATUS("C");
                        listChanged.add(c1_forum_nls);

                    }

                }else {

                    C1_FORUM_NLS c1_forum_nls =(C1_FORUM_NLS) mapentry.getValue();
                    c1_forum_nls.setSTATUS("N");
                    listNew.add(c1_forum_nls);

                }
            }
            for (Map.Entry mapentry : c1ForumNlsList2.entrySet()) {

                String MapKey = (String) mapentry.getKey();
                if (!c1ForumNlsList.containsKey(MapKey)) {

                    C1_FORUM_NLS c1_forum_nls = (C1_FORUM_NLS) mapentry.getValue();
                    c1_forum_nls.setSTATUS("D");
                    listDeleted.add(c1_forum_nls);

                }
            }
        }
        catch (SQLException ex) {

            throw new RuntimeException(ex);

        }


        for (C1_FORUM_NLS c1_forum_nls : listNew ) {

            C1_Keys c1_keys = new C1_Keys(c1_forum_nls.getID_FORUM(),c1_forum_nls.getID_CLASSIF1());
            C1_FORUM_NLS c1_forum = c1_forum_nls_repo.getById(c1_keys);
            c1_forum.setSTATUS(c1_forum_nls.getSTATUS());
            c1_forum_nls_repo.save(c1_forum);

        }
        for (C1_FORUM_NLS c1_forum_nls : listChanged ) {

            C1_Keys c1_keys = new C1_Keys(c1_forum_nls.getID_FORUM(),c1_forum_nls.getID_CLASSIF1());
            C1_FORUM_NLS c1_forum = c1_forum_nls_repo.getById(c1_keys);
            c1_forum.setSTATUS(c1_forum_nls.getSTATUS());
            c1_forum_nls_repo.save(c1_forum);

        }

        for (C1_FORUM_NLS c1_forum_nls : listDeleted ) {

            C1_FORUM_NLS c1ForumNls =new C1_FORUM_NLS();
            c1ForumNls.setID_FORUM(c1_forum_nls.getID_FORUM());
            c1ForumNls.setID_CLASSIF1(c1_forum_nls.getID_CLASSIF1());
            c1ForumNls.setTr_DESCR_CLASSIF1(c1_forum_nls.getTr_DESCR_CLASSIF1());
            c1ForumNls.setDESCR_CLASSIF1(c1_forum_nls.getDESCR_CLASSIF1());
            c1ForumNls.setSTATUS(c1_forum_nls.getSTATUS());
            c1_forum_nls_repo.save(c1ForumNls);

        }
    }
}



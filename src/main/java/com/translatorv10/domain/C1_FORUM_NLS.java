package com.translatorv10.domain;


import com.translatorv10.controller.Controller;
import com.translatorv10.keys.C1_Keys;

import javax.persistence.*;

@Entity
@Table(name = "C1_FORUM_NLS")
@IdClass(C1_Keys.class)
public class C1_FORUM_NLS {
    @Id
    @Column(columnDefinition = "CHARACTER(20)")
    private String ID_FORUM;
    @Id
    @Column(columnDefinition = "CHARACTER(20)")
    private String ID_CLASSIF1;

    @Column(columnDefinition = "CHARACTER(50)")
    private String DESCR_CLASSIF1;

    @Column(columnDefinition = "CHARACTER(50)")
    private String tr_DESCR_CLASSIF1;

    @Column(columnDefinition = "CHARACTER(1)")
    private String STATUS ="U";

    public C1_FORUM_NLS() {
    }

    public C1_FORUM_NLS(String ID_FORUM, String ID_CLASSIF1, String DESCR_CLASSIF1, String tr_DESCR_CLASSIF1, String STATUS) {
        this.ID_FORUM = ID_FORUM;
        this.ID_CLASSIF1 = ID_CLASSIF1;
        this.DESCR_CLASSIF1 = DESCR_CLASSIF1;
        this.tr_DESCR_CLASSIF1 = tr_DESCR_CLASSIF1;
        this.STATUS = STATUS;
    }

    public String getTr_DESCR_CLASSIF1() {
        return tr_DESCR_CLASSIF1;
    }

    public void setTr_DESCR_CLASSIF1(String tr_DESCR_CLASSIF1) {
        this.tr_DESCR_CLASSIF1 = tr_DESCR_CLASSIF1;
    }

    public String getID_FORUM() {

        return ID_FORUM;
    }

    public void setID_FORUM(String ID_FORUM) {

        this.ID_FORUM = ID_FORUM;
    }

    public String getID_CLASSIF1() {

        return ID_CLASSIF1;
    }

    public void setID_CLASSIF1(String ID_CLASSIF1) {

        this.ID_CLASSIF1 = ID_CLASSIF1;
    }

    public String getDESCR_CLASSIF1() {
        return DESCR_CLASSIF1;
    }

    public void setDESCR_CLASSIF1(String DESCR_CLASSIF1) {

        this.DESCR_CLASSIF1 = DESCR_CLASSIF1;
    }

    public String getSTATUS() {

        return STATUS;
    }

    public void setSTATUS(String STATUS) {

        this.STATUS = STATUS;
    }

    @Override
    public String toString() {
        return "C1_FORUM_NLS{ ID_FORUM='" + ID_FORUM+",ID_CLASSIF1='" + ID_CLASSIF1 + ",DESCR_CLASSIF1='" + DESCR_CLASSIF1 + ",tr_DESCR_CLASSIF1='" + tr_DESCR_CLASSIF1 +",STATUS='"+ STATUS +'}';
    }
}

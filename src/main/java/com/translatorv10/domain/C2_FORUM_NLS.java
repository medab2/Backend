package com.translatorv10.domain;

import com.translatorv10.keys.C2_Keys;

import javax.persistence.*;

@Entity
@Table(name ="C2_FORUM_NLS " ,schema = "translatorv10")
@IdClass(C2_Keys.class)
public class C2_FORUM_NLS {

    @Id
    @Column(columnDefinition = "CHARACTER(20)")
    private String ID_FORUM;
    @Id
    @Column(columnDefinition = "CHARACTER(20)")
    private String ID_CLASSIF2;

    @Column(columnDefinition = "CHARACTER(50)")
    private String DESCR_CLASSIF2 ;

    @Column(columnDefinition = "CHARACTER(50)")
    private String tr_DESCR_CLASSIF2;

    @Column(columnDefinition = "CHARACTER(1)")
    private String STATUS ="U";

    public C2_FORUM_NLS() {
    }

    public C2_FORUM_NLS(String ID_FORUM, String ID_CLASSIF2, String DESCR_CLASSIF2, String tr_DESCR_CLASSIF2, String STATUS) {
        this.ID_FORUM = ID_FORUM;
        this.ID_CLASSIF2 = ID_CLASSIF2;
        this.DESCR_CLASSIF2 = DESCR_CLASSIF2;
        this.tr_DESCR_CLASSIF2 = tr_DESCR_CLASSIF2;
        this.STATUS = STATUS;
    }

    public String getID_FORUM() {
        return ID_FORUM;
    }

    public void setID_FORUM(String ID_FORUM) {
        this.ID_FORUM = ID_FORUM;
    }

    public String getID_CLASSIF2() {
        return ID_CLASSIF2;
    }

    public void setID_CLASSIF2(String ID_CLASSIF2) {
        this.ID_CLASSIF2 = ID_CLASSIF2;
    }

    public String getDESCR_CLASSIF2() {
        return DESCR_CLASSIF2;
    }

    public void setDESCR_CLASSIF2(String DESCR_CLASSIF2) {
        this.DESCR_CLASSIF2 = DESCR_CLASSIF2;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getTr_DESCR_CLASSIF2() {
        return tr_DESCR_CLASSIF2;
    }

    public void setTr_DESCR_CLASSIF2(String tr_DESCR_CLASSIF2) {
        this.tr_DESCR_CLASSIF2 = tr_DESCR_CLASSIF2;
    }
}

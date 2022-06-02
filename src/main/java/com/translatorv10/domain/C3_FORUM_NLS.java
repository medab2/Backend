package com.translatorv10.domain;

import com.translatorv10.keys.C3_Keys;

import javax.persistence.*;

@Entity
@Table(name = "C3_FORUM_NLS")
@IdClass(C3_Keys.class)
public class C3_FORUM_NLS {

    @Id
    @Column(columnDefinition = "CHARACTER(20)")
    private String ID_FORUM ;
    @Id
    @Column(columnDefinition = "CHARACTER(20)")
    private String ID_CLASSIF3;

    @Column(columnDefinition = "CHARACTER(50)")
    private String DESCR_CLASSIF3 ;

    @Column(columnDefinition = "CHARACTER(50)")
    private String tr_DESCR_CLASSIF3 ;

    @Column(columnDefinition = "CHARACTER(1)")
    private String STATUS ="U";


    public C3_FORUM_NLS() {
    }

    public C3_FORUM_NLS(String DESCR_CLASSIF3, String STATUS) {

        this.DESCR_CLASSIF3 = DESCR_CLASSIF3;
        this.STATUS = STATUS;
    }

    public String getID_FORUM() {
        return ID_FORUM;
    }

    public void setID_FORUM(String ID_FORUM) {
        this.ID_FORUM = ID_FORUM;
    }

    public String getID_CLASSIF3() {
        return ID_CLASSIF3;
    }

    public void setID_CLASSIF3(String ID_CLASSIF3) {
        this.ID_CLASSIF3 = ID_CLASSIF3;
    }

    public String getDESCR_CLASSIF3() {
        return DESCR_CLASSIF3;
    }

    public void setDESCR_CLASSIF3(String DESCR_CLASSIF3) {
        this.DESCR_CLASSIF3 = DESCR_CLASSIF3;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

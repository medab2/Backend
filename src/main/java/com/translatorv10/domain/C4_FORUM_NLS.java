package com.translatorv10.domain;

import com.translatorv10.keys.C4_Keys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = " C4_FORUM_NLS")
@IdClass(C4_Keys.class)
public class C4_FORUM_NLS {
    @Id
    private String ID_FORUM;
    @Id
    private String ID_CLASSIF3;
    @Id
    private String ID_CLASSIF4;

    private String DESCR_CLASSIF4 ;

    private String STATUS ="U";

    public C4_FORUM_NLS() {
    }

    public C4_FORUM_NLS(String DESCR_CLASSIF4, String STATUS) {
        this.DESCR_CLASSIF4 = DESCR_CLASSIF4;
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

    public String getID_CLASSIF4() {
        return ID_CLASSIF4;
    }

    public void setID_CLASSIF4(String ID_CLASSIF4) {
        this.ID_CLASSIF4 = ID_CLASSIF4;
    }

    public String getDESCR_CLASSIF4() {
        return DESCR_CLASSIF4;
    }

    public void setDESCR_CLASSIF4(String DESCR_CLASSIF4) {
        this.DESCR_CLASSIF4 = DESCR_CLASSIF4;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

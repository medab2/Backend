package com.translatorv10.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FORUM_NLS")
public class FORUM_NLS {
    @Id
    private String ID_FORUM;
    private String DESCR_CLASSIF1;
    private String DESCR_CLASSIF2;
    private String DESCR_CLASSIF4;
    private String  DESCR_FLAG1;
    private String DESCR_FLAG2;
    private String DESCR_FLAG3;
    private String STATUS ="U";

    public FORUM_NLS() {
    }

    public FORUM_NLS(String DESCR_CLASSIF1, String DESCR_CLASSIF2, String DESCR_CLASSIF4, String DESCR_FLAG1, String DESCR_FLAG2, String DESCR_FLAG3, String STATUS) {
        this.DESCR_CLASSIF1 = DESCR_CLASSIF1;
        this.DESCR_CLASSIF2 = DESCR_CLASSIF2;
        this.DESCR_CLASSIF4 = DESCR_CLASSIF4;
        this.DESCR_FLAG1 = DESCR_FLAG1;
        this.DESCR_FLAG2 = DESCR_FLAG2;
        this.DESCR_FLAG3 = DESCR_FLAG3;
        this.STATUS = STATUS;
    }

    public String getID_FORUM() {
        return ID_FORUM;
    }

    public void setID_FORUM(String ID_FORUM) {
        this.ID_FORUM = ID_FORUM;
    }

    public String getDESCR_CLASSIF1() {
        return DESCR_CLASSIF1;
    }

    public void setDESCR_CLASSIF1(String DESCR_CLASSIF1) {
        this.DESCR_CLASSIF1 = DESCR_CLASSIF1;
    }

    public String getDESCR_CLASSIF2() {
        return DESCR_CLASSIF2;
    }

    public void setDESCR_CLASSIF2(String DESCR_CLASSIF2) {
        this.DESCR_CLASSIF2 = DESCR_CLASSIF2;
    }

    public String getDESCR_CLASSIF4() {
        return DESCR_CLASSIF4;
    }

    public void setDESCR_CLASSIF4(String DESCR_CLASSIF4) {
        this.DESCR_CLASSIF4 = DESCR_CLASSIF4;
    }

    public String getDESCR_FLAG1() {
        return DESCR_FLAG1;
    }

    public void setDESCR_FLAG1(String DESCR_FLAG1) {
        this.DESCR_FLAG1 = DESCR_FLAG1;
    }

    public String getDESCR_FLAG2() {
        return DESCR_FLAG2;
    }

    public void setDESCR_FLAG2(String DESCR_FLAG2) {
        this.DESCR_FLAG2 = DESCR_FLAG2;
    }

    public String getDESCR_FLAG3() {
        return DESCR_FLAG3;
    }

    public void setDESCR_FLAG3(String DESCR_FLAG3) {
        this.DESCR_FLAG3 = DESCR_FLAG3;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

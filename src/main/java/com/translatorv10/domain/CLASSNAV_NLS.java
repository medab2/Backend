package com.translatorv10.domain;

import com.translatorv10.keys.Nav_Keys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "CLASSNAV_NLS")
 @IdClass(Nav_Keys.class)
public class CLASSNAV_NLS {
    @Id
    private String CLASS_NAME;
    @Id
    private String NAV_NAME;
    private String DESCRIPTION;
    private String LONG_DESCR;
    private String STATUS ="U";

    public CLASSNAV_NLS() {
    }

    public CLASSNAV_NLS(String DESCRIPTION, String LONG_DESCR,String STATUS) {
        this.DESCRIPTION = DESCRIPTION;
        this.LONG_DESCR = LONG_DESCR;
        this.STATUS = STATUS;
    }

    public String getCLASS_NAME() {
        return CLASS_NAME;
    }

    public void setCLASS_NAME(String CLASS_NAME) {
        this.CLASS_NAME = CLASS_NAME;
    }

    public String getNAV_NAME() {
        return NAV_NAME;
    }

    public void setNAV_NAME(String NAV_NAME) {
        this.NAV_NAME = NAV_NAME;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getLONG_DESCR() {
        return LONG_DESCR;
    }

    public void setLONG_DESCR(String LONG_DESCR) {
        this.LONG_DESCR = LONG_DESCR;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

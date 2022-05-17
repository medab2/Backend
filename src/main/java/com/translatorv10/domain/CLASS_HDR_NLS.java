package com.translatorv10.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLASS_HDR_NLS")
public class CLASS_HDR_NLS {

    @Id
    private String CLASS_NAME;
    private String NLS_CLASS_NAME;
    private String NLS_PL_CLASS_NAME;
    private String STATUS ="U";

    public CLASS_HDR_NLS() {
    }

    public CLASS_HDR_NLS(String CLASS_NAME, String NLS_CLASS_NAME, String NLS_PL_CLASS_NAME, String STATUS) {
        this.CLASS_NAME = CLASS_NAME;
        this.NLS_CLASS_NAME = NLS_CLASS_NAME;
        this.NLS_PL_CLASS_NAME = NLS_PL_CLASS_NAME;
        this.STATUS = STATUS;
    }

    public String getCLASS_NAME() {
        return CLASS_NAME;
    }

    public void setCLASS_NAME(String CLASS_NAME) {
        this.CLASS_NAME = CLASS_NAME;
    }

    public String getNLS_CLASS_NAME() {
        return NLS_CLASS_NAME;
    }

    public void setNLS_CLASS_NAME(String NLS_CLASS_NAME) {
        this.NLS_CLASS_NAME = NLS_CLASS_NAME;
    }

    public String getNLS_PL_CLASS_NAME() {
        return NLS_PL_CLASS_NAME;
    }

    public void setNLS_PL_CLASS_NAME(String NLS_PL_CLASS_NAME) {
        this.NLS_PL_CLASS_NAME = NLS_PL_CLASS_NAME;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

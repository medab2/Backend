package com.translatorv10.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RESOURCES_NLS")
public class RESOURCES_NLS {
    @Id
    private String RS_NR;
    private String TEXT;
    private String STATUS ="U";

    public RESOURCES_NLS() {
    }

    public RESOURCES_NLS(String RS_NR, String TEXT, String STATUS) {
        this.RS_NR = RS_NR;
        this.TEXT = TEXT;
        this.STATUS = STATUS;
    }

    public String getRS_NR() {
        return RS_NR;
    }

    public void setRS_NR(String RS_NR) {
        this.RS_NR = RS_NR;
    }

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

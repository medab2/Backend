package com.translatorv10.domain;


import com.translatorv10.keys.Ad_Keys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = " CLASSAD_NLS")
@IdClass(Ad_Keys.class )
public class CLASSAD_NLS {
    @Id
    private String CLASS_NAME;
    @Id
    private String ATTRIBUTE_NAME;
    private String NLS_ATTRIBUTE_NAME;
    private String  NLS_COLUMN_TITLE;
    private String NLS_LABEL;
    private String STATUS ="U";

    public CLASSAD_NLS() {
    }

    public CLASSAD_NLS(String NLS_ATTRIBUTE_NAME, String NLS_COLUMN_TITLE, String NLS_LABEL, String STATUS) {
        this.NLS_ATTRIBUTE_NAME = NLS_ATTRIBUTE_NAME;
        this.NLS_COLUMN_TITLE = NLS_COLUMN_TITLE;
        this.NLS_LABEL = NLS_LABEL;
        this.STATUS = STATUS;
    }

    public String getCLASS_NAME() {
        return CLASS_NAME;
    }

    public void setCLASS_NAME(String CLASS_NAME) {
        this.CLASS_NAME = CLASS_NAME;
    }

    public String getATTRIBUTE_NAME() {
        return ATTRIBUTE_NAME;
    }

    public void setATTRIBUTE_NAME(String ATTRIBUTE_NAME) {
        this.ATTRIBUTE_NAME = ATTRIBUTE_NAME;
    }

    public String getNLS_ATTRIBUTE_NAME() {
        return NLS_ATTRIBUTE_NAME;
    }

    public void setNLS_ATTRIBUTE_NAME(String NLS_ATTRIBUTE_NAME) {
        this.NLS_ATTRIBUTE_NAME = NLS_ATTRIBUTE_NAME;
    }

    public String getNLS_COLUMN_TITLE() {
        return NLS_COLUMN_TITLE;
    }

    public void setNLS_COLUMN_TITLE(String NLS_COLUMN_TITLE) {
        this.NLS_COLUMN_TITLE = NLS_COLUMN_TITLE;
    }

    public String getNLS_LABEL() {
        return NLS_LABEL;
    }

    public void setNLS_LABEL(String NLS_LABEL) {
        this.NLS_LABEL = NLS_LABEL;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

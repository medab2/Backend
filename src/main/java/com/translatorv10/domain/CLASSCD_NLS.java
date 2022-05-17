package com.translatorv10.domain;

import com.translatorv10.keys.CD_Keys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "CLASSCD_NLS")
@IdClass(CD_Keys.class)
public class CLASSCD_NLS {
    @Id
    private String CLASS_NAME;
    @Id
    private String COMPONENT_NAME;
    @Id
    private String NLS_COMPONENT_NAME;
    private String NLS_COLUMN_TITLE;
    private String NLS_LABEL ;
    private String STATUS ="U";


    public CLASSCD_NLS() {
    }

    public CLASSCD_NLS(String NLS_COMPONENT_NAME, String NLS_COLUMN_TITLE, String NLS_LABEL, String STATUS) {
        this.NLS_COMPONENT_NAME = NLS_COMPONENT_NAME;
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

    public String getCOMPONENT_NAME() {
        return COMPONENT_NAME;
    }

    public void setCOMPONENT_NAME(String COMPONENT_NAME) {
        this.COMPONENT_NAME = COMPONENT_NAME;
    }

    public String getNLS_COMPONENT_NAME() {
        return NLS_COMPONENT_NAME;
    }

    public void setNLS_COMPONENT_NAME(String NLS_COMPONENT_NAME) {
        this.NLS_COMPONENT_NAME = NLS_COMPONENT_NAME;
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

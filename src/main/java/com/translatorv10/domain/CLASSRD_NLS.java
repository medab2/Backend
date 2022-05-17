package com.translatorv10.domain;

import com.translatorv10.keys.Rd_Keys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "CLASSRD_NLS")
@IdClass(Rd_Keys.class)
public class CLASSRD_NLS {
    @Id
    private String CLASS_NAME;
    @Id
    private String RELATION_NAME;
    private String NLS_RELATION_NAME;
    private String NLS_COLUMN_TITLE;
    private String NLS_LABEL;
    private String STATUS ="U";
    public CLASSRD_NLS() {
    }

    public CLASSRD_NLS(String NLS_RELATION_NAME, String NLS_COLUMN_TITLE, String NLS_LABEL, String STATUS) {
        this.NLS_RELATION_NAME = NLS_RELATION_NAME;
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

    public String getRELATION_NAME() {
        return RELATION_NAME;
    }

    public void setRELATION_NAME(String RELATION_NAME) {
        this.RELATION_NAME = RELATION_NAME;
    }

    public String getNLS_RELATION_NAME() {
        return NLS_RELATION_NAME;
    }

    public void setNLS_RELATION_NAME(String NLS_RELATION_NAME) {
        this.NLS_RELATION_NAME = NLS_RELATION_NAME;
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

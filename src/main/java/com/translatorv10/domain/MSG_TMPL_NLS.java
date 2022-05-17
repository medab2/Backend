package com.translatorv10.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MSG_TMPL_NLS")
public class MSG_TMPL_NLS {
    @Id
    private String MSG_TMPL_ID;
    private String NLS_SUBJECT;
    private String NLS_TEXT;
    private String STATUS ="U";

    public MSG_TMPL_NLS() {
    }

    public MSG_TMPL_NLS(String MSG_TMPL_ID, String NLS_SUBJECT, String NLS_TEXT, String STATUS) {
        this.MSG_TMPL_ID = MSG_TMPL_ID;
        this.NLS_SUBJECT = NLS_SUBJECT;
        this.NLS_TEXT = NLS_TEXT;
        this.STATUS = STATUS;
    }

    public String getMSG_TMPL_ID() {
        return MSG_TMPL_ID;
    }

    public void setMSG_TMPL_ID(String MSG_TMPL_ID) {
        this.MSG_TMPL_ID = MSG_TMPL_ID;
    }

    public String getNLS_SUBJECT() {
        return NLS_SUBJECT;
    }

    public void setNLS_SUBJECT(String NLS_SUBJECT) {
        this.NLS_SUBJECT = NLS_SUBJECT;
    }

    public String getNLS_TEXT() {
        return NLS_TEXT;
    }

    public void setNLS_TEXT(String NLS_TEXT) {
        this.NLS_TEXT = NLS_TEXT;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

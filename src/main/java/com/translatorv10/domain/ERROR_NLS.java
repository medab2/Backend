package com.translatorv10.domain;

import javax.persistence.*;

@Entity
@Table(name = "ERROR_NLS")
public class ERROR_NLS {
    @Id
    private String ERROR_ID;
    private String TEXT;
    @Column(name = "LONG_TEXT", columnDefinition="VARCHAR(400)")
    private String LONG_TEXT;

    private String tr_TEXT;

    @Column(name = "tr_LONG_TEXT", columnDefinition="VARCHAR(400)")
        private String tr_LONG_TEXT;

    private String STATUS ="U";

    public ERROR_NLS() {
    }

    public ERROR_NLS(String ERROR_ID, String TEXT, String LONG_TEXT, String tr_TEXT, String tr_LONG_TEXT, String STATUS) {
        this.ERROR_ID = ERROR_ID;
        this.TEXT = TEXT;
        this.LONG_TEXT = LONG_TEXT;
        this.tr_TEXT = tr_TEXT;
        this.tr_LONG_TEXT = tr_LONG_TEXT;
        this.STATUS = STATUS;
    }

    public void setERROR_ID(String ERROR_ID) {
        this.ERROR_ID = ERROR_ID;
    }

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }

    public String getLONG_TEXT() {
        return LONG_TEXT;
    }

    public void setLONG_TEXT(String LONG_TEXT) {
        this.LONG_TEXT = LONG_TEXT;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getERROR_ID() {
        return ERROR_ID;
    }

    public String getTr_TEXT() {
        return tr_TEXT;
    }

    public void setTr_TEXT(String tr_TEXT) {
        this.tr_TEXT = tr_TEXT;
    }

    public String getTr_LONG_TEXT() {
        return tr_LONG_TEXT;
    }

    public void setTr_LONG_TEXT(String tr_LONG_TEXT) {
        this.tr_LONG_TEXT = tr_LONG_TEXT;
    }

    @Override
    public String toString() {
        return "ERROR_NLS{ERROR_ID='" + ERROR_ID +", EXT='" + TEXT + ", LONG_TEXT='" + LONG_TEXT +", tr_TEXT='" + tr_TEXT +", tr_LONG_TEXT='" + tr_LONG_TEXT +", STATUS='" + STATUS + '}';
    }
}

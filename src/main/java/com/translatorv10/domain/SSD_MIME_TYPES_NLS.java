package com.translatorv10.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SSD_MIME_TYPES_NLS")
public class SSD_MIME_TYPES_NLS {
    @Id
    private String MIME_TYPE_ID;
    private String DESCRIPTION_NLS;
    private String STATUS ="U";

    public SSD_MIME_TYPES_NLS() {
    }

    public SSD_MIME_TYPES_NLS(String MIME_TYPE_ID, String DESCRIPTION_NLS, String STATUS) {
        this.MIME_TYPE_ID = MIME_TYPE_ID;
        this.DESCRIPTION_NLS = DESCRIPTION_NLS;
        this.STATUS = STATUS;
    }

    public String getMIME_TYPE_ID() {
        return MIME_TYPE_ID;
    }

    public void setMIME_TYPE_ID(String MIME_TYPE_ID) {
        this.MIME_TYPE_ID = MIME_TYPE_ID;
    }

    public String getDESCRIPTION_NLS() {
        return DESCRIPTION_NLS;
    }

    public void setDESCRIPTION_NLS(String DESCRIPTION_NLS) {
        this.DESCRIPTION_NLS = DESCRIPTION_NLS;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

package com.translatorv10.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DOWNLOAD_TYPE_NLS")
public class DOWNLOAD_TYPE_NLS {
    @Id
    private String DL_TYPE_ID;
    private String DESCRIPTION;
    private String STATUS ="U";

    public DOWNLOAD_TYPE_NLS() {
    }

    public DOWNLOAD_TYPE_NLS(String DESCRIPTION, String STATUS) {
        this.DESCRIPTION = DESCRIPTION;
        this.STATUS = STATUS;
    }

    public String getDL_TYPE_ID() {
        return DL_TYPE_ID;
    }

    public void setDL_TYPE_ID(String DL_TYPE_ID) {
        this.DL_TYPE_ID = DL_TYPE_ID;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

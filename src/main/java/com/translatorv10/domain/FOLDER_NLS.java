package com.translatorv10.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FOLDER_NLS")
public class FOLDER_NLS {
    @Id
    private String FOLDER_ID;
    private String FOLDER_NAME;
    private String STATUS ="U";

    public FOLDER_NLS() {
    }

    public FOLDER_NLS(String FOLDER_NAME, String STATUS) {
        this.FOLDER_NAME = FOLDER_NAME;
        this.STATUS = STATUS;
    }

    public String getFOLDER_ID() {
        return FOLDER_ID;
    }

    public void setFOLDER_ID(String FOLDER_ID) {
        this.FOLDER_ID = FOLDER_ID;
    }

    public String getFOLDER_NAME() {
        return FOLDER_NAME;
    }

    public void setFOLDER_NAME(String FOLDER_NAME) {
        this.FOLDER_NAME = FOLDER_NAME;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

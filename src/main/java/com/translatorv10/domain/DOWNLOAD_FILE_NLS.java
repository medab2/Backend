package com.translatorv10.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DOWNLOAD_FILE_NLS")
public class DOWNLOAD_FILE_NLS {
    @Id
    private String DL_FILE_ID;
    private String CLASSIF_01;
    private String CLASSIF_02;
    private String DESCRIPTION;
    private String STATUS ="U";

    public DOWNLOAD_FILE_NLS() {
    }

    public DOWNLOAD_FILE_NLS(String CLASSIF_01, String CLASSIF_02, String DESCRIPTION, String STATUS) {
        this.CLASSIF_01 = CLASSIF_01;
        this.CLASSIF_02 = CLASSIF_02;
        this.DESCRIPTION = DESCRIPTION;
        this.STATUS = STATUS;
    }

    public String getDL_FILE_ID() {
        return DL_FILE_ID;
    }

    public void setDL_FILE_ID(String DL_FILE_ID) {
        this.DL_FILE_ID = DL_FILE_ID;
    }

    public String getCLASSIF_01() {
        return CLASSIF_01;
    }

    public void setCLASSIF_01(String CLASSIF_01) {
        this.CLASSIF_01 = CLASSIF_01;
    }

    public String getCLASSIF_02() {
        return CLASSIF_02;
    }

    public void setCLASSIF_02(String CLASSIF_02) {
        this.CLASSIF_02 = CLASSIF_02;
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

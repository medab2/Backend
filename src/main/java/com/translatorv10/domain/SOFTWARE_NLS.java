package com.translatorv10.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SOFTWARE_NLS")
public class SOFTWARE_NLS {
    @Id
    private String SOFTWARE_ID;
    private String DESCRIPTION;
    private String STATUS ="U";

    public SOFTWARE_NLS() {
    }

    public SOFTWARE_NLS(String SOFTWARE_ID, String DESCRIPTION, String STATUS) {
        this.SOFTWARE_ID = SOFTWARE_ID;
        this.DESCRIPTION = DESCRIPTION;
        this.STATUS = STATUS;
    }

    public String getSOFTWARE_ID() {
        return SOFTWARE_ID;
    }

    public void setSOFTWARE_ID(String SOFTWARE_ID) {
        this.SOFTWARE_ID = SOFTWARE_ID;
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

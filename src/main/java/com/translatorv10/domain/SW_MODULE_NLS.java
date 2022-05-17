package com.translatorv10.domain;

import com.translatorv10.keys.Sw_Keys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "SW_MODULE_NLS")
@IdClass(Sw_Keys.class)
public class SW_MODULE_NLS {
    @Id
    private String SOFTWARE_ID;
    @Id
    private String MODULE_ID;
    private String DESCRIPTION;
    private String STATUS ="U";

    public SW_MODULE_NLS() {
    }

    public SW_MODULE_NLS(String SOFTWARE_ID, String MODULE_ID, String DESCRIPTION, String STATUS) {
        this.SOFTWARE_ID = SOFTWARE_ID;
        this.MODULE_ID = MODULE_ID;
        this.DESCRIPTION = DESCRIPTION;
        this.STATUS = STATUS;
    }

    public String getSOFTWARE_ID() {
        return SOFTWARE_ID;
    }

    public void setSOFTWARE_ID(String SOFTWARE_ID) {
        this.SOFTWARE_ID = SOFTWARE_ID;
    }

    public String getMODULE_ID() {
        return MODULE_ID;
    }

    public void setMODULE_ID(String MODULE_ID) {
        this.MODULE_ID = MODULE_ID;
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

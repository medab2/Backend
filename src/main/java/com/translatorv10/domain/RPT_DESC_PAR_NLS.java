package com.translatorv10.domain;

import com.translatorv10.keys.RptPar_Keys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "RPT_DESC_PAR_NLS")
@IdClass(RptPar_Keys.class)
public class RPT_DESC_PAR_NLS {
    @Id
    private String RPT_DESC_ID;
    @Id
    private String RPT_PARAM_ID;
    private String LABEL;
    private String STATUS ="U";

    public RPT_DESC_PAR_NLS() {
    }

    public RPT_DESC_PAR_NLS(String RPT_DESC_ID, String RPT_PARAM_ID, String LABEL, String STATUS) {
        this.RPT_DESC_ID = RPT_DESC_ID;
        this.RPT_PARAM_ID = RPT_PARAM_ID;
        this.LABEL = LABEL;
        this.STATUS = STATUS;
    }

    public String getRPT_DESC_ID() {
        return RPT_DESC_ID;
    }

    public void setRPT_DESC_ID(String RPT_DESC_ID) {
        this.RPT_DESC_ID = RPT_DESC_ID;
    }

    public String getRPT_PARAM_ID() {
        return RPT_PARAM_ID;
    }

    public void setRPT_PARAM_ID(String RPT_PARAM_ID) {
        this.RPT_PARAM_ID = RPT_PARAM_ID;
    }

    public String getLABEL() {
        return LABEL;
    }

    public void setLABEL(String LABEL) {
        this.LABEL = LABEL;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

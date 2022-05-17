package com.translatorv10.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RPT_DESC_NLS")
public class RPT_DESC_NLS {
    @Id
    private String RPT_DESC_ID;
    private String DESCRIPTION;
    private String STATUS ="U";

    public RPT_DESC_NLS() {
    }

    public RPT_DESC_NLS(String RPT_DESC_ID, String DESCRIPTION, String STATUS) {
        this.RPT_DESC_ID = RPT_DESC_ID;
        this.DESCRIPTION = DESCRIPTION;
        this.STATUS = STATUS;
    }

    public String getRPT_DESC_ID() {
        return RPT_DESC_ID;
    }

    public void setRPT_DESC_ID(String RPT_DESC_ID) {
        this.RPT_DESC_ID = RPT_DESC_ID;
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

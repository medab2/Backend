package com.translatorv10.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FLOW_HDR_NLS")
public class FLOW_HDR_NLS {
    @Id
    private String FLOW_NAME;
    private String NLS_FLOW_NAME;
    private String STATUS ="U";

    public FLOW_HDR_NLS() {
    }

    public FLOW_HDR_NLS(String NLS_FLOW_NAME, String STATUS) {
        this.NLS_FLOW_NAME = NLS_FLOW_NAME;
        this.STATUS = STATUS;
    }

    public String getFLOW_NAME() {
        return FLOW_NAME;
    }

    public void setFLOW_NAME(String FLOW_NAME) {
        this.FLOW_NAME = FLOW_NAME;
    }

    public String getNLS_FLOW_NAME() {
        return NLS_FLOW_NAME;
    }

    public void setNLS_FLOW_NAME(String NLS_FLOW_NAME) {
        this.NLS_FLOW_NAME = NLS_FLOW_NAME;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

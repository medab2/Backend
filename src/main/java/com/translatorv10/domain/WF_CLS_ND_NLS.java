package com.translatorv10.domain;

import com.translatorv10.keys.WfClsNd_Keys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "WF_CLS_ND_NLS")
@IdClass(WfClsNd_Keys.class)
public class WF_CLS_ND_NLS {
    @Id
    private String WF_CLASS_ID;
    @Id
    private String NODE_ID;
    private String DESCRIPTION;
    private String STATUS ="U";

    public WF_CLS_ND_NLS() {
    }

    public WF_CLS_ND_NLS(String WF_CLASS_ID, String NODE_ID, String DESCRIPTION, String STATUS) {
        this.WF_CLASS_ID = WF_CLASS_ID;
        this.NODE_ID = NODE_ID;
        this.DESCRIPTION = DESCRIPTION;
        this.STATUS = STATUS;
    }

    public String getWF_CLASS_ID() {
        return WF_CLASS_ID;
    }

    public void setWF_CLASS_ID(String WF_CLASS_ID) {
        this.WF_CLASS_ID = WF_CLASS_ID;
    }

    public String getNODE_ID() {
        return NODE_ID;
    }

    public void setNODE_ID(String NODE_ID) {
        this.NODE_ID = NODE_ID;
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

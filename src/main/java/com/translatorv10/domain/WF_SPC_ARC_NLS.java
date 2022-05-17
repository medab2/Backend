package com.translatorv10.domain;

import com.translatorv10.keys.WfArc_Keys;
import com.translatorv10.keys.WfSpcArc_Keys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "WF_SPC_ARC_NLS")
@IdClass(WfSpcArc_Keys.class)
public class WF_SPC_ARC_NLS {
    @Id
    private String WF_CLASS_ID;
@Id
    private String WF_ID;
@Id
    private String WF_ARC_ID;
    private String DESCRIPTION;
    private String LONG_DESCR;
    private String STATUS ="U";

    public WF_SPC_ARC_NLS() {
    }

    public WF_SPC_ARC_NLS(String WF_CLASS_ID, String WF_ID, String WF_ARC_ID, String DESCRIPTION, String LONG_DESCR, String STATUS) {
        this.WF_CLASS_ID = WF_CLASS_ID;
        this.WF_ID = WF_ID;
        this.WF_ARC_ID = WF_ARC_ID;
        this.DESCRIPTION = DESCRIPTION;
        this.LONG_DESCR = LONG_DESCR;
        this.STATUS = STATUS;
    }

    public String getWF_CLASS_ID() {
        return WF_CLASS_ID;
    }

    public void setWF_CLASS_ID(String WF_CLASS_ID) {
        this.WF_CLASS_ID = WF_CLASS_ID;
    }

    public String getWF_ID() {
        return WF_ID;
    }

    public void setWF_ID(String WF_ID) {
        this.WF_ID = WF_ID;
    }

    public String getWF_ARC_ID() {
        return WF_ARC_ID;
    }

    public void setWF_ARC_ID(String WF_ARC_ID) {
        this.WF_ARC_ID = WF_ARC_ID;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getLONG_DESCR() {
        return LONG_DESCR;
    }

    public void setLONG_DESCR(String LONG_DESCR) {
        this.LONG_DESCR = LONG_DESCR;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

package com.translatorv10.domain;

import com.translatorv10.keys.WfArc_Keys;

import javax.persistence.*;

@Entity
@Table(name = "WF_ARC_ACT_NLS")
@IdClass(WfArc_Keys.class)
public class WF_ARC_ACT_NLS {

    @Id
    @Column(columnDefinition="VARCHAR(2)")
    private String WF_CLASS_ID;
    @Id
    @Column(columnDefinition="VARCHAR(10)")
    private String WF_ID;
    @Id
    @Column(columnDefinition="VARCHAR(10)")
    private String WF_ARC_ID;

    @Id
    @Column(columnDefinition="VARCHAR(2)")
    private String WF_ACTION_SEQ;
    private String DESCRIPTION;
    private String STATUS ="U";

    public WF_ARC_ACT_NLS() {
    }

    public WF_ARC_ACT_NLS(String WF_CLASS_ID, String WF_ID, String WF_ARC_ID, String WF_ACTION_SEQ, String DESCRIPTION, String STATUS) {
        this.WF_CLASS_ID = WF_CLASS_ID;
        this.WF_ID = WF_ID;
        this.WF_ARC_ID = WF_ARC_ID;
        this.WF_ACTION_SEQ = WF_ACTION_SEQ;
        this.DESCRIPTION = DESCRIPTION;
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

    public String getWF_ACTION_SEQ() {
        return WF_ACTION_SEQ;
    }

    public void setWF_ACTION_SEQ(String WF_ACTION_SEQ) {
        this.WF_ACTION_SEQ = WF_ACTION_SEQ;
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

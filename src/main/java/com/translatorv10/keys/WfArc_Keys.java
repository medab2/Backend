package com.translatorv10.keys;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class WfArc_Keys implements Serializable {
    private String WF_CLASS_ID;
    private String WF_ID;
    private String WF_ARC_ID;
    private String WF_ACTION_SEQ;

    public WfArc_Keys(String WF_CLASS_ID, String WF_ID, String WF_ARC_ID, String WF_ACTION_SEQ) {
        this.WF_CLASS_ID = WF_CLASS_ID;
        this.WF_ID = WF_ID;
        this.WF_ARC_ID = WF_ARC_ID;
        this.WF_ACTION_SEQ = WF_ACTION_SEQ;
    }

    public WfArc_Keys() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WfArc_Keys that = (WfArc_Keys) o;
        return WF_CLASS_ID.equals(that.WF_CLASS_ID) && WF_ID.equals(that.WF_ID) && WF_ARC_ID.equals(that.WF_ARC_ID) && WF_ACTION_SEQ.equals(that.WF_ACTION_SEQ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(WF_CLASS_ID, WF_ID, WF_ARC_ID, WF_ACTION_SEQ);
    }
}

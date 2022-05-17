package com.translatorv10.keys;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class WfSpcArc_Keys implements Serializable {

    private String WF_CLASS_ID;

    private String WF_ID;

    private String WF_ARC_ID;

    public WfSpcArc_Keys(String WF_CLASS_ID, String WF_ID, String WF_ARC_ID) {
        this.WF_CLASS_ID = WF_CLASS_ID;
        this.WF_ID = WF_ID;
        this.WF_ARC_ID = WF_ARC_ID;
    }

    public WfSpcArc_Keys() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WfSpcArc_Keys that = (WfSpcArc_Keys) o;
        return WF_CLASS_ID.equals(that.WF_CLASS_ID) && WF_ID.equals(that.WF_ID) && WF_ARC_ID.equals(that.WF_ARC_ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(WF_CLASS_ID, WF_ID, WF_ARC_ID);
    }
}

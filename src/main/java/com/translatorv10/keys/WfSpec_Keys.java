package com.translatorv10.keys;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class WfSpec_Keys implements Serializable {
    private String WF_CLASS_ID;
    private String WF_ID;

    public WfSpec_Keys(String WF_CLASS_ID, String WF_ID) {
        this.WF_CLASS_ID = WF_CLASS_ID;
        this.WF_ID = WF_ID;
    }

    public WfSpec_Keys() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WfSpec_Keys that = (WfSpec_Keys) o;
        return WF_CLASS_ID.equals(that.WF_CLASS_ID) && WF_ID.equals(that.WF_ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(WF_CLASS_ID, WF_ID);
    }
}

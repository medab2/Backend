package com.translatorv10.keys;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class WfClsNd_Keys implements Serializable {

    private String WF_CLASS_ID;
    private String NODE_ID;

    public WfClsNd_Keys(String WF_CLASS_ID, String NODE_ID) {
        this.WF_CLASS_ID = WF_CLASS_ID;
        this.NODE_ID = NODE_ID;
    }

    public WfClsNd_Keys() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WfClsNd_Keys that = (WfClsNd_Keys) o;
        return WF_CLASS_ID.equals(that.WF_CLASS_ID) && NODE_ID.equals(that.NODE_ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(WF_CLASS_ID, NODE_ID);
    }
}

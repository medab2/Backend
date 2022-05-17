package com.translatorv10.keys;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class RptPar_Keys implements Serializable {
    private String RPT_DESC_ID;
    private String RPT_PARAM_ID;

    public RptPar_Keys(String RPT_DESC_ID, String RPT_PARAM_ID) {
        this.RPT_DESC_ID = RPT_DESC_ID;
        this.RPT_PARAM_ID = RPT_PARAM_ID;
    }

    public RptPar_Keys() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RptPar_Keys that = (RptPar_Keys) o;
        return RPT_DESC_ID.equals(that.RPT_DESC_ID) && RPT_PARAM_ID.equals(that.RPT_PARAM_ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(RPT_DESC_ID, RPT_PARAM_ID);
    }
}

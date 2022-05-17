package com.translatorv10.keys;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class Sw_Keys  implements Serializable {

    private String SOFTWARE_ID;
    private String MODULE_ID;

    public Sw_Keys(String SOFTWARE_ID, String MODULE_ID) {
        this.SOFTWARE_ID = SOFTWARE_ID;
        this.MODULE_ID = MODULE_ID;
    }

    public Sw_Keys() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sw_Keys sw_keys = (Sw_Keys) o;
        return SOFTWARE_ID.equals(sw_keys.SOFTWARE_ID) && MODULE_ID.equals(sw_keys.MODULE_ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SOFTWARE_ID, MODULE_ID);
    }
}

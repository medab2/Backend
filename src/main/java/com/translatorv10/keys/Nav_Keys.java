package com.translatorv10.keys;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class Nav_Keys implements Serializable {
    private String CLASS_NAME;
    private String NAV_NAME;


    public Nav_Keys() {
    }

    public Nav_Keys(String CLASS_NAME, String NAV_NAME) {
        this.CLASS_NAME = CLASS_NAME;
        this.NAV_NAME = NAV_NAME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nav_Keys nav_keys = (Nav_Keys) o;
        return CLASS_NAME.equals(nav_keys.CLASS_NAME) && NAV_NAME.equals(nav_keys.NAV_NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CLASS_NAME, NAV_NAME);
    }
}

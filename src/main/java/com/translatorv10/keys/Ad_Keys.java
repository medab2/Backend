package com.translatorv10.keys;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class Ad_Keys implements Serializable {

    private String CLASS_NAME;
    private String ATTRIBUTE_NAME;

    public Ad_Keys() {
    }

    public Ad_Keys(String CLASS_NAME, String ATTRIBUTE_NAME) {
        this.CLASS_NAME = CLASS_NAME;
        this.ATTRIBUTE_NAME = ATTRIBUTE_NAME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ad_Keys ad_keys = (Ad_Keys) o;
        return CLASS_NAME.equals(ad_keys.CLASS_NAME) && ATTRIBUTE_NAME.equals(ad_keys.ATTRIBUTE_NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CLASS_NAME, ATTRIBUTE_NAME);
    }
}

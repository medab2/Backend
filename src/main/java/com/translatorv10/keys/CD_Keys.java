package com.translatorv10.keys;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class CD_Keys implements Serializable {

    private String CLASS_NAME;

    private String COMPONENT_NAME;

    public CD_Keys() {
    }

    public CD_Keys(String CLASS_NAME, String COMPONENT_NAME) {
        this.CLASS_NAME = CLASS_NAME;
        this.COMPONENT_NAME = COMPONENT_NAME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CD_Keys cd_keys = (CD_Keys) o;
        return CLASS_NAME.equals(cd_keys.CLASS_NAME) && COMPONENT_NAME.equals(cd_keys.COMPONENT_NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CLASS_NAME, COMPONENT_NAME);
    }
}

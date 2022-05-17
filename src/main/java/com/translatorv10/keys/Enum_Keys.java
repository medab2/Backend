package com.translatorv10.keys;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class Enum_Keys implements Serializable {
    private String ATTRIBUTE_REF;

    private String ENUM_VALUE;

    public Enum_Keys(String ATTRIBUTE_REF, String ENUM_VALUE) {
        this.ATTRIBUTE_REF = ATTRIBUTE_REF;
        this.ENUM_VALUE = ENUM_VALUE;
    }

    public Enum_Keys() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enum_Keys enum_keys = (Enum_Keys) o;
        return ATTRIBUTE_REF.equals(enum_keys.ATTRIBUTE_REF) && ENUM_VALUE.equals(enum_keys.ENUM_VALUE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ATTRIBUTE_REF, ENUM_VALUE);
    }
}

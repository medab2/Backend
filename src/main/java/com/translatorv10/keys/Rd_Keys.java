package com.translatorv10.keys;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Data
public class Rd_Keys implements Serializable {
    private String CLASS_NAME;

    private String RELATION_NAME;

    public Rd_Keys(String CLASS_NAME, String RELATION_NAME) {
        this.CLASS_NAME = CLASS_NAME;
        this.RELATION_NAME = RELATION_NAME;
    }

    public Rd_Keys() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rd_Keys rd_keys = (Rd_Keys) o;
        return CLASS_NAME.equals(rd_keys.CLASS_NAME) && RELATION_NAME.equals(rd_keys.RELATION_NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CLASS_NAME, RELATION_NAME);
    }
}

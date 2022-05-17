package com.translatorv10.keys;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class C1_Keys implements Serializable {

    private String ID_FORUM;

    private String ID_CLASSIF1;

    public C1_Keys() {
    }

    public C1_Keys(String ID_FORUM, String ID_CLASSIF1) {
        this.ID_FORUM = ID_FORUM;
        this.ID_CLASSIF1 = ID_CLASSIF1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C1_Keys c1_keys = (C1_Keys) o;
        return ID_FORUM.equals(c1_keys.ID_FORUM) && ID_CLASSIF1.equals(c1_keys.ID_CLASSIF1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID_FORUM, ID_CLASSIF1);
    }
}

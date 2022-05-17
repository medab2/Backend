package com.translatorv10.keys;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class C4_Keys implements Serializable {

    private String ID_FORUM;

    private String ID_CLASSIF3;

    private String ID_CLASSIF4;

    public C4_Keys() {
    }

    public C4_Keys(String ID_FORUM, String ID_CLASSIF3, String ID_CLASSIF4) {
        this.ID_FORUM = ID_FORUM;
        this.ID_CLASSIF3 = ID_CLASSIF3;
        this.ID_CLASSIF4 = ID_CLASSIF4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C4_Keys c4_keys = (C4_Keys) o;
        return ID_FORUM.equals(c4_keys.ID_FORUM) && ID_CLASSIF3.equals(c4_keys.ID_CLASSIF3) && ID_CLASSIF4.equals(c4_keys.ID_CLASSIF4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID_FORUM, ID_CLASSIF3, ID_CLASSIF4);
    }
}

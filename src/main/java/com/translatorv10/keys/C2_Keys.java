package com.translatorv10.keys;

import lombok.Data;
import java.io.Serializable;
import java.util.Objects;


@Data
public class C2_Keys implements Serializable {

    private String ID_FORUM;

    private String ID_CLASSIF2;

    public C2_Keys() {
    }

    public C2_Keys(String ID_FORUM, String ID_CLASSIF1) {
        this.ID_FORUM = ID_FORUM;
        this.ID_CLASSIF2 = ID_CLASSIF2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.translatorv10.keys.C2_Keys c2_keys = (com.translatorv10.keys.C2_Keys) o;
        return ID_FORUM.equals(c2_keys.ID_FORUM) && ID_CLASSIF2.equals(c2_keys.ID_CLASSIF2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID_FORUM, ID_CLASSIF2);
    }
}

package com.translatorv10.keys;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class C3_Keys implements Serializable {

    private String ID_FORUM ;
    private String ID_CLASSIF3;

    public C3_Keys(String ID_FORUM, String ID_CLASSIF3) {
        this.ID_FORUM = ID_FORUM;
        this.ID_CLASSIF3 = ID_CLASSIF3;
    }

    public C3_Keys() {
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C3_Keys c3_keys = (C3_Keys) o;
        return ID_FORUM.equals(c3_keys.ID_FORUM) && ID_CLASSIF3.equals(c3_keys.ID_CLASSIF3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID_FORUM, ID_CLASSIF3);
    }
}

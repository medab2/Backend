package com.translatorv10.keys;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Data
public class UserAttr_Keys implements Serializable {

    private String EXTEN_CLASS_ID;
    private String ATTRIBUTE;

    public UserAttr_Keys() {
    }

    public UserAttr_Keys(String EXTEN_CLASS_ID, String ATTRIBUTE) {
        this.EXTEN_CLASS_ID = EXTEN_CLASS_ID;
        this.ATTRIBUTE = ATTRIBUTE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAttr_Keys that = (UserAttr_Keys) o;
        return EXTEN_CLASS_ID.equals(that.EXTEN_CLASS_ID) && ATTRIBUTE.equals(that.ATTRIBUTE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(EXTEN_CLASS_ID, ATTRIBUTE);
    }
}

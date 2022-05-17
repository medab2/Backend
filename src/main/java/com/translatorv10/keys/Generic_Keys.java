package com.translatorv10.keys;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class Generic_Keys  implements Serializable {

    private String ID;
    private String TYPE_ID;

    public Generic_Keys(String ID, String TYPE_ID) {
        this.ID = ID;
        this.TYPE_ID = TYPE_ID;
    }

    public Generic_Keys() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Generic_Keys that = (Generic_Keys) o;
        return ID.equals(that.ID) && TYPE_ID.equals(that.TYPE_ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, TYPE_ID);
    }
}

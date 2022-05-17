package com.translatorv10.keys;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class Fast_Keys implements Serializable {

    private String FAST_GRID_HDR_ID;
    private String FAST_GRID_CELL_ID;

    public Fast_Keys(String FAST_GRID_HDR_ID, String FAST_GRID_CELL_ID) {
        this.FAST_GRID_HDR_ID = FAST_GRID_HDR_ID;
        this.FAST_GRID_CELL_ID = FAST_GRID_CELL_ID;
    }

    public Fast_Keys() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fast_Keys fast_keys = (Fast_Keys) o;
        return FAST_GRID_HDR_ID.equals(fast_keys.FAST_GRID_HDR_ID) && FAST_GRID_CELL_ID.equals(fast_keys.FAST_GRID_CELL_ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FAST_GRID_HDR_ID, FAST_GRID_CELL_ID);
    }
}

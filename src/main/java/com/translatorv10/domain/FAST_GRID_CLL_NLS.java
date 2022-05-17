package com.translatorv10.domain;

import com.translatorv10.keys.Fast_Keys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "FAST_GRID_CLL_NLS")
@IdClass(Fast_Keys.class)
public class FAST_GRID_CLL_NLS {
    @Id
    private String FAST_GRID_HDR_ID;
    @Id
    private String FAST_GRID_CELL_ID;
    private String HEADER_TEXT ;
    private String STATUS ="U";

    public FAST_GRID_CLL_NLS() {
    }

    public FAST_GRID_CLL_NLS(String HEADER_TEXT, String STATUS) {
        this.HEADER_TEXT = HEADER_TEXT;
        this.STATUS = STATUS;
    }

    public String getFAST_GRID_HDR_ID() {
        return FAST_GRID_HDR_ID;
    }

    public void setFAST_GRID_HDR_ID(String FAST_GRID_HDR_ID) {
        this.FAST_GRID_HDR_ID = FAST_GRID_HDR_ID;
    }

    public String getFAST_GRID_CELL_ID() {
        return FAST_GRID_CELL_ID;
    }

    public void setFAST_GRID_CELL_ID(String FAST_GRID_CELL_ID) {
        this.FAST_GRID_CELL_ID = FAST_GRID_CELL_ID;
    }

    public String getHEADER_TEXT() {
        return HEADER_TEXT;
    }

    public void setHEADER_TEXT(String HEADER_TEXT) {
        this.HEADER_TEXT = HEADER_TEXT;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

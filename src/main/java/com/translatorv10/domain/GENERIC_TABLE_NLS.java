package com.translatorv10.domain;

import com.translatorv10.keys.Generic_Keys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "GENERIC_TABLE_NLS")
@IdClass(Generic_Keys.class)
public class GENERIC_TABLE_NLS {

    @Id
    private String ID;
    @Id
    private String TYPE_ID;
    private String DESCRIZIONE;
    private String STATUS ="U";

    public GENERIC_TABLE_NLS() {
    }

    public GENERIC_TABLE_NLS(String DESCRIZIONE, String STATUS) {
        this.DESCRIZIONE = DESCRIZIONE;
        this.STATUS = STATUS;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTYPE_ID() {
        return TYPE_ID;
    }

    public void setTYPE_ID(String TYPE_ID) {
        this.TYPE_ID = TYPE_ID;
    }

    public String getDESCRIZIONE() {
        return DESCRIZIONE;
    }

    public void setDESCRIZIONE(String DESCRIZIONE) {
        this.DESCRIZIONE = DESCRIZIONE;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

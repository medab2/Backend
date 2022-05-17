package com.translatorv10.domain;

import com.translatorv10.keys.Enum_Keys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "ENUM_NLS")
@IdClass(Enum_Keys.class)
public class ENUM_NLS {
    @Id
    private String ATTRIBUTE_REF;
    @Id
    private String ENUM_VALUE;

    private String ENUM_DESC;
    private String STATUS ="U";

    public ENUM_NLS() {
    }

    public ENUM_NLS(String ENUM_DESC, String STATUS) {
        this.ENUM_DESC = ENUM_DESC;
        this.STATUS = STATUS;
    }

    public String getATTRIBUTE_REF() {
        return ATTRIBUTE_REF;
    }

    public void setATTRIBUTE_REF(String ATTRIBUTE_REF) {
        this.ATTRIBUTE_REF = ATTRIBUTE_REF;
    }

    public String getENUM_VALUE() {
        return ENUM_VALUE;
    }

    public void setENUM_VALUE(String ENUM_VALUE) {
        this.ENUM_VALUE = ENUM_VALUE;
    }

    public String getENUM_DESC() {
        return ENUM_DESC;
    }

    public void setENUM_DESC(String ENUM_DESC) {
        this.ENUM_DESC = ENUM_DESC;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

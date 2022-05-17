package com.translatorv10.domain;

import com.translatorv10.keys.UserAttr_Keys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "USR_ATTR_NLS")
@IdClass(UserAttr_Keys.class)
public class USR_ATTR_NLS {
    @Id
    private String EXTEN_CLASS_ID;
    @Id
    private String ATTRIBUTE;
    private String DESCRIPTION;
    private String STATUS ="U";

    public USR_ATTR_NLS() {
    }

    public USR_ATTR_NLS(String EXTEN_CLASS_ID, String ATTRIBUTE, String DESCRIPTION, String STATUS) {
        this.EXTEN_CLASS_ID = EXTEN_CLASS_ID;
        this.ATTRIBUTE = ATTRIBUTE;
        this.DESCRIPTION = DESCRIPTION;
        this.STATUS = STATUS;
    }

    public String getEXTEN_CLASS_ID() {
        return EXTEN_CLASS_ID;
    }

    public void setEXTEN_CLASS_ID(String EXTEN_CLASS_ID) {
        this.EXTEN_CLASS_ID = EXTEN_CLASS_ID;
    }

    public String getATTRIBUTE() {
        return ATTRIBUTE;
    }

    public void setATTRIBUTE(String ATTRIBUTE) {
        this.ATTRIBUTE = ATTRIBUTE;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

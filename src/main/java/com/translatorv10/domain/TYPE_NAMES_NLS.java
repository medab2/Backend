package com.translatorv10.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TYPE_NAMES_NLS")
public class TYPE_NAMES_NLS {
    @Id
    private String TYPE_ID;
    private String SHORT_DESCRIPTION;
    private String DESCRIPTION;
    private String STATUS ="U";

    public TYPE_NAMES_NLS() {
    }

    public TYPE_NAMES_NLS(String TYPE_ID, String SHORT_DESCRIPTION, String DESCRIPTION, String STATUS) {
        this.TYPE_ID = TYPE_ID;
        this.SHORT_DESCRIPTION = SHORT_DESCRIPTION;
        this.DESCRIPTION = DESCRIPTION;
        this.STATUS = STATUS;
    }

    public String getTYPE_ID() {
        return TYPE_ID;
    }

    public void setTYPE_ID(String TYPE_ID) {
        this.TYPE_ID = TYPE_ID;
    }

    public String getSHORT_DESCRIPTION() {
        return SHORT_DESCRIPTION;
    }

    public void setSHORT_DESCRIPTION(String SHORT_DESCRIPTION) {
        this.SHORT_DESCRIPTION = SHORT_DESCRIPTION;
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

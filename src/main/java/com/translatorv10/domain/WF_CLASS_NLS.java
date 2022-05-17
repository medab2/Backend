package com.translatorv10.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WF_CLASS_NLS")
public class WF_CLASS_NLS {
    @Id
    private String ID;

    private String DESCRIPTION;
    private String STATUS ="U";

    public WF_CLASS_NLS() {
    }

    public WF_CLASS_NLS(String ID, String DESCRIPTION, String STATUS) {
        this.ID = ID;
        this.DESCRIPTION = DESCRIPTION;
        this.STATUS = STATUS;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

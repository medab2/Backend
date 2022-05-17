package com.translatorv10.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FUNCT_VAR_NLS")
public class FUNCT_VAR_NLS {
    @Id
    private String ID;
    private String DESCRIPTION;
    private String STATUS ="U";

    public FUNCT_VAR_NLS() {
    }

    public FUNCT_VAR_NLS(String DESCRIPTION, String STATUS) {
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

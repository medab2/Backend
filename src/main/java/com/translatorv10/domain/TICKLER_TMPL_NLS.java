package com.translatorv10.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TICKLER_TMPL_NLS")
public class TICKLER_TMPL_NLS {
    @Id
    private String ID;
    private String DESCRIPTION;
    private String TICK_DESCRIPTION;
    private String STATUS ="U";

    public TICKLER_TMPL_NLS() {
    }

    public TICKLER_TMPL_NLS(String ID, String DESCRIPTION, String TICK_DESCRIPTION, String STATUS) {
        this.ID = ID;
        this.DESCRIPTION = DESCRIPTION;
        this.TICK_DESCRIPTION = TICK_DESCRIPTION;
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

    public String getTICK_DESCRIPTION() {
        return TICK_DESCRIPTION;
    }

    public void setTICK_DESCRIPTION(String TICK_DESCRIPTION) {
        this.TICK_DESCRIPTION = TICK_DESCRIPTION;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

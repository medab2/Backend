package com.translatorv10.domain;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RPT_AREA_NLS")
public class RPT_AREA_NLS {
    @Id
    private String RPT_AREA_ID;
    private String DESCRIPTION;
    private String STATUS ="U";

    public RPT_AREA_NLS() {
    }

    public RPT_AREA_NLS(String RPT_AREA_ID, String DESCRIPTION, String STATUS) {
        this.RPT_AREA_ID = RPT_AREA_ID;
        this.DESCRIPTION = DESCRIPTION;
        this.STATUS = STATUS;
    }

    public String getRPT_AREA_ID() {
        return RPT_AREA_ID;
    }

    public void setRPT_AREA_ID(String RPT_AREA_ID) {
        this.RPT_AREA_ID = RPT_AREA_ID;
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

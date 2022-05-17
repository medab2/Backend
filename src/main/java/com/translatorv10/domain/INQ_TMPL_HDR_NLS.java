package com.translatorv10.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INQ_TMPL_HDR_NLS")
public class INQ_TMPL_HDR_NLS {
    @Id
    private String ID;
    private String NLS_LEV_BEG_HDR1;
    private String NLS_LEV_END_HDR1;
    private String NLS_LEV_BEG_HDR2;
    private String NLS_LEV_END_HDR2;
    private String NLS_LEV_BEG_HDR3;
    private String NLS_LEV_END_HDR3;
    private String NLS_LEV_BEG_HDR4;
    private String NLS_LEV_END_HDR4;
    private String NLS_LEV_BEG_HDR5;
    private String NLS_LEV_END_HDR5;
    private String NLS_LEV_END_COUNT1;
    private String NLS_LEV_END_COUNT2;
    private String NLS_LEV_END_COUNT3;
    private String NLS_LEV_END_COUNT4;
    private String NLS_LEV_END_COUNT5;
    private String NLS_LEV_END_GT;
    private String NLS_LEV_END_GC;
    private String STATUS ="U";

    public INQ_TMPL_HDR_NLS() {
    }

    public INQ_TMPL_HDR_NLS(String ID, String NLS_LEV_BEG_HDR1, String NLS_LEV_END_HDR1, String NLS_LEV_BEG_HDR2, String NLS_LEV_END_HDR2, String NLS_LEV_BEG_HDR3, String NLS_LEV_END_HDR3,
                            String NLS_LEV_BEG_HDR4, String NLS_LEV_END_HDR4, String NLS_LEV_BEG_HDR5, String NLS_LEV_END_HDR5, String NLS_LEV_END_COUNT1, String NLS_LEV_END_COUNT2,
                            String NLS_LEV_END_COUNT3, String NLS_LEV_END_COUNT4, String NLS_LEV_END_COUNT5, String NLS_LEV_END_GT, String NLS_LEV_END_GC, String STATUS) {
        this.ID = ID;
        this.NLS_LEV_BEG_HDR1 = NLS_LEV_BEG_HDR1;
        this.NLS_LEV_END_HDR1 = NLS_LEV_END_HDR1;
        this.NLS_LEV_BEG_HDR2 = NLS_LEV_BEG_HDR2;
        this.NLS_LEV_END_HDR2 = NLS_LEV_END_HDR2;
        this.NLS_LEV_BEG_HDR3 = NLS_LEV_BEG_HDR3;
        this.NLS_LEV_END_HDR3 = NLS_LEV_END_HDR3;
        this.NLS_LEV_BEG_HDR4 = NLS_LEV_BEG_HDR4;
        this.NLS_LEV_END_HDR4 = NLS_LEV_END_HDR4;
        this.NLS_LEV_BEG_HDR5 = NLS_LEV_BEG_HDR5;
        this.NLS_LEV_END_HDR5 = NLS_LEV_END_HDR5;
        this.NLS_LEV_END_COUNT1 = NLS_LEV_END_COUNT1;
        this.NLS_LEV_END_COUNT2 = NLS_LEV_END_COUNT2;
        this.NLS_LEV_END_COUNT3 = NLS_LEV_END_COUNT3;
        this.NLS_LEV_END_COUNT4 = NLS_LEV_END_COUNT4;
        this.NLS_LEV_END_COUNT5 = NLS_LEV_END_COUNT5;
        this.NLS_LEV_END_GT = NLS_LEV_END_GT;
        this.NLS_LEV_END_GC = NLS_LEV_END_GC;
        this.STATUS = STATUS;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNLS_LEV_BEG_HDR1() {
        return NLS_LEV_BEG_HDR1;
    }

    public void setNLS_LEV_BEG_HDR1(String NLS_LEV_BEG_HDR1) {
        this.NLS_LEV_BEG_HDR1 = NLS_LEV_BEG_HDR1;
    }

    public String getNLS_LEV_END_HDR1() {
        return NLS_LEV_END_HDR1;
    }

    public void setNLS_LEV_END_HDR1(String NLS_LEV_END_HDR1) {
        this.NLS_LEV_END_HDR1 = NLS_LEV_END_HDR1;
    }

    public String getNLS_LEV_BEG_HDR2() {
        return NLS_LEV_BEG_HDR2;
    }

    public void setNLS_LEV_BEG_HDR2(String NLS_LEV_BEG_HDR2) {
        this.NLS_LEV_BEG_HDR2 = NLS_LEV_BEG_HDR2;
    }

    public String getNLS_LEV_END_HDR2() {
        return NLS_LEV_END_HDR2;
    }

    public void setNLS_LEV_END_HDR2(String NLS_LEV_END_HDR2) {
        this.NLS_LEV_END_HDR2 = NLS_LEV_END_HDR2;
    }

    public String getNLS_LEV_BEG_HDR3() {
        return NLS_LEV_BEG_HDR3;
    }

    public void setNLS_LEV_BEG_HDR3(String NLS_LEV_BEG_HDR3) {
        this.NLS_LEV_BEG_HDR3 = NLS_LEV_BEG_HDR3;
    }

    public String getNLS_LEV_END_HDR3() {
        return NLS_LEV_END_HDR3;
    }

    public void setNLS_LEV_END_HDR3(String NLS_LEV_END_HDR3) {
        this.NLS_LEV_END_HDR3 = NLS_LEV_END_HDR3;
    }

    public String getNLS_LEV_BEG_HDR4() {
        return NLS_LEV_BEG_HDR4;
    }

    public void setNLS_LEV_BEG_HDR4(String NLS_LEV_BEG_HDR4) {
        this.NLS_LEV_BEG_HDR4 = NLS_LEV_BEG_HDR4;
    }

    public String getNLS_LEV_END_HDR4() {
        return NLS_LEV_END_HDR4;
    }

    public void setNLS_LEV_END_HDR4(String NLS_LEV_END_HDR4) {
        this.NLS_LEV_END_HDR4 = NLS_LEV_END_HDR4;
    }

    public String getNLS_LEV_BEG_HDR5() {
        return NLS_LEV_BEG_HDR5;
    }

    public void setNLS_LEV_BEG_HDR5(String NLS_LEV_BEG_HDR5) {
        this.NLS_LEV_BEG_HDR5 = NLS_LEV_BEG_HDR5;
    }

    public String getNLS_LEV_END_HDR5() {
        return NLS_LEV_END_HDR5;
    }

    public void setNLS_LEV_END_HDR5(String NLS_LEV_END_HDR5) {
        this.NLS_LEV_END_HDR5 = NLS_LEV_END_HDR5;
    }

    public String getNLS_LEV_END_COUNT1() {
        return NLS_LEV_END_COUNT1;
    }

    public void setNLS_LEV_END_COUNT1(String NLS_LEV_END_COUNT1) {
        this.NLS_LEV_END_COUNT1 = NLS_LEV_END_COUNT1;
    }

    public String getNLS_LEV_END_COUNT2() {
        return NLS_LEV_END_COUNT2;
    }

    public void setNLS_LEV_END_COUNT2(String NLS_LEV_END_COUNT2) {
        this.NLS_LEV_END_COUNT2 = NLS_LEV_END_COUNT2;
    }

    public String getNLS_LEV_END_COUNT3() {
        return NLS_LEV_END_COUNT3;
    }

    public void setNLS_LEV_END_COUNT3(String NLS_LEV_END_COUNT3) {
        this.NLS_LEV_END_COUNT3 = NLS_LEV_END_COUNT3;
    }

    public String getNLS_LEV_END_COUNT4() {
        return NLS_LEV_END_COUNT4;
    }

    public void setNLS_LEV_END_COUNT4(String NLS_LEV_END_COUNT4) {
        this.NLS_LEV_END_COUNT4 = NLS_LEV_END_COUNT4;
    }

    public String getNLS_LEV_END_COUNT5() {
        return NLS_LEV_END_COUNT5;
    }

    public void setNLS_LEV_END_COUNT5(String NLS_LEV_END_COUNT5) {
        this.NLS_LEV_END_COUNT5 = NLS_LEV_END_COUNT5;
    }

    public String getNLS_LEV_END_GT() {
        return NLS_LEV_END_GT;
    }

    public void setNLS_LEV_END_GT(String NLS_LEV_END_GT) {
        this.NLS_LEV_END_GT = NLS_LEV_END_GT;
    }

    public String getNLS_LEV_END_GC() {
        return NLS_LEV_END_GC;
    }

    public void setNLS_LEV_END_GC(String NLS_LEV_END_GC) {
        this.NLS_LEV_END_GC = NLS_LEV_END_GC;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

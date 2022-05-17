package com.translatorv10.domain;

import javax.persistence.*;

@Entity
@Table(name = "VersionAndLanguage")
public class VR_LN {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String language;
    private String Version;

    public VR_LN(String language, String version) {
        this.language = language;
        Version = version;
    }

    public VR_LN() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }
}

package com.translatorv10.domain;

import com.translatorv10.keys.User_Menu_Folder_Keys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "USER_MENU_FOLDER_NLS")
@IdClass(User_Menu_Folder_Keys.class)
public class USER_MENU_FOLDER_NLS {
    @Id
    private String USER_ID ;
    @Id
    private String MENU_FOLDER_ID;
    private String MENU_FOLDER_NAME;
    private String STATUS ="U";

    public USER_MENU_FOLDER_NLS() {
    }

    public USER_MENU_FOLDER_NLS(String USER_ID, String MENU_FOLDER_ID, String MENU_FOLDER_NAME, String STATUS) {
        this.USER_ID = USER_ID;
        this.MENU_FOLDER_ID = MENU_FOLDER_ID;
        this.MENU_FOLDER_NAME = MENU_FOLDER_NAME;
        this.STATUS = STATUS;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getMENU_FOLDER_ID() {
        return MENU_FOLDER_ID;
    }

    public void setMENU_FOLDER_ID(String MENU_FOLDER_ID) {
        this.MENU_FOLDER_ID = MENU_FOLDER_ID;
    }

    public String getMENU_FOLDER_NAME() {
        return MENU_FOLDER_NAME;
    }

    public void setMENU_FOLDER_NAME(String MENU_FOLDER_NAME) {
        this.MENU_FOLDER_NAME = MENU_FOLDER_NAME;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
}

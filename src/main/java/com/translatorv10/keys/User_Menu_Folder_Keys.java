package com.translatorv10.keys;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Data
public class User_Menu_Folder_Keys implements Serializable {

    private String USER_ID ;
    private String MENU_FOLDER_ID;


    public User_Menu_Folder_Keys(String USER_ID, String MENU_FOLDER_ID) {
        this.USER_ID = USER_ID;
        this.MENU_FOLDER_ID = MENU_FOLDER_ID;
    }

    public User_Menu_Folder_Keys() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User_Menu_Folder_Keys that = (User_Menu_Folder_Keys) o;
        return USER_ID.equals(that.USER_ID) && MENU_FOLDER_ID.equals(that.MENU_FOLDER_ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(USER_ID, MENU_FOLDER_ID);
    }
}

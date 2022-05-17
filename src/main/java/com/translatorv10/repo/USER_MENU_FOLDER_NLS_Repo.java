package com.translatorv10.repo;

import com.translatorv10.domain.USER_MENU_FOLDER_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("user_menu_folder_nls")
public interface USER_MENU_FOLDER_NLS_Repo extends JpaRepository<USER_MENU_FOLDER_NLS,String> {
}

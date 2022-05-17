package com.translatorv10.repo;

import com.translatorv10.domain.FOLDER_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("folder_nls_repo")
public interface FOLDER_NLS_Repo extends JpaRepository<FOLDER_NLS,String> {
}

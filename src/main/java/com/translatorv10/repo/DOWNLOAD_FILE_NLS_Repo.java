package com.translatorv10.repo;

import com.translatorv10.domain.DOWNLOAD_FILE_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("download_file_nls_repo")
public interface DOWNLOAD_FILE_NLS_Repo extends JpaRepository<DOWNLOAD_FILE_NLS,String> {
}

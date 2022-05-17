package com.translatorv10.repo;

import com.translatorv10.domain.DOWNLOAD_TYPE_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("download_type_nls")
public interface DOWNLOAD_TYPE_NLS_Repo extends JpaRepository<DOWNLOAD_TYPE_NLS,String> {
}

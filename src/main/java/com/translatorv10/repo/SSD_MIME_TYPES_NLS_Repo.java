package com.translatorv10.repo;

import com.translatorv10.domain.SSD_MIME_TYPES_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ssd_mime_types_nls_repo")
public interface SSD_MIME_TYPES_NLS_Repo extends JpaRepository<SSD_MIME_TYPES_NLS,String> {
}

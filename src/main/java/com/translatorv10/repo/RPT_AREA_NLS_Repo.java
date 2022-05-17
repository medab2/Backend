package com.translatorv10.repo;

import com.translatorv10.domain.RPT_AREA_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("rpt_area_nls_repo")
public interface RPT_AREA_NLS_Repo extends JpaRepository<RPT_AREA_NLS,String> {
}

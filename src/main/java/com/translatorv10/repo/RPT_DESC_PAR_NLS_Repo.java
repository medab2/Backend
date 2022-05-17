package com.translatorv10.repo;

import com.translatorv10.domain.RPT_DESC_PAR_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("rpt_desc_par_nls_repo")
public interface RPT_DESC_PAR_NLS_Repo extends JpaRepository<RPT_DESC_PAR_NLS,String> {
}

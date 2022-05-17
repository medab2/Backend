package com.translatorv10.repo;

import com.translatorv10.domain.INQ_TMPL_HDR_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("inq_tmpl_hdr_nls_repo")
public interface INQ_TMPL_HDR_NLS_Repo extends JpaRepository<INQ_TMPL_HDR_NLS,String> {
}

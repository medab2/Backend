package com.translatorv10.repo;

import com.translatorv10.domain.FLOW_HDR_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("flow_hdr_nls_repo")
public interface FLOW_HDR_NLS_Repo extends JpaRepository<FLOW_HDR_NLS,Long> {
}

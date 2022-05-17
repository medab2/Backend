package com.translatorv10.repo;

import com.translatorv10.domain.WF_CLS_ND_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("wf_cls_nd_nls_repo")
public interface WF_CLS_ND_NLS_Repo extends JpaRepository<WF_CLS_ND_NLS,String> {
}

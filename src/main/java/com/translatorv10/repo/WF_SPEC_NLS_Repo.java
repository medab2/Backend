package com.translatorv10.repo;

import com.translatorv10.domain.WF_SPEC_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("wf_spec_nls_repo")
public interface WF_SPEC_NLS_Repo extends JpaRepository<WF_SPEC_NLS,String> {
}

package com.translatorv10.repo;

import com.translatorv10.domain.WF_ARC_ACT_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("wf_arc_act_nls_repo")
public interface WF_ARC_ACT_NLS_Repo extends JpaRepository<WF_ARC_ACT_NLS,String> {
}

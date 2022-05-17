package com.translatorv10.repo;

import com.translatorv10.domain.WF_SPC_ARC_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("wf_spc_arc_nls")
public interface WF_SPC_ARC_NLS_Repo extends JpaRepository<WF_SPC_ARC_NLS,String> {
}

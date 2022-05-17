package com.translatorv10.repo;

import com.translatorv10.domain.WF_CLASS_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("wf_class_nls_repo")
public interface WF_CLASS_NLS_Repo extends JpaRepository<WF_CLASS_NLS,String> {
}

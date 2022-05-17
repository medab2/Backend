package com.translatorv10.repo;

import com.translatorv10.domain.CLASS_HDR_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("class_hdr_nls_repo")
public interface CLASS_HDR_NLS_Repo extends JpaRepository<CLASS_HDR_NLS,String>{

}

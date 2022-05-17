package com.translatorv10.repo;

import com.translatorv10.domain.CLASSAD_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("classad_nls_repo")
public interface CLASSAD_NLS_Repo extends JpaRepository<CLASSAD_NLS,String> {
}

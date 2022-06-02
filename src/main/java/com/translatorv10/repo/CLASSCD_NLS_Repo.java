package com.translatorv10.repo;

import com.translatorv10.domain.CLASSCD_NLS;
import com.translatorv10.keys.CD_Keys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("classcd_nls_repo")
public interface CLASSCD_NLS_Repo extends JpaRepository<CLASSCD_NLS, CD_Keys> {
}

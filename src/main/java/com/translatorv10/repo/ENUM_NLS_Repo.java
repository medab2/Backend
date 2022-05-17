package com.translatorv10.repo;

import com.translatorv10.domain.ENUM_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("enum_nls_repo")
public interface ENUM_NLS_Repo extends JpaRepository<ENUM_NLS,String> {
}

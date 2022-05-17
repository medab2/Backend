package com.translatorv10.repo;

import com.translatorv10.domain.CLASSRD_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("classrd_nls_repo")
public interface CLASSRD_NLS_Repo extends JpaRepository<CLASSRD_NLS,String> {
}

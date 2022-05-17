package com.translatorv10.repo;

import com.translatorv10.domain.SOFTWARE_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("software_nls_repo")
public interface SOFTWARE_NLS_Repo extends JpaRepository<SOFTWARE_NLS,String> {
}

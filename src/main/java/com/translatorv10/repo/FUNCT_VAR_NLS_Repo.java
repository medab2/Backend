package com.translatorv10.repo;

import com.translatorv10.domain.FUNCT_VAR_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("funct_var_nls_repo")
public interface FUNCT_VAR_NLS_Repo extends JpaRepository<FUNCT_VAR_NLS,String> {
}

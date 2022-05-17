package com.translatorv10.repo;

import com.translatorv10.domain.SW_MODULE_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("sw_module_nls_repo")
public interface SW_MODULE_NLS_Repo extends JpaRepository<SW_MODULE_NLS,String> {
}

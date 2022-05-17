package com.translatorv10.repo;

import com.translatorv10.domain.USR_ATTR_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("usr_attr_nls_repo")
public interface USR_ATTR_NLS_Repo extends JpaRepository<USR_ATTR_NLS,String> {
}

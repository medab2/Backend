package com.translatorv10.repo;

import com.translatorv10.domain.TYPE_NAMES_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("type_names_nls_repo")
public interface TYPE_NAMES_NLS_Repo extends JpaRepository<TYPE_NAMES_NLS,String> {
}

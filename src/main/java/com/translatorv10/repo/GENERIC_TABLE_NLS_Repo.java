package com.translatorv10.repo;

import com.translatorv10.domain.GENERIC_TABLE_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("generic_table_nls_repo")
public interface GENERIC_TABLE_NLS_Repo extends JpaRepository<GENERIC_TABLE_NLS,String> {
}

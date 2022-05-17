package com.translatorv10.repo;

import com.translatorv10.domain.RESOURCES_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("resources_nls_repo")
public interface RESOURCES_NLS_Repo extends JpaRepository<RESOURCES_NLS,String> {

}

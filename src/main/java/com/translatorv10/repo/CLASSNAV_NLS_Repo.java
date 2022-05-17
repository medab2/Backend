package com.translatorv10.repo;

import com.translatorv10.domain.CLASSNAV_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("classnav_nls_repo")
public interface CLASSNAV_NLS_Repo extends JpaRepository<CLASSNAV_NLS,String> {

}

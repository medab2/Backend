package com.translatorv10.repo;

import com.translatorv10.domain.MSG_TMPL_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("msg_tmpl_nls_repo")
public interface MSG_TMPL_NLS_Repo extends JpaRepository<MSG_TMPL_NLS,String> {
}

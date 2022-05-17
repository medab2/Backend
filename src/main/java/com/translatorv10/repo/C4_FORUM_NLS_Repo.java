package com.translatorv10.repo;

import com.translatorv10.domain.C4_FORUM_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("c4_forum_nls_repo")
public interface C4_FORUM_NLS_Repo extends JpaRepository<C4_FORUM_NLS,String> {

}

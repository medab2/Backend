package com.translatorv10.repo;

import com.translatorv10.domain.C2_FORUM_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("c2_forum_nls_repo")
public interface C2_FORUM_NLS_Repo extends JpaRepository<C2_FORUM_NLS,String> {
}

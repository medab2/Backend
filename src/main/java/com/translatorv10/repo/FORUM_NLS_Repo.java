package com.translatorv10.repo;

import com.translatorv10.domain.FORUM_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("forum_nls_repo")
public interface FORUM_NLS_Repo extends JpaRepository<FORUM_NLS,String> {
}

package com.translatorv10.repo;


import com.translatorv10.domain.C3_FORUM_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("c3_forum_nls_repo")
public interface C3_FORUM_NLS_Repo extends JpaRepository<C3_FORUM_NLS,String> {
}

package com.translatorv10.repo;

import com.translatorv10.domain.TICKLER_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tickler_nls_repo")
public interface TICKLER_NLS_Repo extends JpaRepository<TICKLER_NLS,String> {
}

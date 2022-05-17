package com.translatorv10.repo;

import com.translatorv10.domain.FAST_GRID_CLL_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("fast_grid_cll_nls_repo")
public interface FAST_GRID_CLL_NLS_Repo extends JpaRepository<FAST_GRID_CLL_NLS,String> {
}

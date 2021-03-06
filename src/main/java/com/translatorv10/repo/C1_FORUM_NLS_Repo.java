package com.translatorv10.repo;


import com.translatorv10.domain.C1_FORUM_NLS;
import com.translatorv10.keys.C1_Keys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository("c1_forum_nls_repo")
public interface C1_FORUM_NLS_Repo extends JpaRepository<C1_FORUM_NLS, C1_Keys> {

    @Override
    <S extends C1_FORUM_NLS> S save(S entity);


}

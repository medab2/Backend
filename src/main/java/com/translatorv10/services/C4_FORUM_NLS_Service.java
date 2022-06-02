package com.translatorv10.services;

import com.translatorv10.domain.C4_FORUM_NLS;
import com.translatorv10.repo.C4_FORUM_NLS_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class C4_FORUM_NLS_Service {

    private C4_FORUM_NLS_Repo c4_forum_nls_repo;

    @Autowired
    public C4_FORUM_NLS_Service(C4_FORUM_NLS_Repo c4_forum_nls_repo){
        this.c4_forum_nls_repo= c4_forum_nls_repo;
    }


    public List<C4_FORUM_NLS> findAllC4(){
        return c4_forum_nls_repo.findAll();
    }



    public C4_FORUM_NLS updateC4(C4_FORUM_NLS c4_forum_nls){
        return c4_forum_nls_repo.save(c4_forum_nls);
    }


}

package com.translatorv10.repo;

import com.translatorv10.domain.ERROR_NLS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin(origins = "*")
@Repository("error_nls_repo")
public interface ERROR_NLS_Repo extends JpaRepository<ERROR_NLS,String> {

@Override
    List<ERROR_NLS> findAll();
}

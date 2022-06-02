package com.translatorv10.repo;


import com.translatorv10.domain.VR_LN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VR_Ln_Repo extends JpaRepository <VR_LN,Long> {

}


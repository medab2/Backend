package com.translatorv10.services;

import com.translatorv10.domain.VR_LN;
import com.translatorv10.repo.VR_Ln_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Vr_Ln_Service {
    @Autowired
    private VR_Ln_Repo vrLnRepo ;

   public Vr_Ln_Service(VR_Ln_Repo vrLnRepo) {
       this.vrLnRepo = vrLnRepo;
   }
   public void saveln_vr(String currentlanguage, String currentversion){
        VR_LN vr_ln =new VR_LN();
        vr_ln.setLanguage(currentlanguage);
        vr_ln.setVersion(currentversion);
        vrLnRepo.save(vr_ln);
   }}

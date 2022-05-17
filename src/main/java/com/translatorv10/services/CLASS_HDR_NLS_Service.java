package com.translatorv10.services;

import com.translatorv10.domain.CLASS_HDR_NLS;
import com.translatorv10.repo.CLASS_HDR_NLS_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CLASS_HDR_NLS_Service {

    private CLASS_HDR_NLS_Repo hdr_nls_repo;


    @Autowired
    public CLASS_HDR_NLS_Service(CLASS_HDR_NLS_Repo class_hdr_nls_repo){
        this.hdr_nls_repo=class_hdr_nls_repo;
    }

    public List<CLASS_HDR_NLS> findAllHDR(){
        return hdr_nls_repo.findAll();
    }



    public CLASS_HDR_NLS updateHdr(CLASS_HDR_NLS class_hdr_nls){
        return hdr_nls_repo.save(class_hdr_nls);
    }

    public void deleteHdr(String CLASS_NAME){
        hdr_nls_repo.deleteById(CLASS_NAME);
    }
}

package com.cmconsulting.core.dao;

import com.cmconsulting.core.dto.ProduitTO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

@Service
public interface ProduitService{

    Page<ProduitTO> findAllProduit () throws Exception;
    ProduitTO findProduitById(long id) throws Exception;
    ProduitTO findProduitByCode(String code) throws Exception;
    Page<ProduitTO> findProduitByCategorie(String categoryProduit, Pageable pageable) throws Exception;
    String codeProduitChaussure( Integer numero)throws Exception;
    Page<ProduitTO> findProduitByPrixInferieur(float prix, Pageable pageable) throws Exception;
    void deleteProduitById(Long id)throws  Exception;
    void saveProduit(ProduitTO produitTO) throws Exception;
    void updateProduit( Long id, ProduitTO produitTO) throws  Exception;



}

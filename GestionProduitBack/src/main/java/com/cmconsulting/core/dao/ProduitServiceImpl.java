package com.cmconsulting.core.dao;


import com.cmconsulting.core.dto.ProduitTO;
import com.cmconsulting.core.repository.ProduitRepository;
import com.cmconsulting.core.service.ProduitToProduitTO;
import com.cmconsulting.modele.Produit;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class ProduitServiceImpl implements ProduitService {

    @Autowired
    private ProduitRepository produitRepository;


    private ProduitToProduitTO produitToProduitTO;


    @Override
    public Page<ProduitTO> findAllProduit() throws Exception {

        Page<Produit> produitPage= (Page<Produit>) produitRepository.findAll();
        List<ProduitTO> produitTOList= (List<ProduitTO>) produitToProduitTO.transformCollectionEntityToCollectionDto(produitPage.getContent());
        return new PageImpl<ProduitTO>(produitTOList);
    }

    @Override
    public ProduitTO findProduitById(long id) throws Exception{
        return produitToProduitTO.transfromToDto(produitRepository.findProduitById(id));
    }

    @Override
    public ProduitTO findProduitByCode(String code) throws Exception {

        Produit produit= produitRepository.findProduitByCode(code);
        ProduitTO produitTO= produitToProduitTO.transfromToDto(produit);
        return produitTO;

    }

    @Override
    public Page<ProduitTO> findProduitByCategorie(String categoryProduit, Pageable pageable) throws Exception {
        Page<Produit> produitPage= produitRepository.findProduitByCategorie(categoryProduit, pageable);
        List<ProduitTO> produitTOList= (List<ProduitTO>) produitToProduitTO.transformCollectionEntityToCollectionDto(produitPage.getContent());
        return  new PageImpl<ProduitTO>(produitTOList);
    }


    @Override
    public String codeProduitChaussure(Integer numero) throws Exception {
        if(numero==300) return "300";
        else return "erreur";
    }

    @Override
    public Page<ProduitTO> findProduitByPrixInferieur(float prix, Pageable pageable) throws Exception {
        Page<Produit> produitPage= produitRepository.findProduitByPrixInferieur(prix, pageable);
        List<ProduitTO> produitTOList= (List<ProduitTO>) produitToProduitTO.transformCollectionEntityToCollectionDto(produitPage.getContent());
        return new PageImpl<ProduitTO>(produitTOList);

    }

    @Override
    public void deleteProduitById(Long id) throws Exception {
        produitRepository.deleteById(id);
    }

    @Override
   public void saveProduit(ProduitTO produitTO) throws Exception{
      produitRepository.save(produitToProduitTO.transfromToEntity(produitTO));
    }

    @Override
    public void updateProduit(Long id, ProduitTO produitTO) throws  Exception{
        Produit produit= produitRepository.getOne(id);
        produitTO.setId(produit.getId());
        produitRepository.save(produitToProduitTO.transfromToEntity(produitTO));
    }


}

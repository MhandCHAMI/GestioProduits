package com.cmconsulting.core.service;

import com.cmconsulting.core.dto.ProduitTO;
import com.cmconsulting.modele.Produit;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ProduitToProduitTO extends MapperEntityDto<Produit, ProduitTO> {

    //Lorsqu'une propriété porte le même nom que son homologue d'entité cible, elle sera mappée implicitement.
    //Lorsqu'une propriété a un nom différent dans l'entité cible, son nom peut être spécifié via l'annotation @Mapping

    @Mapping(source = "quantiteStock", target = "quantite")
    Produit transfromToEntity(ProduitTO dto);

}



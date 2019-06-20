package com.cmconsulting.core.repository;

import com.cmconsulting.modele.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import javax.ws.rs.PathParam;

@Repository
public interface ProduitRepository  extends JpaRepository<Produit, Long> {

    @Query(value = "SELECT P FROM Produit P WHERE P.id = :id")
    Produit findProduitById(@PathParam(value = "id") Long id);

   // @Query(value = "SELECT p From Produit p WHERE p.cod=: code")
   // Page findProduitByCode(@PathParam("code") String code);

   @Query(value = "SELECT p FROM Produit p WHERE p.code=: code")
    Produit findProduitByCode(@PathParam("code") String code);

    @Query(value = "SELECT p FROM Produit p WHERE p.category =: category")
    Page<Produit> findProduitByCategorie(@PathParam("category") String category, Pageable pageable);

    @Query(value = "SELECT p from Produit p WHERE p.prix =: prix")
    Page<Produit> findProduitByPrixInferieur(@PathParam("prix") float prix , Pageable pageable);

}

package com.cmconsulting.modele;

import com.cmconsulting.common.enumeration.CategoryProduitEnum;
import com.cmconsulting.common.validator.MhPrixIsCorrecte;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PRODUIT")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public  class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "CODE", nullable = false, unique = true)
    private String code;

    @Column(name = "DESCRIPTION")
    private String description;

    @MhPrixIsCorrecte
    @Column(name = "PRIX")
    private Float prix;

    @Column(name = "CATEGORY", nullable = false)
    private CategoryProduitEnum category;

}

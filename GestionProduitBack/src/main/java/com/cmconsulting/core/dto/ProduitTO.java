package com.cmconsulting.core.dto;

import com.cmconsulting.common.enumeration.CategoryProduitEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@JsonComponent
@Builder
public class ProduitTO implements Serializable {

    @JsonProperty(value = "id")
    private Long id;
    @JsonProperty(value = "code")
    private String code;
    @JsonProperty(value = "description")
    private String description;
    @JsonProperty(value = "prix")
    private float prix;
    @JsonProperty(value = "category")
    private CategoryProduitEnum category;

}

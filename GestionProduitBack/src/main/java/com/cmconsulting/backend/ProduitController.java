package com.cmconsulting.backend;

import com.cmconsulting.common.enumeration.CategoryProduitEnum;
import com.cmconsulting.core.dao.ProduitService;
import com.cmconsulting.core.dto.ProduitTO;
import com.cmconsulting.modele.Produit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

//API REST
@RestController()
@RequestMapping(value = "produit")
@Slf4j
public class ProduitController {

    public void setProduitService(ProduitService produitService) {
        this.produitService = produitService;
    }


    private ProduitService produitService;


    @GetMapping(path = "findAllProduit")
    public Response findAllProduit(){
        Response response= null;
        try {
            response= Response.ok(produitService.findAllProduit()).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  response;
    }


    @RequestMapping(path = "findProduitById", method = RequestMethod.GET)
    public Response findProduitById(@PathParam(value = "id") Long id){
        Response response= null;
        try{
            response= Response.ok(produitService.findProduitById(id)).build();
        }catch(Exception e){
            e.getStackTrace();
        }
        return response;
    }

    @RequestMapping(path = "findProduitByInferieurPrix", method = RequestMethod.GET)
    public Response findProduitByPrixInferieur(@PathParam("prix") float prix, @PathParam("pageable") Pageable pageable){
        Response response= null;
        try{
            response= Response.ok(produitService.findProduitByPrixInferieur(prix, pageable)).build();
        }catch (Exception e){
          e.getStackTrace();
        }
        return response;
    }


    @RequestMapping(path = "findProduitByCategory")
    public Response findProduitByCategory(@PathParam("cat") String category, @PathParam("pageable") Pageable pageable) {
        Response response = null;
        try {
            response = Response.ok(produitService.findProduitByCategorie(category, pageable)).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }


    //@PostMapping(path = "/addProduit")
    @RequestMapping(path = "saveProduit", method = RequestMethod.POST)
    public Response saveProduit(@RequestBody ProduitTO produitTO){
        Response response= null;
        try {
            produitService.saveProduit(produitTO);
         response = Response.ok("le produit est enregistré avec succés").build();
        }catch( Exception e){
            e.getStackTrace();
        }
        return response;
    }

    @PutMapping(path = "updateProuit")
    public Response updateProduit(@PathParam("id") Long id, @RequestBody ProduitTO produitTO){
        Response response=null;
        try {
            produitService.updateProduit(id, produitTO);
            response= Response.ok("le Produit est modifié avec succés").build();
        }catch (Exception e){
            e.getStackTrace();
        }
        return response;
    }

    @DeleteMapping(path = "deleteProduit")
    public Response deleteProduit(@PathParam("id") Long idProduit){
        Response response=null;
        try {
            produitService.deleteProduitById(idProduit);
            response= Response.ok("le produit à été supprimé avec succé").build();
        }catch (Exception e){
            e.getStackTrace();
        }
        return response;
    }
    @CrossOrigin("http://localhost:4200")
    @GetMapping("afficheProduit")
    public @Valid Produit AfficheProduit(){
        log.info("l'affichage s'est effectué avec succé");
        return Produit.builder().id(1L).
                code("clavier_numérique").
                category(CategoryProduitEnum.ELECTRONIQUE).
                description("clavier pc HP").
                prix((float) 0.65).build();
    }


    @CrossOrigin("http://localhost:4200")
    @PostMapping("addtest")
    public String addTest(@RequestBody @Valid Produit produit){

        return "test";
    }

    @CrossOrigin("http://localhost:4200")
    @GetMapping("test")
    @Secured("ROLE_USER")
    public String addTest(){

        return "test";
    }

}

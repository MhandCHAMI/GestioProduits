package com.cmconsulting.backend;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.PathParam;

// comment déclarer des web services pour les applications web
@Controller(value = "/webProduit")
public class ProduitControllerWeb {



    @RequestMapping(value = "/methodeHello", method = RequestMethod.GET)
    @ResponseBody
    public String helloMethode(){
        return "hello Monsieur je suis ravi de vous revoir";
    }

    @PostMapping(value = "/postMethode")
    @ResponseBody
    public String ecritureMethode(@PathParam("parametre") String parametre){
        return "Monsieur merci de m'avoir ecrit ça "+parametre;
    }
}

package com.cmconsulting.coreTest.daoTest;

import com.cmconsulting.core.dao.ProduitService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


/*

  @Mock = maquette
  Mockito : C’est un framework Java très connu permettant de générer automatiquement des  objets ‘mockés‘.
  difference between
  Utilisez @InjectMocks pour créer des instances de classe devant être testées dans la classe de test.
  Utilisez @InjectMocks lorsque le corps de la méthode doit être exécuté pour une classe donnée.
  Utilisez @InjectMocks lorsque nous avons besoin que toutes les dépendances internes soient initialisées avec des objets fictifs pour fonctionner correctement.
  Utilisez @Mock pour créer des simulations nécessaires au support des tests de la classe à tester
  Dépendances de classes annotées (à tester) avec l'annotation @Mock.
  Nous devons définir les méthodes when-thenRetrun pour les objets fictifs que les méthodes de classe vont appeler lors de l'exécution réelle du test.

*/





//@RunWith(MockitoJUnitRunner.class)
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProduitServiceTest {

    @Autowired
    private ProduitService produitService;



   @Test
    public void findProduitById_Non_Ok() throws Exception{
       String code = null;
       try {
           code = produitService.codeProduitChaussure(3070);
       } catch (Exception e) {
           e.printStackTrace();
       }
       Assert.assertNotEquals("300", code);
   }





}

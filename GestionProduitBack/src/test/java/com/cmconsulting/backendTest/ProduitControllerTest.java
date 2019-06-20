package com.cmconsulting.backendTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProduitControllerTest {


    @LocalServerPort
    private int port;




    @Test
    public void run_and_invok_webservice_test(){
        String url="http://localhost:"+port+"/produit/test";
        String body=new TestRestTemplate("user","user").getForObject(url,String.class);
        assertThat(body, is("test"));
    }
}

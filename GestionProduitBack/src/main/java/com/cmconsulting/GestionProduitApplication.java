package com.cmconsulting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import javax.naming.*;
import java.util.Hashtable;

@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled = true) //Permet d'activer l'annotation @Secured qui serait appliqué sur une methode
public class GestionProduitApplication {
	

	@Configuration
	static class SecurityConfig extends GlobalAuthenticationConfigurerAdapter {

		@Override
		public void init(AuthenticationManagerBuilder auth) throws  Exception{
			auth.inMemoryAuthentication().withUser("user").password("{noop}user").roles("USER").and().
					withUser("admin").password("{noop}admin").roles("admin");
		}
	}


	public static void main(String[] args) {
		SpringApplication.run(GestionProduitApplication.class, args);
		System.out.println("Je suis dans la classe main du Projet");
	}

}

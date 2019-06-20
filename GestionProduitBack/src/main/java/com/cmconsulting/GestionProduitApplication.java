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

	Context context= new Context() {
		@Override
		public Object lookup(Name name) throws NamingException {
			return null;
		}

		@Override
		public Object lookup(String name) throws NamingException {
			return null;
		}

		@Override
		public void bind(Name name, Object obj) throws NamingException {

		}

		@Override
		public void bind(String name, Object obj) throws NamingException {

		}

		@Override
		public void rebind(Name name, Object obj) throws NamingException {

		}

		@Override
		public void rebind(String name, Object obj) throws NamingException {

		}

		@Override
		public void unbind(Name name) throws NamingException {

		}

		@Override
		public void unbind(String name) throws NamingException {

		}

		@Override
		public void rename(Name oldName, Name newName) throws NamingException {

		}

		@Override
		public void rename(String oldName, String newName) throws NamingException {

		}

		@Override
		public NamingEnumeration<NameClassPair> list(Name name) throws NamingException {
			return null;
		}

		@Override
		public NamingEnumeration<NameClassPair> list(String name) throws NamingException {
			return null;
		}

		@Override
		public NamingEnumeration<Binding> listBindings(Name name) throws NamingException {
			return null;
		}

		@Override
		public NamingEnumeration<Binding> listBindings(String name) throws NamingException {
			return null;
		}

		@Override
		public void destroySubcontext(Name name) throws NamingException {

		}

		@Override
		public void destroySubcontext(String name) throws NamingException {

		}

		@Override
		public Context createSubcontext(Name name) throws NamingException {
			return null;
		}

		@Override
		public Context createSubcontext(String name) throws NamingException {
			return null;
		}

		@Override
		public Object lookupLink(Name name) throws NamingException {
			return null;
		}

		@Override
		public Object lookupLink(String name) throws NamingException {
			return null;
		}

		@Override
		public NameParser getNameParser(Name name) throws NamingException {
			return null;
		}

		@Override
		public NameParser getNameParser(String name) throws NamingException {
			return null;
		}

		@Override
		public Name composeName(Name name, Name prefix) throws NamingException {
			return null;
		}

		@Override
		public String composeName(String name, String prefix) throws NamingException {
			return null;
		}

		@Override
		public Object addToEnvironment(String propName, Object propVal) throws NamingException {
			return null;
		}

		@Override
		public Object removeFromEnvironment(String propName) throws NamingException {
			return null;
		}

		@Override
		public Hashtable<?, ?> getEnvironment() throws NamingException {
			return null;
		}

		@Override
		public void close() throws NamingException {

		}

		@Override
		public String getNameInNamespace() throws NamingException {
			return null;
		}
	}

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

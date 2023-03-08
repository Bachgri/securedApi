package com.rest.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rest.api.entity.Fournisseur;
import com.rest.api.reposiroty.FournisseurRepo;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
	/*@Bean
	CommandLineRunner start(FournisseurRepo fr) {
		return args ->{
			Fournisseur f = new Fournisseur();
			f.setId(1L);
			f.setNom("f1");
			f.setEmail("emailf1@gmail.com");
			f.setPhone("0622115470");
			f.setVille("Salé"); 
			fr.save(f);
			fr.findAll().forEach(t -> {
				System.out.println(t);
			});
		};
	}*/

}

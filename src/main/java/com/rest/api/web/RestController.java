package com.rest.api.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rest.api.entity.Client;
import com.rest.api.entity.Fournisseur;
import com.rest.api.reposiroty.ClientRepo;
import com.rest.api.reposiroty.FournisseurRepo;


@RepositoryRestResource
public class RestController {
	
	@Autowired
	private FournisseurRepo fournisseurRepo;
	@Autowired
	private ClientRepo clientRepo;
	
	
	/**
	 * 
	 * Fourbisseur APIs
	 * 
	 * @return
	 */							

	@GetMapping("/fournisseurs")
	public List<Fournisseur> fournisseurs(){
		return fournisseurRepo.findAll();
	}
	@PostMapping("/fournisseurs")
	public Fournisseur postFournisseur(@RequestBody Fournisseur f) {
		return fournisseurRepo.save(f);
	}
	@PutMapping("/fournisseurs/{id}")
	public Fournisseur putFournisseur(@RequestBody Fournisseur f, @PathVariable("id") Long id) {
		Fournisseur s = fournisseurRepo.findById(id).get();
		s.setEmail(f.getEmail());
		s.setNom(f.getNom());
		s.setPhone(f.getPhone());
		s.setVille(f.getVille());
		return fournisseurRepo.saveAndFlush(s);
	}
	@DeleteMapping("/fournisseurs/{id}")
	public Fournisseur deleteFournisseur(@PathVariable("id") Long id) {
		fournisseurRepo.deleteById(id);
		return fournisseurRepo.findById(id).get();
	}
	/**
	 * 
	 * Clients APIs
	 * 
	 */
	@GetMapping("/clients")
	public List<Client> clients(){
		return clientRepo.findAll();
	}
	@PostMapping("/clients")
	public Client postClient(@RequestBody Client f) {
		return clientRepo.save(f);
	}
	@PutMapping("/clients/{id}")
	public Client putClient(@RequestBody Client f, @PathVariable("id") Long id) {
		Client s = clientRepo.findById(id).get();
		s.setAdress(f.getAdress());
		s.setEmail(f.getEmail());
		s.setNom(f.getNom());
		s.setPhone(f.getPhone());
		return clientRepo.saveAndFlush(s);
	}
	@DeleteMapping("/clients/{id}")
	public Client deleteClient(@PathVariable("id") Long id) {
		clientRepo.deleteById(id);
		return clientRepo.findById(id).get();
	}
	
}

package com.rest.api.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String username, password;
	private String email;
	private String phone;
	private String adress;
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<ClientRole> appRoles = new ArrayList<>();
	
	public Client(){}
	
	public Client(String nom, String username, String password, String email, String phone, String adress,
			Collection<ClientRole> appRoles) {
		super();
		this.nom = nom;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.adress = adress;
		this.appRoles = appRoles;
	}

	public Client(String nom, String email, String phone, String adress) {
		super();
		this.nom = nom;
		this.email = email;
		this.phone = phone;
		this.adress = adress;
	}
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<ClientRole> getAppRoles() {
		return appRoles;
	}

	public void setAppRoles(Collection<ClientRole> appRoles) {
		this.appRoles = appRoles;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	
	
}

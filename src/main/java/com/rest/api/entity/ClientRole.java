package com.rest.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ClientRole {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String roleName;
	
	
	public ClientRole(String roleName) {
		super();
		this.roleName = roleName;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}

package com.rest.api.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rest.api.entity.Client;
import com.rest.api.entity.ClientRole;
import com.rest.api.reposiroty.ClientRepo;
import com.rest.api.reposiroty.RoleRepo;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	ClientRepo clientRepo;
	RoleRepo roleRepo;
	
	public AccountServiceImpl(ClientRepo clientRepo, RoleRepo roleRepo) {
		super();
		this.clientRepo = clientRepo;
		this.roleRepo = roleRepo;
	}

	@Override
	public Client addClient(Client c) { 
		
		return clientRepo.saveAndFlush(c);
	}

	@Override
	public ClientRole addRole(ClientRole role) { 
		return roleRepo.saveAndFlush(role);
	}

	@Override
	public void addRolToUser(String username, String roleName) {
		Client client = clientRepo.findByName(username);
		ClientRole role = roleRepo.findByRoleName(roleName);
		client.getAppRoles().add(role);
		
	}

	@Override
	public Client loadUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> listClients() {
		// TODO Auto-generated method stub
		return null;
	} 
	
}

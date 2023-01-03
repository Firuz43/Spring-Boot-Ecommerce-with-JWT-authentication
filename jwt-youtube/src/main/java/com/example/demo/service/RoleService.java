package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RoleDao;
import com.example.demo.entity.Role;

@Service
public class RoleService {
	
	//Second Here it's accepting role from controller and passing it to our repository
	//we are injecting our role dao interface that extending CrudRepository
	@Autowired
	private RoleDao roleDao; 
	
	public Role createNewRole(Role role) {
		return roleDao.save(role);
	}
}

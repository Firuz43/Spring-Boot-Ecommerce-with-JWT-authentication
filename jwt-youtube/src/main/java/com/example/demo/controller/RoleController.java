package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Role;
import com.example.demo.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	//First its starting from here then passing role to service layer
	//We will create this method to track newRole Role coming from our custom entity.Role
	@PostMapping({"/createNewRole"})
	public Role createNewRole(@RequestBody Role role) {
		return roleService.createNewRole(role);
	}
	
}

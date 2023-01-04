package com.example.demo.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dao.RoleDao;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private RoleDao roleDao;
	
	@PostMapping({"/registerNewUser"})
	public User registerNewUser(@RequestBody User user) {
		return userDao.save(user);
	}
	
	
	//This methods will help us every time when we initialise our  application
	//it will automatically insert data to our tables
	public void initRolesAndUser() {
		Role adminRole = new Role();
		adminRole.setRolename("Admin");
		adminRole.setRoledescription("Admin role");
		roleDao.save(adminRole);
		
		Role userRole = new Role();
		userRole.setRolename("User");
		userRole.setRoledescription("Default role for newly created users");
		roleDao.save(userRole);
		
		User adminUser = new User();
		adminUser.setUserFirstName("admin");
		adminUser.setUserLastName("admin");
		adminUser.setUserName("admin123");
		adminUser.setUserPassword("admin@pass");
		
		//Created setname by adminRoles then we are passing to it adminRole object that we created
		Set<Role> adminRoles = new HashSet<>();
		
		adminRoles.add(adminRole);
		adminUser.setRole(adminRoles);
		userDao.save(adminUser);
		
		
		User user = new User();
		user.setUserFirstName("firuz");
		user.setUserLastName("chamarov");
		user.setUserName("firuz123");
		user.setUserPassword("firuz1999");
		
		//Created setname by adminRoles then we are passing to it adminRole object that we created
		Set<Role> userRoles = new HashSet<>();
		
		userRoles.add(userRole);
		user.setRole(userRoles);
		userDao.save(user);
	}
}

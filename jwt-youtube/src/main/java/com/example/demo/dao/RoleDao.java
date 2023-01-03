package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Role;


//Here we are extending crudrepository and inside <> we are saying use Role class
//and we already have giving in role class role name as id and giving String inside <> 
@Repository
public interface RoleDao extends CrudRepository<Role, String> {
	
}

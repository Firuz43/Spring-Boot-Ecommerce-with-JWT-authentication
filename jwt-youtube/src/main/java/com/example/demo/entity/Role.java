package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Role {
	
	//We will give it id then our role name becomes an identifier
	@Id
	private String rolename;
	private String roledescription;
	
	
	public String getRolename() {
		return rolename;
	}
	
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getRoledescription() {
		return roledescription;
	}
	public void setRoledescription(String roledescription) {
		this.roledescription = roledescription;
	}
	
	
}

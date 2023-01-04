package com.example.demo.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class User {
	
	@Id
	private String userName;
	private String userFirstName;
	private String userLastName;
	private String userPassword;
	
	
	//This field is used to make connection between user and role table
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	
	//Here spring boot will automatically create third table by name USER_ROLE 
	//and inside it it will create USER_ID an ROLE_ID columns
	@JoinTable(name = "USER_ROLE",
		joinColumns = {
			@JoinColumn(name = "USER_ID")
		},
		inverseJoinColumns = {
			@JoinColumn(name = "ROLE_ID")
			}
	)
	private Set<Role> role;


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserFirstName() {
		return userFirstName;
	}


	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}


	public String getUserLastName() {
		return userLastName;
	}


	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public Set<Role> getRole() {
		return role;
	}


	public void setRole(Set<Role> role) {
		this.role = role;
	}
	
	
	
}

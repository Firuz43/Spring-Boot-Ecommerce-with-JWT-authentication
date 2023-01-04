package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;


//Here we are extending CrudRepository and giving it our custom User and String because
//in Our Entity firstName is string and has @Id annotation
@Repository
public interface UserDao extends CrudRepository<User, String> {

}

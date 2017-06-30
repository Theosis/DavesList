package com.jdpaley.repositories;

import org.springframework.stereotype.Repository;

import com.jdpaley.models.User;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	public User findByName(String name);

}

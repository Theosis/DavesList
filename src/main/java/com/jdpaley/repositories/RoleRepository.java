package com.jdpaley.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jdpaley.models.UserRole;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface RoleRepository extends CrudRepository<UserRole, Long> {
	
	@Query("select a.role from UserRole a, User b where b.name=?1 and a.uid=b.uid")
	public List<String> findRoleByName(String name);
}

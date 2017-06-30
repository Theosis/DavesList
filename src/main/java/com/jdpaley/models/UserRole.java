package com.jdpaley.models;

import javax.persistence.*;

@Entity
@Table(name="role")
public class UserRole {
	
	@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="rid")
	private Long rid;
	
	@Column(name="uid")
	private Long uid;
	
	private String role;

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Long getRid() {
		return rid;
	}
	
}

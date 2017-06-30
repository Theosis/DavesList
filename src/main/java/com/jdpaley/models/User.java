package com.jdpaley.models;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "user")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
		@GeneratedValue
		@Column(name="uid")
	private Long uid;
	
	private String name;
	private String pwd;
	private String email;
	private int enabled;
	
	public User() {}
	
	public User(User u) {
		this.uid = u.uid;
		this.name = u.name;
		this.pwd = u.pwd;
		this.email = u.email;
		this.enabled = u.enabled;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public Long getUid() {
		return uid;
	}
	
}

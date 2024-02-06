package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer adminId;
	 private String username;
	 private String password;
	 
	 
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(Integer adminId, String username, String password) {
		super();
		this.adminId = adminId;
		this.username = username;
		this.password = password;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", username=" + username + ", password=" + password + "]";
	}
	 
	 
}

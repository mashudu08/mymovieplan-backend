package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BankAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accountId;
	private Integer userId;
	private String username;
	private String password;
	private Integer amount;
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BankAccount(Integer accountId, Integer userId, String username, String password, Integer amount) {
		super();
		this.accountId = accountId;
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.amount = amount;
	}
	
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", userId=" + userId + ", username=" + username + ", password="
				+ password + ", amount=" + amount + "]";
	}

	
}

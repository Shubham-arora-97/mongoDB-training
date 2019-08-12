package com.training.mongoDb.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(component = "tusers")
public class users {
	@Id
	private int id;
	private String name;
	private String password;
	private String email;
	private BigInteger contact;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BigInteger getContact() {
		return contact;
	}
	public users(String name, String password, String email, BigInteger contact) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.contact = contact;
	}
	public void setContact(BigInteger contact) {
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}

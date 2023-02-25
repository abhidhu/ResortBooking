package com.resort.booking.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

	@Id
	private int id;

	private String email;
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int id,String email, String password) {
		super();
		this.id=id;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [email=" + email + ", password=" + password + "]";
	}

}

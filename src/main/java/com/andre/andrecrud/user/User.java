package com.andre.andrecrud.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
    @Id
	private String id;
	private String name;
	private String email;
	private String birthday;
	private String idTeam;
	
	public User() {}
	
	public User(String id, String name, String idTeam) {
		super();
		this.id = id;
		this.name = name;
		this.idTeam = idTeam;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getIdTeam() {
		return idTeam;
	}
	public void setIdTeam(String idTeam) {
		this.idTeam = idTeam;
	}
}

package com.example.newapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class RoleClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleid;
	private String rolename;

	
		
	
	@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="userid")
	  private UserClass user;
	  
	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public UserClass getUser() {
		return user;
	}

	public void setUser(UserClass user) {
		this.user = user;
	}

}

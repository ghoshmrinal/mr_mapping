package com.example.newapp.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class UserClass 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int userid;
	   private String username;
	   private String password;
	   private String email;
	   
	   
	  /* @ManyToOne(cascade = CascadeType.ALL)
	   @JoinColumn(name="role_id")*/
	   @OneToMany(mappedBy = "user")
	   private Set<RoleClass> roles;
	   
	   
	
	public Set<RoleClass> getRoles() {
		return roles;
	}
	public void setRoles(Set<RoleClass> roles) {
		this.roles = roles;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	   

}

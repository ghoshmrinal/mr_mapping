package com.example.newapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.newapp.model.RoleClass;
import com.example.newapp.model.UserClass;
import com.example.newapp.repositry.RoleClassRepositry;
import com.example.newapp.repositry.UserClassRepositry;
@RestController
@RequestMapping("secure/rest")
public class AdminControllerClass {

	
	@Autowired
	private UserClassRepositry userrepo;
	
	@Autowired
	private RoleClassRepositry rolerepo;
	
	@Autowired
	private BCryptPasswordEncoder passwordeno;
	
	
	@PostMapping("/admin/add")
    public String addUserByAdmin(@RequestBody UserClass user)
    {
		String passd=user.getPassword();
		String encopwd=passwordeno.encode(passd);
		user.setPassword(encopwd);
		user.setUserid(user.getUserid());
		user.setEmail(user.getEmail());
		user.setUsername(user.getUsername());
		
		user.getRoles().forEach(roles->
		{
			RoleClass role=new RoleClass();
			role.setRoleid(roles.getRoleid());
			role.setRolename(roles.getRolename());
			role.setUser(user);
			rolerepo.save(role);
		});
		user.setRoles(user.getRoles());
		userrepo.save(user);
    	return "user add successfully"; 
    }
}

package com.example.newapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfigclass extends WebSecurityConfigurerAdapter
{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		 http.csrf().disable();
	}
	

	@Bean
    public BCryptPasswordEncoder encodepassword()
    {
    	return new BCryptPasswordEncoder();
    }

	
}

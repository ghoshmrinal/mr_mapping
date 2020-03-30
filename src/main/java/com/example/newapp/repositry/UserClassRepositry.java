package com.example.newapp.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.newapp.model.UserClass;

@Repository
public interface UserClassRepositry  extends JpaRepository<UserClass, Integer>
{

}


	

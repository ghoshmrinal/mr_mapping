package com.example.newapp.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.newapp.model.RoleClass;

@Repository
public interface RoleClassRepositry extends JpaRepository<RoleClass, Integer>
{

}

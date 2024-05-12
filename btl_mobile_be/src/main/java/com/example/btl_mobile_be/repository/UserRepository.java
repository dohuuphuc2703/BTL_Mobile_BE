package com.example.btl_mobile_be.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.btl_mobile_be.model.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

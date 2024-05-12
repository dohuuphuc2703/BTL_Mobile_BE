package com.example.btl_mobile_be.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.btl_mobile_be.model.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}

package com.example.btl_mobile_be.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.btl_mobile_be.model.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>{

}

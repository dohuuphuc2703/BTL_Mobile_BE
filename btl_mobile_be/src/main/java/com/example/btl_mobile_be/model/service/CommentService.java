package com.example.btl_mobile_be.model.service;

import java.util.List;

import com.example.btl_mobile_be.model.entity.Comment;

public interface CommentService {
	Comment createComment(Comment comment);
	Comment updateComment(int id, Comment comment);
	Comment getCommentById(int id);
	boolean deleteComment(int id);
	List<Comment> getAllComment();
}

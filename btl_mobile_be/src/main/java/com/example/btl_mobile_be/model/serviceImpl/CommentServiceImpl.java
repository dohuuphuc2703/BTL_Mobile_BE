package com.example.btl_mobile_be.model.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.btl_mobile_be.model.entity.Comment;
import com.example.btl_mobile_be.model.service.CommentService;
import com.example.btl_mobile_be.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService{
	
	private CommentRepository commentRepository;
	
	@Override
	public Comment createComment(Comment comment) {
		// TODO Auto-generated method stub
		return commentRepository.save(comment);
	}

	@Override
	public Comment updateComment(int id, Comment comment) {
		// TODO Auto-generated method stub
		comment.setId(id);
		return commentRepository.save(comment);
	}

	@Override
	public Comment getCommentById(int id) {
		// TODO Auto-generated method stub
		return commentRepository.findById(id).orElse(null);
	}

	@Override
	public boolean deleteComment(int id) {
		// TODO Auto-generated method stub
		commentRepository.deleteById(id);
		return true;
	}

	@Override
	public List<Comment> getAllComment() {
		// TODO Auto-generated method stub
		return commentRepository.findAll();
	}

}

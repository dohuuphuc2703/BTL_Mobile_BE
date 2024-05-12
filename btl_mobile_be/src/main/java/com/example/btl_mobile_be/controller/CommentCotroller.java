package com.example.btl_mobile_be.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.btl_mobile_be.model.entity.Comment;
import com.example.btl_mobile_be.model.service.CommentService;

@RestController
@RequestMapping("/comment")
public class CommentCotroller {
	@Autowired
    private CommentService commentService;
	
	@PostMapping
    public Comment createComment(@RequestBody Comment comment) {
        return commentService.createComment(comment);
    }

    @GetMapping
    public List<Comment> getAllComment() {
        return commentService.getAllComment();
    }

    @GetMapping("/{id}")
    public Comment getCommentById(@PathVariable int id) {
        return commentService.getCommentById(id);
    }

    @PutMapping("/{id}")
    public Comment updateComment(@PathVariable int id, @RequestBody Comment comment) {
        return commentService.updateComment(id, comment);
    }

    @DeleteMapping("/{id}")
    public boolean deleteComment(@PathVariable int id) {
    	return commentService.deleteComment(id);
    }
}

package com.example.btl_mobile_be.model.service;

import java.util.List;

import com.example.btl_mobile_be.model.entity.Post;

public interface PostService {
	Post createPost(Post post);
	Post updatePost(int id, Post post);
	Post getPostById(int id);
	boolean deletePost(int id);
	List<Post> getAllPost();
}

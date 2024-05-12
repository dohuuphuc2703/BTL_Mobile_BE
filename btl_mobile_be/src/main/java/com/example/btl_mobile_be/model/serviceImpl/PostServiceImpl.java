package com.example.btl_mobile_be.model.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.btl_mobile_be.model.entity.Post;
import com.example.btl_mobile_be.model.service.PostService;
import com.example.btl_mobile_be.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public Post createPost(Post post) {
		// TODO Auto-generated method stub
		return postRepository.save(post);
	}

	@Override
	public Post updatePost(int id, Post post) {
		// TODO Auto-generated method stub
		post.setId(id);
		return postRepository.save(post);
	}

	@Override
	public Post getPostById(int id) {
		// TODO Auto-generated method stub
		return postRepository.findById(id).orElse(null);
	}

	@Override
	public boolean deletePost(int id) {
		// TODO Auto-generated method stub
		postRepository.deleteById(id);
		return true;
	}

	@Override
	public List<Post> getAllPost() {
		// TODO Auto-generated method stub
		return postRepository.findAll();
	}
	
}

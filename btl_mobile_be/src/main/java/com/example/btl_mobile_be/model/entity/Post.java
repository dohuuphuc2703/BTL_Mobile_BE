package com.example.btl_mobile_be.model.entity;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column( nullable = true)
	private String caption;
	
	private LocalDateTime creatAt;
	
	private int likeCount;
	
	@OneToMany(mappedBy = "post")
	@Column( nullable = true)
	private List<Image> image;
	
	@OneToMany(mappedBy = "post")
	@Column( nullable = true)
	private List<Comment> comment;
	
	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}

	@ManyToOne
	@JoinColumn(name = "familytree_id")
	private FamilyTree familytree;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public LocalDateTime getCreatAt() {
		return creatAt;
	}

	public void setCreatAt(LocalDateTime creatAt) {
		this.creatAt = creatAt;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public List<Image> getImage() {
		return image;
	}

	public void setImage(List<Image> image) {
		this.image = image;
	}

	public FamilyTree getFamilyTree() {
		return familytree;
	}

	public void setFamilyTree(FamilyTree familytree) {
		this.familytree = familytree;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}

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
@Table(name = "familytree")
public class FamilyTree {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = true)
	private String title;
	
	@Column( nullable = true)
	private String address;
	
	private LocalDateTime creatAt;
	
	private LocalDateTime updateAt;
	
	private String creator;
	
	private String dynamicLink;
	
	private String published;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	@JsonBackReference
	private User user;
	
	@OneToMany(mappedBy = "familytree")
	private List<Event> event;
	
	@OneToMany(mappedBy = "familytree")
	private List<Album> album;
	
	@OneToMany(mappedBy = "familytree")
	private List<Post> post;
	
	@OneToMany(mappedBy = "familytree")
	private List<Generation> generation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDateTime getCreatAt() {
		return creatAt;
	}

	public void setCreatAt(LocalDateTime creatAt) {
		this.creatAt = creatAt;
	}

	public LocalDateTime getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(LocalDateTime updateAt) {
		this.updateAt = updateAt;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getDynamicLink() {
		return dynamicLink;
	}

	public void setDynamicLink(String dynamicLink) {
		this.dynamicLink = dynamicLink;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Event> getEvent() {
		return event;
	}

	public void setEvent(List<Event> event) {
		this.event = event;
	}

	public List<Generation> getGeneration() {
		return generation;
	}

	public void setGeneration(List<Generation> generation) {
		this.generation = generation;
	}

	public List<Album> getAlbum() {
		return album;
	}

	public void setAlbum(List<Album> album) {
		this.album = album;
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}
	
	
	
}


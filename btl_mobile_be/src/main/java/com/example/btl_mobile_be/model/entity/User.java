package com.example.btl_mobile_be.model.entity;
import java.util.List;

import jakarta.persistence.Column;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "full_name", nullable = true)
	private String fullName;
    
    @Column(nullable = true)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private String birthday;
    
    
    @Column(nullable = true)
	private String phone;
    
    @Column( nullable = true)
    private String gender;
    
    @Column( nullable = true)
	private String email;
    
    @Column( nullable = true)
    private String photoURL;
    
    @Column( nullable = true)
    private String address; 
    
    @Column(unique = true, nullable = false)
    private String username;
    
    @Column( nullable = false)
    private String password;
    
    @OneToMany(mappedBy = "user")
	private List<Post> post;
    
    @OneToMany(mappedBy = "user")
	private List<FamilyTree> familyTree;
    
    @OneToMany(mappedBy = "user")
	private List<Comment> comment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}

	public List<FamilyTree> getFamilyTree() {
		return familyTree;
	}

	public void setFamilyTree(List<FamilyTree> familyTree) {
		this.familyTree = familyTree;
	}

	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
    
    

}
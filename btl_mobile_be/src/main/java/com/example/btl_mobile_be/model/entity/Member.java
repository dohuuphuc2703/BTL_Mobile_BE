package com.example.btl_mobile_be.model.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;


@Entity
@Table(name = "member")
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "full_name", nullable = true)
	private String fullName;
	
	@Column(nullable = true)
	private String sex;
	
	@Column(nullable = true)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private String birthday;
	
	@Column( nullable = true)
	private String address;
	
	@Column(nullable = true)
	private String phone;
	
	@Column( nullable = true)
	private String email;
	
	@Column( nullable = true)
	private String photoURL;
	
	@Column(nullable = true)
	private String job;
	
	@Column(nullable = true)
	private String education;
	
	@Column(nullable = true)
	private int father;
	
	@Column(nullable = true)
	private int mother;
	
	@Column(name= "marital_status", nullable = true)
	private String maritalStatus;
	
	@Column(nullable = true)
	private int mate;
	
	@Column(name = "child_position", nullable = true)
	private int childPosition;
	
	@Column(name = "deal_date", nullable = true)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private String dealDate;
	
	@Column( nullable = true)
	private int longevity;
	
	@Column(nullable = true)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private String ngayGioAL;
	
	@ManyToOne
	@JoinColumn(name = "generation_id")
	@JsonBackReference
	private Generation generation;
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
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

	public String getDealDate() {
		return dealDate;
	}

	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getFather() {
		return father;
	}

	public void setFather(int father) {
		this.father = father;
	}

	public int getMother() {
		return mother;
	}

	public void setMother(int mother) {
		this.mother = mother;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMate() {
		return mate;
	}

	public void setMate(int mate) {
		this.mate = mate;
	}

	public int getChildPosition() {
		return childPosition;
	}

	public void setChildPosition(int childPosition) {
		this.childPosition = childPosition;
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

	public int getLongevity() {
		return longevity;
	}

	public void setLongevity(int longevity) {
		this.longevity = longevity;
	}

	public String getNgayGioAL() {
		return ngayGioAL;
	}

	public void setNgayGioAL(String ngayGioAL) {
		this.ngayGioAL = ngayGioAL;
	}


	public Generation getGeneration() {
		return generation;
	}

	public void setGeneration(Generation generation) {
		this.generation = generation;
	}
	
	
	
}

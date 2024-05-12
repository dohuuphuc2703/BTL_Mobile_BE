package com.example.btl_mobile_be.model.entity;

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
@Table(name = "generation")
public class Generation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(unique = true)
	private int name;
	
	@ManyToOne
	@JoinColumn(name = "familytree_id")
	@JsonBackReference
	private FamilyTree familytree;
	
	@OneToMany(mappedBy = "generation")
	private List<Member> member;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public FamilyTree getFamilytree() {
		return familytree;
	}

	public void setFamilytree(FamilyTree familytree) {
		this.familytree = familytree;
	}

	public List<Member> getMember() {
		return member;
	}

	public void setMember(List<Member> member) {
		this.member = member;
	}
	
}

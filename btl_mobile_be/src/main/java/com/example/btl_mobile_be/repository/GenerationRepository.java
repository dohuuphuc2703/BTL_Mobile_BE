package com.example.btl_mobile_be.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.btl_mobile_be.model.entity.Generation;

public interface GenerationRepository  extends JpaRepository<Generation, Integer>{
	List<Generation> findAllByOrderByNameAsc();
}

package com.example.btl_mobile_be.model.service;

import java.util.List;

import com.example.btl_mobile_be.model.entity.FamilyTree;
import com.example.btl_mobile_be.model.entity.Generation;

public interface GenerationService {
	Generation createGeneration(Generation generation);
	Generation getGenerationId(int id);
	boolean deleteGeneration(int id);
	List<Generation> getAllGeneration();
	Generation addFirstGeneration(int id);
	boolean deleteFirstGeneration(int id);
}

package com.example.btl_mobile_be.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.btl_mobile_be.model.entity.FamilyTree;
import com.example.btl_mobile_be.model.entity.Generation;
import com.example.btl_mobile_be.model.entity.Member;
import com.example.btl_mobile_be.model.service.GenerationService;


@RestController
@RequestMapping("/generation")
public class GenerationController {
	@Autowired
    private GenerationService generationService;
	
	@PostMapping
    public Generation createGeneration(@RequestBody Generation generation) {
        return generationService.createGeneration(generation);
    }
	
	 @GetMapping
	    public List<Generation> getAllMember() {
	        return generationService.getAllGeneration();
	    }
	
	@GetMapping("/{id}")
    public Generation getGenerationById(@PathVariable int id) {
        return generationService.getGenerationId(id);
    }
	
	@DeleteMapping("/{id}")
    public boolean deleteGeneration(@PathVariable int id) {
    	return generationService.deleteGeneration(id);
    }
	
	@PostMapping("/addfirst/{id}")
    public Generation addFirstGeneration(@PathVariable int id) {
        return generationService.addFirstGeneration(id);
    }
	
	@DeleteMapping("/deletefirst/{id}")
    public boolean deleteFirstGeneration(@PathVariable int id) {
        return generationService.deleteFirstGeneration(id);
    }
}

package com.example.btl_mobile_be.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.btl_mobile_be.model.entity.FamilyTree;
import com.example.btl_mobile_be.model.service.FamilyTreeService;

@RestController
@RequestMapping("/familyTree")
public class FamilyTreeCotroller {
	@Autowired
    private FamilyTreeService familyTreeService;
	
	@PostMapping
    public FamilyTree createFamilyTree(@RequestBody FamilyTree familyTree) {
        return familyTreeService.createFamilyTree(familyTree);
    }

    @GetMapping
    public List<FamilyTree> getAllFamilyTree() {
        return familyTreeService.getAllFamilyTree();
    }

    @GetMapping("/{id}")
    public FamilyTree getFamilyTreeById(@PathVariable int id) {
        return familyTreeService.getFamilyTreeById(id);
    }

    @PutMapping("/{id}")
    public FamilyTree updateFamilyTree(@PathVariable int id, @RequestBody FamilyTree familyTree) {
        return familyTreeService.updateFamilyTree(id, familyTree);
    }

    @DeleteMapping("/{id}")
    public boolean deleteFamilyTree(@PathVariable int id) {
    	return familyTreeService.deleteFamilyTree(id);
    }

}

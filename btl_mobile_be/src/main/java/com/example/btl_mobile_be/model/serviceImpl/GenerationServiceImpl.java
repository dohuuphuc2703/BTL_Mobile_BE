package com.example.btl_mobile_be.model.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.btl_mobile_be.model.entity.FamilyTree;
import com.example.btl_mobile_be.model.entity.Generation;
import com.example.btl_mobile_be.model.entity.Member;
import com.example.btl_mobile_be.model.service.GenerationService;
import com.example.btl_mobile_be.repository.FamilyTreeRepository;
import com.example.btl_mobile_be.repository.GenerationRepository;
import com.example.btl_mobile_be.repository.MemberRepository;

import jakarta.transaction.Transactional;
@Service
public class GenerationServiceImpl implements GenerationService{
	
	@Autowired
	private GenerationRepository generationRepository;
	
	@Autowired
    private FamilyTreeRepository familyTreeRepository;
	
	@Autowired
    private MemberRepository memberRepository;
	
	@Override
	public Generation createGeneration(Generation generation) {
		// TODO Auto-generated method stub
		return generationRepository.save(generation);
	}

	@Override
	public Generation getGenerationId(int id) {
		// TODO Auto-generated method stub
		return generationRepository.findById(id).orElse(null);	
				}

	@Override
	public boolean deleteGeneration(int id) {
		// TODO Auto-generated method stub
		generationRepository.deleteById(id);
		return true;
	}

	@Override
	public List<Generation> getAllGeneration() {
		// TODO Auto-generated method stub
		return generationRepository.findAllByOrderByNameAsc();
	}

	@Override
	public Generation addFirstGeneration(int id) {
        Generation generation = new Generation();
        FamilyTree familyTree = familyTreeRepository.findById(id).orElse(null);
        generation.setFamilytree(familyTree);
        generation.setName(1);
        List<Generation> generations = familyTree.getGeneration();
        for (Generation gen : generations) {
            int newName = gen.getName() + 1;
            gen.setName(newName);
            
        }
        generationRepository.saveAll(generations);
        return  generationRepository.save(generation);
    }

	@Override
	public boolean deleteFirstGeneration(int id) {
		FamilyTree familyTree = familyTreeRepository.findById(id).orElse(null);
	    if (familyTree != null) {
	        // Tìm thế hệ đầu tiên có name=1
	        List<Generation> generations = familyTree.getGeneration();
	        Generation firstGeneration = null;
	        Generation secondGeneration = null;
	        for (Generation gen : generations) {
	            if (gen.getName() == 1) {
	                firstGeneration = gen;
	            } else if (gen.getName() == 2) {
	                secondGeneration = gen;
	            }
	        }
	        if (firstGeneration != null) {
	            // Kiểm tra số lượng thành viên của thế hệ thứ hai
	            if (secondGeneration != null &&  secondGeneration.getMember().size() > 1) {
	                return false;
	            } else {
	            	List<Member> firstGenerationMembers = firstGeneration.getMember();
	                memberRepository.deleteAll(firstGenerationMembers);
	            	
	            	generations.remove(firstGeneration);
	                generationRepository.delete(firstGeneration);
	                for (Generation gen : generations) {
	                    if (gen.getName() > 1) {
	                        int newName = gen.getName() - 1;
	                        gen.setName(newName);
	                    }
	                }
	                generationRepository.saveAll(generations);
	                return true;
	            }
	        } else {
	            // Không tìm thấy thế hệ đầu tiên
	            return false;
	        }
	    }
	    return false; // hoặc xử lý lỗi tùy theo logic của bạn
	}

}

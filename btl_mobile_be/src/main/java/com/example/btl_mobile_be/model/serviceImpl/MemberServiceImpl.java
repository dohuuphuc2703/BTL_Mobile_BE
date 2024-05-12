package com.example.btl_mobile_be.model.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.btl_mobile_be.model.entity.Generation;
import com.example.btl_mobile_be.model.entity.Member;
import com.example.btl_mobile_be.model.service.MemberService;
import com.example.btl_mobile_be.repository.GenerationRepository;
import com.example.btl_mobile_be.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private GenerationRepository generationRepository;
	
	@Override
	public Member createMember(Member member) {
        return memberRepository.save(member);
    }
	@Override
	public Member updateMember(int id, Member member) {
		Member existingMember = memberRepository.findById(id).orElseThrow();
	    if (member.getFullName() != null) {
	        existingMember.setFullName(member.getFullName());
	    }
	    if (member.getDealDate() != null) {
	        existingMember.setDealDate(member.getDealDate());
	    }
	    if (member.getBirthday() != null) {
	        existingMember.setBirthday(member.getBirthday());
	    }
	    if (member.getFather() != 0) {
	        existingMember.setFather(member.getFather());
	    }
	    if (member.getMother() != 0) {
	        existingMember.setMother(member.getMother());
	    }
	    if (member.getPhone() != null) {
	        existingMember.setPhone(member.getPhone());
	    }
	    if (member.getMaritalStatus() != null) {
	        existingMember.setMaritalStatus(member.getMaritalStatus());
	    }
	    if (member.getJob() != null) {
	existingMember.setJob(member.getJob());
	    }
	    if (member.getEducation() != null) {
	        existingMember.setEducation(member.getEducation());
	    }
	    if (member.getEmail() != null) {
	        existingMember.setEmail(member.getEmail());
	    }
	    if (member.getMate() != 0) {
	        existingMember.setMate(member.getMate());
	    }
	    if (member.getChildPosition() != 0) {
	        existingMember.setChildPosition(member.getChildPosition());
	    }
	    if (member.getPhotoURL() != null) {
	        existingMember.setPhotoURL(member.getPhotoURL());
	    }
	    if (member.getAddress() != null) {
	        existingMember.setAddress(member.getAddress());
	    }
	    if (member.getLongevity() != 0) {
	        existingMember.setLongevity(member.getLongevity());
	    }
	    if (member.getNgayGioAL() != null) {
	        existingMember.setNgayGioAL(member.getNgayGioAL());
	    }
	    if (member.getGeneration() != null) {
	        existingMember.setGeneration(member.getGeneration());
	    }
	    return memberRepository.save(existingMember);
    }
	@Override
	public boolean deleteMember(int id) {
        memberRepository.deleteById(id);
        return true;
    }
	@Override
	public Member getMemberById(int id) {
		return memberRepository.findById(id).orElse(null);
	}
	@Override
	public List<Member> getAllMember() {
        return memberRepository.findAll();
    }
	@Override
	public List<Member> searchMemberByFullName(String fullName) {
        return memberRepository.findByFullNameContaining(fullName);
    }
	
	@Override
	public List<Member> getMembersByGenerationId(int generationId) {
	    // Tìm thế hệ dựa trên ID
	    Generation generation = generationRepository.findById(generationId).orElse(null);
	    if (generation != null) {
	        return generation.getMember();
	    } else {
	        return new ArrayList<>();
	    }
	}
	
	@Override
	public Member getMemberWife(int id) {
	    Member husband = memberRepository.findById(id).orElse(null);
	    int idwife = husband.getMate();
	    return memberRepository.findById(idwife).orElse(null);
	}
	
	public List<Member> getMemberChild(int id) {
	    // Tìm thế hệ dựa trên ID
		List<Member> members = memberRepository.findByFather(id);
        return members;
	}
}
	
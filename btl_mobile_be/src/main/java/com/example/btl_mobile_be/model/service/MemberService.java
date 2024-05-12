package com.example.btl_mobile_be.model.service;

import java.util.List;

import com.example.btl_mobile_be.model.entity.Member;

public interface MemberService {
	Member createMember(Member member);
	Member updateMember(int id, Member member);
	Member getMemberById(int id);
	boolean deleteMember(int id);
	List<Member> getAllMember();
	List<Member> searchMemberByFullName(String fullName);
	List<Member> getMembersByGenerationId(int generationId);
	Member getMemberWife(int id);
	List<Member> getMemberChild(int id);
}

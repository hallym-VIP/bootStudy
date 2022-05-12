package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.jpa.member;

public interface memberRepository extends JpaRepository<member, Long> {
		
	
}

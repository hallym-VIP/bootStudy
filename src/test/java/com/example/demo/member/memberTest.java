package com.example.demo.member;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.jpa.User;
import com.example.demo.jpa.member;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.memberRepository;

@SpringBootTest
public class memberTest {
	
	@Autowired
	memberRepository repo;
	@Autowired
	UserRepository userRepo;
	@Test
	void test() {
		member mem = new member();
		mem.setName("name");
		
		repo.save(mem);
		repo.findAll().forEach(System.out::println);
		
		User user = new User();
		user.setName("kim");
		
		
		userRepo.save(user);
		userRepo.findAll().forEach(System.out::println);
	}
}

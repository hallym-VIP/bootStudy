package com.example.demo.Listener;

import java.time.LocalDateTime;

import javax.persistence.PrePersist;

import com.example.demo.jpa.User;
import com.example.demo.jpa.member;

public class memberListener {
		@PrePersist
		public void pre(Object obj) {
			if(obj instanceof member) {
				
				System.out.println("--------------------------------------------------------------------");
				((member)obj).setCreatedAt(LocalDateTime.now());
			}
			if(obj instanceof User) {
				((User)obj).setCreatedAt(LocalDateTime.now().minusDays(2));
			}
		}
}

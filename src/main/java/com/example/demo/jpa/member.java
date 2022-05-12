package com.example.demo.jpa;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.example.demo.Listener.memberListener;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@EntityListeners(value = memberListener.class)
public class member implements DateCh{
	  @Id
	  @GeneratedValue
	  private Long id;
	  
	  @Column
	  private String name;

	    @Column
	    private int age;

	    private LocalDateTime createdAt;
	    private LocalDateTime updatedAt;
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		
		
		public LocalDateTime getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}

		public LocalDateTime getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(LocalDateTime updatedAt) {
			this.updatedAt = updatedAt;
		}

		@Override
		public String toString() {
			return "이름은 : "+name +"나이는 : "+age+" 번호는 :"+id+" insert가 실행 된 시간: "+createdAt;
		}
	    
}

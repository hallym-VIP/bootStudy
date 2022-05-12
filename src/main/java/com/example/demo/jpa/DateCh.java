package com.example.demo.jpa;

import java.time.LocalDateTime;

public interface DateCh {

		LocalDateTime getCreatedAt();
		LocalDateTime getUpdatedAt();
		
		void setCreatedAt(LocalDateTime time);
		void setUpdatedAt(LocalDateTime time);
		
}

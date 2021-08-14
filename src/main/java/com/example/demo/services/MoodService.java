package com.example.demo.services;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repos.MoodRepository;
import com.example.demo.entity.*;
@Service
public class MoodService {
	
	@Autowired
	private MoodRepository repo;
	
	
	public List<Mood> findAll() {
		return this.repo.findAll();
	}
	
	public Mood add(Mood entity) {
		
		return this.repo.save(entity);
	}

	public List<Mood> findByMood(int mood) {
		return this.repo.findByMood(mood);
	}

	public List<Mood> findByHashTag(String hashTag) {
		return this.repo.findByHashTagContaining(hashTag);
	}

	public List<Mood> findByDueDate(Date dueDate) {
		return this.repo.findByDueDateAfter(dueDate);
	}

	
	
}

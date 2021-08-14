package com.example.demo.repos;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Mood;

@Repository
public interface MoodRepository extends JpaRepository<Mood, Integer> {

	List<Mood> findByMood(int mood);

	List<Mood> findByHashTagContaining(String hashTag);

	List<Mood> findByDueDateAfter(Date dueDate);

	
}

package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import com.example.demo.entity.*;
import com.example.demo.services.MoodService;
//import com.example.demo.services.RestaurantService;

@CrossOrigin(origins = "*")
@RestController
public class MoodController {
	@Autowired
	private MoodService service;
	@GetMapping(path = "/moods")
	public List<Mood> findAll(){
		return this.service.findAll();
	}
	@GetMapping(path = "/bymood/{id}")
	public List<Mood> findByMood(@PathVariable("id") int pid){
		return this.service.findByMood(pid);
	}
	@GetMapping(path = "/hashtag/{tag}")
	public List<Mood> findByHashTag(@PathVariable("tag") String hashTag){
		return this.service.findByHashTag(hashTag);
	}
	@GetMapping(path = "/date/{date}")
	public List<Mood> findByDueDate(@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dueDate){
		return this.service.findByDueDate(dueDate);
	}
	@PostMapping(path = "/user")
	public ResponseEntity <Mood> add(@RequestBody Mood entity){
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		 Date now = new Date(); 
		 entity.setDueDate(now);
		 Mood addedEntity = this.service.add(entity);
		 return ResponseEntity.status(HttpStatus.CREATED).body(addedEntity);
		 
	}
	
	
}

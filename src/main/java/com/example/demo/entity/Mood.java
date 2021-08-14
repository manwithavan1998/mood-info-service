package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
@Entity
@Table(name = "Moods")

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Mood {
	public Mood() {
		super();
		// TODO Auto-generated constructor stub
	}
//	
//	
//	
//
//
//	public Mood(int id, String email, int mood, String hashTag, String justification, Date dueDate) {
//		super();
//		this.id = id;
//		this.email = email;
//		this.mood = mood;
//		this.hashTag = hashTag;
//		this.justification = justification;
//		this.dueDate = dueDate;
//	}





	public Date getDueDate() {
		return dueDate;
	}


	public void setDueDate(Date now) {
		this.dueDate = now;
	}





	public Mood(String email, int mood, String hashTag, String justification, Date dueDate) {
		this.email = email;
		this.mood = mood;
		this.hashTag = hashTag;
		this.justification = justification;
		this.dueDate = dueDate;
	}
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id=0;
	private String email;
	private int mood;
	private String hashTag;
	private String justification;
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date dueDate;
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHashTag() {
		return hashTag;
	}
	public void setHashTag(String hashTag) {
		this.hashTag = hashTag;
	}
	public String getJustification() {
		return justification;
	}
	public void setJustification(String justification) {
		this.justification = justification;
	}
	public int getMood() {
		return mood;
	}
	public void setMood(int mood) {
		this.mood = mood;
	}

}

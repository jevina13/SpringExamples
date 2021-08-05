package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentInformation")
public class Student {
	
	@Id
	@Column(name="StudentId")
	private int studentId;
	
	@Column(name="StudentName")
	private String name;
	@Column(name="Gender")
	private String gender;
	@Column(name="City")
	private String city;
	
	
	public Student(int studentId, String name, String gender, String city) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.gender = gender;
		this.city = city;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	

}

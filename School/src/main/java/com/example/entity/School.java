package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_table")
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String student_name;
	private String school_name;
	private char section_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public char getSection_name() {
		return section_name;
	}
	public void setSection_name(char section_name) {
		this.section_name = section_name;
	}
	public School(int id, String student_name, String school_name, char section_name) {
		super();
		this.id = id;
		this.student_name = student_name;
		this.school_name = school_name;
		this.section_name = section_name;
	}
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "School [id=" + id + ", student_name=" + student_name + ", school_name=" + school_name
				+ ", section_name=" + section_name + "]";
	}
	

}



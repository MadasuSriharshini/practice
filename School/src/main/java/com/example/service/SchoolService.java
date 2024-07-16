package com.example.service;

import java.util.List;

import com.example.entity.School;

public interface SchoolService  {
	public String savestudent(School school);
	public School updatestudent(int id,School school );
	
	//public String updatestudent(int id,School school)
	
	// by id or by variable names we can update
	public  void deletestudent(int id);
	public List<School> getAllstudents();
	//  to get all details
	//for specific person by id we get
	//public String getByIdstudent(int id)
	//or public string getstudentById(int id)
	
	

	
}

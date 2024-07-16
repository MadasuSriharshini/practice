package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.School;
import com.example.service.SchoolService;

@RestController
@RequestMapping("/api")
public class SchoolController {
	@Autowired
	private SchoolService service;
	@PostMapping("/save")
	public ResponseEntity<String>savestudent(@RequestBody School school){
		String savestudent=service.savestudent(school);
		return  ResponseEntity.status(HttpStatus.CREATED).body(savestudent);
		
	}
		
		@PutMapping("/update/{id}")
		public ResponseEntity <School> updatestudent(@PathVariable int id,@RequestBody School school)
	{
		School updatestudent = service.updatestudent(id, school);
			return ResponseEntity.status(HttpStatus.OK).body(updatestudent);
		}
		@DeleteMapping("/delete")
		public ResponseEntity<?> deletestudent(@PathVariable int id)
		{
			service.deletestudent(id);
			return ResponseEntity.status(HttpStatus.OK).body(deletestudent(id));
		}
		@GetMapping("/getById/{id}")
		
		public ResponseEntity<List<School>> getAllstudents() {
		List<School> student= service.getAllstudents();
		return ResponseEntity.status(HttpStatus.OK).body(student);
		
	}
}




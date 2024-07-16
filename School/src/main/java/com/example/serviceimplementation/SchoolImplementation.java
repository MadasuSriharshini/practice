package com.example.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.School;
import com.example.repository.Schoolrepo;
import com.example.service.SchoolService;
@Service
public class SchoolImplementation implements SchoolService {
	@Autowired
	private Schoolrepo repo;


	@Override
	public String savestudent(School school) {
		repo.save(school);
		return "saved";
	}

	@Override
	public School updatestudent(int id,School schl)  {
		//for entity to dto transfer beans is useful
		//School scl repo.findById(id).get();
		//BeanUtils.copyProperties(schl, scl);
		//return repo.save(scl);
		

		School school2 = repo.findById(id).get();
	if(school2 != null) {
		school2.setSchool_name(schl.getSchool_name());
		school2.setStudent_name(schl.getStudent_name());
			return repo.save(school2);
		}
		return null;
		
		
//			Optional<School>student1=repo.findById(id);
//			if(student1.isPresent()) 
//				
//			{
//				School student2=student1.get();
//				return student2;
//			}
//			return null;
			
		}
	
		// to display return type null we use this method
       //repo.findById(id);
		//return null;
	
		//or to display all details in return type if dto is present
		//Optional<School> school=repo.findById(id);
		//if(school.isPresent()) {
			//School school2=school.get();
			//BeanUtils.copyProperties(schl, school2);
			//School latestsave=repo.save(school2);
			
			//return latestsave;
			
		//}
		 //return schl;
		//Optional<School> school=repo.findById(id);
		//if(school.isPresent()) {
			//School schl2=school.get();
			//return schl2;
		//}
		//return null;
		
		
	

	@Override
	public void deletestudent(int id) {
		repo.deleteById(id);
		
		
	}

	@Override
	public List<School> getAllstudents() {
		repo.findAll();
		
		return null;
	}
	}

	
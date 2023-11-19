package com.boot.rest.servises;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boot.rest.Entity.Employer;
import com.boot.rest.dao.EmployerRepo;

@Component
public class EmployerServises {
	@Autowired
	private EmployerRepo repo;
	
	
	//get single emp 
	public Employer getEmp(int id) {
		Employer e = this.repo.findById(id);
		return e;
	}
	
	
	//get all emps
	public List<Employer> getAllEmps(){
		Iterable<Employer> findAll = this.repo.findAll();
		return (List<Employer>) findAll;
	}
	
	
	
	//adding emp
	public Employer addEmployer(Employer x) {
		return this.repo.save(x);
	}

	//deleting single emp
	public Employer delEmp(int id) {
		Employer e = this.repo.findById(id);
		this.repo.deleteById(id);
		return e;
	}
	
	//delete all emps
	public String delAll() {
		this.repo.deleteAll();
		return "Deleted all Employers";
	}
	
	
	//Update emp
	public Employer update(Employer e) {		
		return this.repo.save(e);
	}
	//Formate for adding Employer
//	{
//        "id": 53,
//        "name": "jjamnalal ji",
//        "department": "chor",
//        "skills": [
//            "python"
//        ],
//        "salary": 5,
//        "expInYears": 10.3
//    }
}

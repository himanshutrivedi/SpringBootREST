package com.boot.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.rest.Entity.Employer;
import com.boot.rest.servises.EmployerServises;

@RestController
public class MyController {
	@Autowired
	private EmployerServises servises;
	
	@GetMapping("/home")
	public String home() {
		return" Hey MOFASA";
	}
//	Getting single emp
	@GetMapping("/Employers/{id}")
	public Employer findEmp(@PathVariable("id") int id) {
		Employer e = this.servises.getEmp(id);
		return e;
	}
	
//  getting all emps	
	@GetMapping("/Employers")
	public List<Employer> givAllEmps(){
		 List<Employer> emps = this.servises.getAllEmps();		 		
		return emps;
	}
	
	
	
	
	//creating a emp
	@PostMapping("/Employers")
	public Employer createEmployer(@RequestBody Employer emp){
		this.servises.addEmployer(emp);
		return emp ;
	}
	
	//delete emp
	@DeleteMapping("/Employers/{id}")
	public Employer deleteEmp(@PathVariable("id")int id) {
		Employer emp = this.servises.delEmp(id);
		return emp;
		
	}
	
	//delete all
	@DeleteMapping("/Employers")
	public String deleteAll() {		
		return this.servises.delAll();
	}
	
	
	//update emp
	@PutMapping("/Employers/{id}")
	public Employer updatEmployer(@RequestBody Employer e) {
		return this.servises.update(e);
		
	}
	

}

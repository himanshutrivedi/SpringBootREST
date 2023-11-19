package com.boot.rest.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.boot.rest.Entity.Employer;
@Component
public interface EmployerRepo extends CrudRepository<Employer, Integer> {

	public Employer findById(int id);
	}

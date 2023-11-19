package com.boot.rest.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity(name = "employerTable")
public class Employer {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String department;
	private List<String> skills;
	private long salary;
	private double expInYears;
	
	
	
	public Employer() {
		
		super();
		// TODO Auto-generated constructor stub
	}



	public Employer(int id, String name, String department, List<String> skills, long salary, double expInYears) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.skills = skills;
		this.salary = salary;
		this.expInYears = expInYears;
	}



	@Override
	public String toString() {
		return "Employer [id=" + id + ", name=" + name + ", department=" + department + ", skills=" + skills
				+ ", salary=" + salary + ", expInYears=" + expInYears + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public List<String> getSkills() {
		return skills;
	}



	public void setSkills(List<String> skills) {
		this.skills = skills;
	}



	public long getSalary() {
		return salary;
	}



	public void setSalary(long salary) {
		this.salary = salary;
	}



	public double getExpInYears() {
		return expInYears;
	}



	public void setExpInYears(double expInYears) {
		this.expInYears = expInYears;
	}
	
	
	
	

}

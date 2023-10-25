package com.gonzalo.employeemanager.models.employee;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.gonzalo.employeemanager.models.TreeTeam;

public class Employee implements TreeTeam{
	
	//Cambio de prueba
	@NotEmpty
	@Size(min=1, max = 20)
	private String name;
	
	@NotEmpty
	@Size(min=1, max = 20)
	private String lastName;
	
	@NotNull
	@Past
	private LocalDate dateOfBirth;
	
	@NotNull
	@Max(20000)
	private Double salary;
	
	public static IEmployeeBuilder.Name builder(){
		return new EmployeeBuilder();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	
	
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean isTeam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String viewInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

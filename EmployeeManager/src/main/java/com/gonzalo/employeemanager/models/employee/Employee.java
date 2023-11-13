package com.gonzalo.employeemanager.models.employee;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.gonzalo.employeemanager.exceptions.InvalidTeamOperationException;
import com.gonzalo.employeemanager.models.TreeTeam;

public class Employee implements TreeTeam{
	
	//Cambio de prueba
	
	private Long id;
	
	private String name;
	
	private String lastName;
	
	private LocalDate dateOfBirth;
	
	private Double salary;
	
	
	protected Employee() {
		
	}
	public static IEmployeeBuilder.Name builder(){
		return new EmployeeBuilder();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	public void add(TreeTeam obj) throws InvalidTeamOperationException{
		throw new InvalidTeamOperationException("It must be added to a team type and not to an employee type");
	}

	@Override
	public void remove(TreeTeam obj) throws InvalidTeamOperationException{
		throw new InvalidTeamOperationException("It must be removed in an equipment type and not in an employee type");
	}

	@Override
	public Boolean isTeam() {
		return false;
	}

	@Override
	public String viewInfo() {
		return this.toString();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", salary=" + salary + "]";
	}
	
	
	
	
	
}

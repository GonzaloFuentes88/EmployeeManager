package com.gonzalo.employeemanager.models.employee;

import java.time.LocalDate;

import com.gonzalo.employeemanager.models.employee.IEmployeeBuilder.Build;
import com.gonzalo.employeemanager.models.employee.IEmployeeBuilder.DateOfBirth;
import com.gonzalo.employeemanager.models.employee.IEmployeeBuilder.LastName;
import com.gonzalo.employeemanager.models.employee.IEmployeeBuilder.Salary;

public class EmployeeBuilder 
	implements 
	IEmployeeBuilder.Name, 
	IEmployeeBuilder.LastName, 
	IEmployeeBuilder.DateOfBirth, 
	IEmployeeBuilder.Salary, 
	IEmployeeBuilder.Build{

	private Employee employee;
	
	public EmployeeBuilder() {
		this.employee = new Employee();
	}

	@Override
	public Employee build() {
		return this.employee;
	}

	@Override
	public Build salary(Double salary) {
		this.employee.setSalary(salary);
		return this;
	}

	@Override
	public Salary dateOfBirth(LocalDate dateOfBirth) {
		this.employee.setDateOfBirth(dateOfBirth);
		return this;
	}

	@Override
	public DateOfBirth lastName(String lastName) {
		this.employee.setLastName(lastName);
		return this;
	}

	@Override
	public LastName name(String name) {
		this.employee.setName(name);
		return this;
	}
	

}

package com.gonzalo.employeemanager.models.employee;

import java.time.LocalDate;

public interface IEmployeeBuilder {

	interface Name {
		LastName name(String name);
	}
	
	interface LastName {
		DateOfBirth lastName(String lastName);
	}
	interface DateOfBirth {
		Salary dateOfBirth(LocalDate dateOfBirth);
	}
	interface Salary {
		Build salary(Double salary);
	}
	
	interface Build{
		Employee build();
	}
}

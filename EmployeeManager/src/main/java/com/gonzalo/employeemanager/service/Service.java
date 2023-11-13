package com.gonzalo.employeemanager.service;

import java.util.List;

import com.gonzalo.employeemanager.exceptions.InvalidTeamOperationException;
import com.gonzalo.employeemanager.exceptions.NonExistent;

public interface Service<E> {
	
	E findOne(String identifier);
	
	List<E> findAll();
	
	void save(E element) throws InvalidTeamOperationException, NonExistent;
}

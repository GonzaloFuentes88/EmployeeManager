package com.gonzalo.employeemanager.service;

import java.util.List;

public interface Service<E> {
	
	E findOne(String identifier);
	
	List<E> findAll();
}

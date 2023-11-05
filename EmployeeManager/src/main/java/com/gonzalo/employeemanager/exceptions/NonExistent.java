package com.gonzalo.employeemanager.exceptions;

public class NonExistent extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NonExistent(String message) {
		super(message);
	}
}

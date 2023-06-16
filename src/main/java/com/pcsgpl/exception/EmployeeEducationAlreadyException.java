package com.pcsgpl.exception;

public class EmployeeEducationAlreadyException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public EmployeeEducationAlreadyException() {
		
	}
	public EmployeeEducationAlreadyException(String message) {
		super(message);
		this.message=message;
	}
}


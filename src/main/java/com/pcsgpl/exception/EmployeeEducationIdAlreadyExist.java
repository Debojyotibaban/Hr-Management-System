package com.pcsgpl.exception;

public class EmployeeEducationIdAlreadyExist extends RuntimeException {

	private String message;
	
	public EmployeeEducationIdAlreadyExist() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeEducationIdAlreadyExist(String message) {
		super(message);
		this.message=message;
	}
}

package com.pcsgpl.exception;



public class NoSuchEmployeeEducationPresent extends RuntimeException {

	private String message;
	
	public NoSuchEmployeeEducationPresent() {
		
	}
	public NoSuchEmployeeEducationPresent(String message) {
		super(message);
		this.message=message;
	}
}

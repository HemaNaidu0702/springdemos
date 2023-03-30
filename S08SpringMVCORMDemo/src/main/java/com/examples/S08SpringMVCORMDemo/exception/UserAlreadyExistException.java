package com.examples.S08SpringMVCORMDemo.exception;

public class UserAlreadyExistException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public UserAlreadyExistException(String email) {
		super("User already exixts " + email);
	}
}

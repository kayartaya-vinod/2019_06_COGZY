package com.cogzy.model;

public class InvalidSalaryException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidSalaryException() {
		super("Invalid salary supplied!");
	}

	public InvalidSalaryException(String message) {
		super(message);
	}

	public InvalidSalaryException(Throwable cause) {
		super(cause);
	}

	public InvalidSalaryException(String message, Throwable cause) {
		super(message, cause);
	}

}

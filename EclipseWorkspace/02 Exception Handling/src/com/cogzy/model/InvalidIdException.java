package com.cogzy.model;

public class InvalidIdException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidIdException() {
		super("Invalid id supplied!");
	}

	public InvalidIdException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidIdException(String message) {
		super(message);
	}

	public InvalidIdException(Throwable cause) {
		super(cause);
	}

}

package com.capgemini.sfdc.ex;

public class IncorrectpinException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectpinException() {
		super();
	}
	
	public IncorrectpinException(String message) {
		super(message);
		
	}
}

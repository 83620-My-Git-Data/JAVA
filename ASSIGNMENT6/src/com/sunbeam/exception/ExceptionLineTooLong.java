package com.sunbeam.exception;

public class ExceptionLineTooLong extends Exception {

	private String message;

	public ExceptionLineTooLong() {

		this.message = "";
	}

	public ExceptionLineTooLong(String msg) {

		this.message = msg;
	}

	@Override
	public void printStackTrace() {
		System.err.println("Exception :");
		System.err.println("ExceptionLineTooLong: " +  message);
		System.err.println("Field :" + " String");
	}

}

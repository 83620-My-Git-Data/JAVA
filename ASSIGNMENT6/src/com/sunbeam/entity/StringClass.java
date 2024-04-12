package com.sunbeam.entity;

import java.util.Scanner;

import com.sunbeam.exception.ExceptionLineTooLong;

public class StringClass {
	String string;

	Scanner sc = new Scanner(System.in);

	public void setString() throws ExceptionLineTooLong {
		System.out.print("Enter the String: ");
		string = sc.next();
		if (string.length() > 80) {
			throw new ExceptionLineTooLong("The strings is too long");
		}

	}

	@Override
	public String toString() {
		return this.string;
	}

}

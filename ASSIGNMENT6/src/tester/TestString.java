package tester;

import com.sunbeam.entity.StringClass;
import com.sunbeam.exception.ExceptionLineTooLong;

public class TestString {

	public static void main(String[] args) {

		StringClass s = new StringClass();
		try {
			s.setString();
		} catch (ExceptionLineTooLong e) {
			e.printStackTrace();
		}
	

		System.out.println("Program Executed Successfully!");

	}

}

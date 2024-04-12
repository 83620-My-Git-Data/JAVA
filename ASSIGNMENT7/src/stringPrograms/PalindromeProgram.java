package stringPrograms;

import java.util.Scanner;

public class PalindromeProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Sring: ");
		String s = sc.next();

		StringBuilder str = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {
			str.append(s.charAt(i));
		}

		if (s.equals(str.toString())) {
			System.out.println("Entered String is a Palindrome");
		} else {
			System.out.println("Entered String is not a Palindrome");
		}

	}

}

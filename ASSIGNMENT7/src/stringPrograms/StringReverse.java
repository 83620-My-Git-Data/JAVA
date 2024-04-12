package stringPrograms;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Sring: ");
		String s = sc.next();

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}

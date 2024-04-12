package stringPrograms;

import java.util.Iterator;
import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Sring: ");
		String s = sc.nextLine();

		String sTrimmed = s.trim();

		String[] ArrofStrings = sTrimmed.split(" ");

		int count = 0;

		for (int i = 0; i < ArrofStrings.length; i++) {
			if (ArrofStrings[i].length() > 0) {
				count++;
			}
		}

		// System.out.print("Lenght of the Array: "+ArrofStrings.length);

		System.out.print("Lenght of the Array: " + count);

	}

}

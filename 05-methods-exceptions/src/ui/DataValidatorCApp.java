package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataValidatorCApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Yo!");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// validation of a whole number
			System.out.print("Enter a whole number: ");
			try {
				int num1 = sc.nextInt();
			} catch (InputMismatchException ime) {
				System.out.println("Please follow instructions");
				sc.nextLine();
			}

			// doing the same thing but with a method
			int num3 = getInt("Enter a whole number (method edition!)");

			// enter double with data validation
			System.out.print("Enter a double: ");
			if (sc.hasNextDouble()) {
				double d1 = sc.nextDouble();
			} else {
				System.out.println("fool of a Took!");
				sc.nextLine();
			}

			// doing the same thing but with a method
			double dub3 = getDouble("Enter a double (method edition)!");

			choice = getString("Try this again?", "y", "n");
		}
		System.out.println("Go!");

	}

	private static int getInt(String prompt) {
		boolean success = false;
		int num2 = 0;
		while (!success) {
			System.out.println(prompt);
			if (sc.hasNextInt()) {
				num2 = sc.nextInt();
				success = true;
			} else {
				System.out.println("Invalid");
				sc.nextLine();
			}
		}

		return num2;
	}

	private static double getDouble(String prompt) {
		boolean success = false;
		double dub2 = 0;
		while (!success) {
			System.out.println(prompt);
			if (sc.hasNextDouble()) {
				dub2 = sc.nextDouble();
				success = true;
			} else {
				System.out.println("Invalid");
				sc.nextLine();
			}
		}

		return dub2;
	}

	private static String getString(String prompt, String s1, String s2) {
		String str = "";
		boolean success = false;
		while (!success) {
			System.out.print(prompt);
			str = sc.nextLine();
			if (str.length() == 0) {
				System.out.println("Entry is req, try again.");
			} else if (!str.equalsIgnoreCase(s1) && !str.equalsIgnoreCase(s2)) {
				System.out.println("Gotta be " + s1 + " or " + s2 + ". Try again.");
			} else {
				success = true;
			}
		}
		return str;
	}

}

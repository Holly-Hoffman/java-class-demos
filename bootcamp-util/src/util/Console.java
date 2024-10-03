package util;

import java.util.List;
import java.util.Scanner;

//we will make a library outta this

public class Console {
	public static Scanner sc = new Scanner(System.in);

	// id = int
	// title cannot be null
	// year = int
	// rating = g, pg, pg-13, nc-17, r
	// director = not null

	public static void printLine(String line) {
		System.out.println(line);
	}

	public static String getString(String prompt) {
		String str = "";
		System.out.print(prompt);
		return sc.nextLine();
	}

	public static String getReqdString(String prompt) {
		String str = "";
		boolean success = false;
		while (!success) {
			str = getString(prompt);
			if (str.length() > 0) {
				success = true;
			} else {
				System.out.println("Entry required.  Please try again.");
			}

		}
		return str;
	}

	public static String getSpecString(String prompt, List<String> validValues) {
		String str = "";
		boolean success = false;
		while (!success) {
			str = getString(prompt);
			// this is a foreach loop
			for (String s : validValues) {
				if (s.equalsIgnoreCase(str)) {
					success = true;
					break;
				}
			}
			if (!success) {
				System.out.println("Invalid enmtry. Please try again.");
			}
		}

		return str;
	}

	public static int getInt(String prompt) {
		int num = 0;
		boolean success = false;
		while (!success) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				num = sc.nextInt();
				success = true;
			} else {
				System.out.println("Error: please enter a whole number.");
			}
			sc.nextLine();
		}

		return num;
	}

	public static int getIntRange(String prompt, int min, int max) {
		int num = 0;
		boolean success = false;
		while (!success) {
			num = getInt(prompt);
			if (num < min) {
				System.out.println("Error: entry must be greater than " + (min - 1));
			} else if (num > max) {
				System.out.println("Error: entry must be less than " + (max + 1));
			} else {
				success = true;
			}
		}

		return num;
	}

	public static double getDbl(String prompt) {
		double num = 0.0;
		boolean success = false;
		while (!success) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				num = sc.nextDouble();
				success = true;
			} else {
				System.out.println("Error: please enter a valid number. (Decimals are permitted.)");
			}
			sc.nextLine();
		}

		return num;
	}

	public static double getDblRange(String prompt, double min, double max) {
		double num = 0.0;
		boolean success = false;
		while (!success) {
			num = getDbl(prompt);
			if (num < min) {
				System.out.println("Error: entry must be greater than/equal to " + min);
			} else if (num > max) {
				System.out.println("Error: entry must be less than/equal to " + max);
			} else {
				success = true;
			}
		}

		return num;
	}

}

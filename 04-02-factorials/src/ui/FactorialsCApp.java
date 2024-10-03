package ui;

import java.util.Scanner;

public class FactorialsCApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Factorial Calculator!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter an integer that's greater than 0 and less than 10: ");
			int num = sc.nextInt();
			int f = 1;

			for (int i = 1; i <= num; i++) {
				f *= i;
			}

			System.out.println("The factorial of " + num + " is " + f + ".");
			sc.nextLine();
			System.out.print("\nContinue? (y/n): ");
			choice = sc.nextLine();

		}

		System.out.println("\nThank you for using the factorial calculator!");

	}

}

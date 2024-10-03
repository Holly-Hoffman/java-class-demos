package ui;

import java.util.Scanner;

public class CommonDivisorCApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Greatest Common Divisor Finder!");
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter first number: ");
			int fNum = sc.nextInt();

			System.out.print("Enter second number: ");
			sc.nextLine();
			int sNum = sc.nextInt();

			while (fNum != 0) {
				while (sNum >= fNum) {
					sNum = sNum - fNum;
				}
				int newFNum = sNum;
				sNum = fNum;
				fNum = newFNum;
			}
			System.out.println("Greatest common divisor: " + sNum);

			System.out.print("\nContinue? (y/n): ");
			sc.nextLine();
			choice = sc.nextLine();
		}

		System.out.println("Thanks for using this.  Still not sure how it works though!");

	}

}

package ui;

import java.util.Scanner;

public class PowersCApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Squares and Cubes table!");
		String choice = "y";
		Scanner sc = new Scanner(System.in);

		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter an integer: ");
			int input = sc.nextInt();

			System.out.println("Number\tSquared\tCubed");
			System.out.println("======\t=======\t=====");

			for (int i = 1; i <= input; i++) {
				int sq = (int) Math.pow(i, 2);
				int cu = (int) Math.pow(i, 3);
				System.out.println(i + "\t\t" + sq + "\t\t" + cu);
			}

			sc.nextLine();
			System.out.print("\nContinue? (y/n): ");
			choice = sc.nextLine();

		}

		System.out.println("\nThanks for using the calculator!");

	}

}

package ui;

import java.util.Scanner;

public class GuessingGameCApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Guess the Number Game!");
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		String choice = "y";

		while (choice.equalsIgnoreCase("y"))

		{
			int rand = (int) (Math.random() * 100);
			System.out.println("\nI'm thinking of a number from 1-100.\nTry to guess it.");

			int counter = 0;

			while (true) {
				int guess = IntGuess("\nEnter a number from 1 to 100. ");
				counter++;

				if (guess > rand + 10) {
					System.out.println("Way too high! Guess again.");
				} else if (guess > rand) {
					System.out.println("Too high! Guess again.");
				} else if (guess < rand - 10) {
					System.out.println("Way too low! Guess again.");
				} else if (guess < rand) {
					System.out.println("Too low! Guess again.");
				}

				else {
					System.out.println("You got it in " + counter + " tries.");
					// sc.nextLine();
					if (counter <= 3) {
						System.out.println("\nGreat work! You must be a wizard!");
					} else if (counter <= 7) {
						System.out.println("\nNot too bad! You've got some potential.");
					} else {
						System.out.println("\nWhat took you so long? Maybe you should take some lessons.");
					}
					break;
				}

			}

			// sc.nextLine();
			System.out.println("\nTry again? (y/n): ");
			choice = sc.nextLine();

		}
	}

	private static int IntGuess(String prompt) {
		int number = 0;
		Boolean isValid = false;

		while (!isValid) {
			try {
				System.out.print(prompt);
				number = sc.nextInt();
				sc.nextLine();
				if (number < 1) {
					System.out.println("Invalid entry: number must be greater than 1.");
					continue;
				} else if (number > 100) {
					System.out.println("Invalid entry: number must be less than 100.");
					continue;
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid entry: please enter a valid number.");
				continue;
			}
		}

		return number;
	}

}

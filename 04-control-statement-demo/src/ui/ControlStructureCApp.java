package ui;

import java.text.NumberFormat;
import java.util.Scanner;

public class ControlStructureCApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to ch4");
		Scanner sc = new Scanner(System.in);

		System.out.println("Traffic light");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("What is the light color? ");

			String color = sc.nextLine();

			if (color.equalsIgnoreCase("red")) {
				System.out.println("STOP");
			} else if (color.equalsIgnoreCase("green")) {
				System.out.println("GO");
			} else if (color.equalsIgnoreCase("yellow")) {
				System.out.println("SLOW DOWN");
			} else {
				System.out.println("INVALID ENTRY.");
			}

			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
		}

		System.out.println("\nCommand Menu:");
		System.out.println("1 - Attack");
		System.out.println("2 - Block");
		System.out.println("3 - Run Away");
		System.out.print("Command: ");
		String command = sc.nextLine();

		switch (command) {
		case "1":
			System.out.println("Owie.");
			break;
		case "2":
			System.out.println("No owie.");
			break;
		case "3":
			System.out.println("Outie.");
			break;
		default:
			System.out.println("You can't do that.");
			break;
		}

		// Switch statement fall-throughs happen when there are no breaks
		// It will execute the rest of the code after it finds a match until a break.
		// We did correct the below with breaks.
		System.out.println("switch statement fall-through:");
		System.out.print("Day of week? (1-7)");
		int dow = sc.nextInt();
		switch (dow) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Weekday.");
			break;
		case 6:
		case 7:
			System.out.println("Weekend.  Huzzah.");
			break;
		}

		// pg 124-127 show newer versions of switch operators
		System.out.println("\nForLoooooops");
		// standard: count 1-10
		for (int i = 0; i <= 10; i++) {
			System.out.println("i is " + i);
		}

		// standard: count by 5s
		for (int i = 0; i <= 100; i += 5) {
			System.out.println("i is " + i);

		}

		// 3 to 99, backwards, by 3s
		for (int i = 99; i >= 3; i -= 3) {
			System.out.println("i is " + i);

		}

		// percentages 1.0% - 5.0% by .25%
		for (double d = 1.0; d >= 5.0; d += .25) {
			System.out.println("d is " + d + "%");

		}

		// percentages 1.0% - 5.0% by .25%
		NumberFormat pctFormat = NumberFormat.getPercentInstance();
		pctFormat.setMinimumFractionDigits(2);
		for (double d = 1.0; d >= 5.0; d += .25) {
			double pct = d / 100;
			System.out.println("d is " + pctFormat.format(pct));

		}

		System.out.println("End");

	}

}

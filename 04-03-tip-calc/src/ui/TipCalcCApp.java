package ui;

import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalcCApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Change Calculator!");
		Scanner sc = new Scanner(System.in);
		NumberFormat cashFormat = NumberFormat.getCurrencyInstance();
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nCost of meal: ");
			double meal = sc.nextDouble();

			System.out.println("\n15%");
			double tip15 = meal * 0.15;
			double tot15 = meal + tip15;
			System.out.println("Tip amout:\t" + cashFormat.format(tip15));
			System.out.println("Total amount:\t" + cashFormat.format(tot15));

			System.out.println("\n20%");
			double tip20 = meal * 0.20;
			double tot20 = meal + tip20;
			System.out.println("Tip amout:\t" + cashFormat.format(tip20));
			System.out.println("Total amount:\t" + cashFormat.format(tot20));

			System.out.println("\n25%");
			double tip25 = meal * 0.25;
			double tot25 = meal + tip25;
			System.out.println("Tip amout:\t" + cashFormat.format(tip25));
			System.out.println("Total amount:\t" + cashFormat.format(tot25));

			sc.nextLine();
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
		}

		System.out.println("\nThank you for using the tip calculator!");

	}

}

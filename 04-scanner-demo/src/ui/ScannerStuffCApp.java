package ui;

import java.util.Scanner;

public class ScannerStuffCApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scanner is weird bc it works as a buffer
		Scanner sc = new Scanner(System.in);

		System.out.println("Read an entire line.");
		String line = sc.nextLine();
		System.out.println(line);

		System.out.println("Read an int.");
		int nbr1 = sc.nextInt();
		System.out.println(nbr1);
		sc.nextLine();

		System.out.println("Read a double.");
		Double nbr2 = sc.nextDouble();
		System.out.println(nbr2);

		System.out.println("Read another entire line.");
		// this ends up only printing the first word!
		String lyric = sc.next();
		System.out.println(lyric);

		System.out.println("Read another other entire line.");
		StringBuilder lines = new StringBuilder();
		// this will keep adding ish until we are through everything entered
		while (sc.hasNext()) {
			lines.append(sc.next());
			if (line.isEmpty()) {
				break;
			}
		}
		System.out.println(lines);

		System.out.println("the end.");

	}

}

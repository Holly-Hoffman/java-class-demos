package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Movie;
import util.Console;

public class BmdbMovieManagerCApp {

	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<>();
		List<String> ratings = new ArrayList<>(Arrays.asList("G", "PG", "PG-13", "NC-17", "R"));
		List<String> cont = new ArrayList<>(Arrays.asList("y", "n"));
		Console.printLine("Welcome to this thing.");

		Movie m1 = new Movie(1, "movie", 2024, "pg", "me");
		System.out.println(m1);

		// we are going to prompt the user for the fields of a movie.
		// we will create a console class that manages user input and output

		// it should also validate user input.

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			Console.printLine("Enter a movie.");
			int id = Console.getInt("Id: ");
			String title = Console.getReqdString("Title: ");
			int year = Console.getInt("Year: ");
			String rating = Console.getSpecString("Rating: ", ratings);
			String director = Console.getReqdString("Director: ");

			// movie should then get added to a list
			// we will then print it

			Movie m = new Movie(id, title, year, rating.toUpperCase(), director);
			movies.add(m);
			Console.printLine("\nMovies:");
			for (Movie movie : movies) {
				Console.printLine(movie.toString());
			}

			choice = Console.getSpecString("Continue? (y/n): ", cont);
		}

	}

}

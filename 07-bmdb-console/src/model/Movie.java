package model;

//bean.
public class Movie {
	// all instance vars are private
	private int id;
	private String title;
	private int year;
	private String rating;
	private String director;

	// need default/empty constructor, but making a fully loaded one
	public Movie(int id, String title, int year, String rating, String director) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.rating = rating;
		this.director = director;
	}

	// empty constructor:
	public Movie() {
		super();
	}

	// need getters and setters for instance variables
	// must be public, must start with get/set, must camelcase it
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	// generate a tostring - useful for console apps only
	@Override
	public String toString() {
		return "Movie [id = " + id + ", title = " + title + ", year = " + year + ", rating = " + rating
				+ ", director = " + director + "]";
	}

}

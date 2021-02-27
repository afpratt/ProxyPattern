import java.util.*;

public class MovieLibrary {
	private	Map<String, Movie> movies = new HashMap<>();

	public void addMovie(Movie movie) {
		movies.put(movie.getMovieName(), movie);
	}
	
	public void openMovie(String movieName) {
		movies.get(movieName).play();
	}
}

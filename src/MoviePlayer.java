
public class MoviePlayer {
	public static void main(String[] args) {
		var movieLibrary = new MovieLibrary();
		String [] movieNames = { "Original Movie", "Sequel", "Prequel" };
		for (var movieName : movieNames)
			movieLibrary.addMovie(new MovieProxy(movieName));
		
		movieLibrary.openMovie("Original Movie");
	}
}

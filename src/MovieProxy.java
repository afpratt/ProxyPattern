
public class MovieProxy implements Movie {
	private String movieName;
	private RealMovie movie;
	
	public MovieProxy(String movieName) {
		this.movieName = movieName;
	}

	public void play() {	
		if (movie == null)
			movie = new RealMovie(movieName);
		
		movie.play();
	}

	public String getMovieName() {
		return movieName;
	}

}

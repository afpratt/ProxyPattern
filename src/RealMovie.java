
public class RealMovie implements Movie {
	private String movieName;
	
	public RealMovie(String movieName) {
		this.movieName = movieName;
		load();
	}
	
	private void load() {
		System.out.println("Loading movie: " + movieName);
	}
	
	public void play() {
		System.out.println("Playing movie: " + movieName);
	}

	public String getMovieName() {
		return movieName;
	}
}

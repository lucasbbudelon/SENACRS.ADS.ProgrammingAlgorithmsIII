package model;

public class Movie {
	/** Titulo do filme. */
	private String title;
	/** Genero do filme. */
	private String genre;
	/** "Avaliacao" do filme. */
	private double rating;
	/** Lista de filmes similares. */
	private Movie[] similar;

	public Movie(String title, String genre, double rating) {
		this.title = title;
		this.genre = genre;
		this.rating = rating;
	}
	public String getTitle() {
		return title;
	}
	public String getGenre() {
		return genre;
	}
	public double getRating() {
		return rating;
	}
	public void setSimilar(Movie[] similar) {
		this.similar = similar;
	}
	public Movie[] getSimilar() {
		return similar.clone();
	}
}

package app;
import model.Movie;
import resposta.Recommendation;
import util.CSVReader;

public class ProvaFinal {

	public static void main(String[] args) {
		Movie[] movies = CSVReader.loadMovieDatabase(Recommendation.database);
		Movie src = movies[(int)(Math.random()*movies.length)];
		int count = 5;
		/* Se voce executar sem implementar nada, ocorrera um erro
		 * neste "for".
		 */
		for (Movie movie : Recommendation.recommend(src, count)) {
			System.out.println(movie);
		}
		for (Movie movie : Recommendation.recommendInGenre(src, "Comedy", count)) {
			System.out.println(movie);
		}
	}

}

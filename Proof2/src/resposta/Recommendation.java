package resposta;

import model.Movie;

public class Recommendation {

    //public static final String database = "movies.csv";
    public static final String database = "teste.csv";

    public static Movie[] recommend(Movie source, int count) {

        Movie[] listRecommend = new Movie[count];

        BinaryTree bt = new BinaryTree();

        //Queria implementar uma função recursiva aqui, que adicionasse  na BinaryTree
        //até atingir o tamanho máximo de altura de acordo com o count
        for (Movie similar1 : source.getSimilar()) {
            if (!source.getTitle().equals(similar1.getTitle())) {
                bt.add(similar1);
            }

            for (Movie similar2 : source.getSimilar()) {
                if (!source.getTitle().equals(similar2)) {
                    bt.add(similar2);
                }
            }
        }

        Node node = bt.root;
        for (int i = 0; i < count; i++) {
            listRecommend[i] = node.value;
            node = bt.root.right;
        }

        return listRecommend;
    }

    public static Movie[] recommendInGenre(Movie source, String genre, int count) {

        Movie[] listRecommend = new Movie[count];

        BinaryTree bt = new BinaryTree();

        //Queria implementar uma função recursiva aqui, que adicionasse  na BinaryTree
        //até atingir o tamanho máximo de altura de acordo com o count
        for (Movie similar1 : source.getSimilar()) {
            if (!source.getTitle().equals(similar1.getTitle()) && similar1.getGenre().equals(genre)) {
                bt.add(similar1);
            }

            for (Movie similar2 : source.getSimilar()) {
                if (!source.getTitle().equals(similar2.getTitle()) && similar2.getGenre().equals(genre)) {
                    bt.add(similar2);
                }

                for (Movie similar3 : source.getSimilar()) {
                    if (!source.getTitle().equals(similar3.getTitle()) && similar3.getGenre().equals(genre)) {
                        bt.add(similar3);
                    }

                    for (Movie similar4 : source.getSimilar()) {
                        if (!source.getTitle().equals(similar4.getTitle()) && similar4.getGenre().equals(genre)) {
                            bt.add(similar4);
                        }
                    }
                }
            }
        }

        Node node = bt.root;
        for (int i = 0; i < count; i++) {
            listRecommend[i] = node.value;
            node = bt.root.right;
        }

        return listRecommend;
    }

    /* Este método pode ter a sua interface alterada.
	 * Crie a interface que achar mais adequada.
     */
    public static Movie recommendCloser(Movie source, int maxDistance) {
        // TODO Implemente este método, ou altere a interface e crie o seu.
        return null;
    }

}

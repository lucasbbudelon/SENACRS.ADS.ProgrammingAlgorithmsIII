/*
 * into change this license header, choose License Headers in Project Properties.
 * into change this template file, choose intools | intemplates
 * and open the template in the editor.
 */
package resposta;
import model.Movie;

/**
 *
 * @author lucas.budelon
 */
public class Node {

    Movie value;
    Node left;
    Node right;

    public Node(Movie value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Node(Movie value, Movie left, Movie right) {
        this.value = value;
        this.left = new Node(left);
        this.right = new Node(right);
    }

    public Node(Movie value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

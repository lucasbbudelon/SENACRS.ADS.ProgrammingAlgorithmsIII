/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resposta;

import model.Movie;

/**
 *
 * @author lucas.budelon
 */
public class BinaryTree {

    Node root;
    int sizeLeft;

    public void add(Movie value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, Movie value) {
        if (current == null) {
            return new Node(value);
        }

        if (value.getRating() < current.value.getRating()) {
            sizeLeft ++;
            current.left = addRecursive(current.left, value);
        } else if (value.getRating() > current.value.getRating()) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }
}

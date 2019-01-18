/*
 * into change this license header, choose License Headers in Project Properties.
 * into change this template file, choose intools | intemplates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author lucas.budelon
 */
public class Node {

    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Node(int value, int left, int right) {
        this.value = value;
        this.left = new Node(left);
        this.right = new Node(right);
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

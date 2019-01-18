/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author lucas.budelon
 */
public class BinaryTree {

    Node root;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public int calculateArc(int key1, int key2) {
        if (containsNodeRecursive(root, key1) && containsNodeRecursive(root, key2)) {
            return calculateArc(root, key1, key2);
        } else {
            return -1;
        }
    }

    private int calculateArc(Node parent, int key1, int key2) {
        if (key1 < parent.value && key2 < parent.value) {
            return calculateArc(parent.left, key1, key2);
        } else if (key1 > parent.value && key2 > parent.value) {
            return calculateArc(parent.right, key1, key2);
        } else {
            return (calculateArc(parent, key1) + calculateArc(parent, key2)) - 2;
        }
    }

    private int calculateArc(Node parent, int key) {  
        if (key > parent.value) {
            return calculateArc(parent.right, key) + 1;
        } else if (key < parent.value) {
            return calculateArc(parent.left, key) + 1;
        } else {
            return 1;
        }
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }
}

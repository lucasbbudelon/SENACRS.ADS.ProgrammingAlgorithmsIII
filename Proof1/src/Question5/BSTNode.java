/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author lucas.budelon
 * @param <T>
 */
public class BSTNode<T extends Comparable<T>> {

    private T key;
    private BSTNode<T> left;
    private BSTNode<T> right;

    public BSTNode(T key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
    
    public BSTNode(T key, T left, T right) {
        this.key = key;
        this.left = new BSTNode(left);
        this.right = new BSTNode(right);
    }
    
    public BSTNode(T key, BSTNode left, BSTNode right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }

    public T getKey() {
        return key;
    }
    
    public boolean isValidBST() {
        return isValidBST(this);
    }

    public boolean isValidBST(BSTNode<T> node) {
        if (node == null) {
            return true;
        } else {
            return validLeft(node) && validRight(node);
        }
    }

    
    private boolean validLeft(BSTNode<T> node) {
        if (node.left == null) {
            return true;
        } else {
            return node.left.compareTo(node) < 0;
        }
    }

    private boolean validRight(BSTNode<T> node) {
        if (node.right == null) {
            return true;
        } else {
            return node.right.compareTo(node) > 0;
        }
    }

    private int compareTo(BSTNode<T> other) {
        return this.key.compareTo(other.key);
    }
}

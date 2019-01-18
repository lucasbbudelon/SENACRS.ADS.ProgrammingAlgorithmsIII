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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        Node left = new Node(3,
                new Node(1, null, new Node(2)),
                new Node(4));

        Node right = new Node(7,
                null,
                new Node(8, null, new Node(1, null,
                        new Node(9))));

        bt.root = new Node(6, left, right);

        //System.out.println("3" + bt.calculateArc(2, 4));
        //System.out.println("2" + bt.calculateArc(7, 3));
        //System.out.println("4" + bt.calculateArc(8, 4));
        System.out.println("6" + bt.calculateArc(2, 9));

    }
}

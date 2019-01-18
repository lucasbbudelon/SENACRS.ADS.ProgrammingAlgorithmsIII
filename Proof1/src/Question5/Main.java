/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author lucas.budelon
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        BSTNode left, right, root;
                
        left = new BSTNode(2, 1, 3);
        right = new BSTNode(6, 5, 7);
        root = new BSTNode(4, left, right);
        System.out.println(root.isValidBST());
                
        System.out.println("");
        
        left = new BSTNode(10, 1, 3);
        System.out.println(left.isValidBST());
        
        right  = new BSTNode(6, 5, 4);
        System.out.println(right.isValidBST());
                
        root  = new BSTNode(4, left, right);
        System.out.println(root.isValidBST());
        
    }
}

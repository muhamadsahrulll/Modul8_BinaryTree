/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul8_binarytree;

/**
 *
 * @author Sahrul
 */
public class BinaryTreeApp {
    public static void main (String[] args){
        BinaryTree tree = new BinaryTree();
        
        TreeNode node;
        
        node = new TreeNode('D');
        tree.insert(node);
        
        node = new TreeNode('B');
        tree.insert(node);
        
        node = new TreeNode('A');
        tree.insert(node);
        
        node = new TreeNode('C');
        tree.insert(node);
        
        node = new TreeNode('F');
        tree.insert(node);
        
        node = new TreeNode('E');
        tree.insert(node);
        
        node = new TreeNode('G');
        tree.insert(node);
        
        System.out.println("Transversal dengan preOrder: ");
        tree.preOrder();
        System.out.println();
        
        System.out.println("Transversal dengan inOrder : ");
        tree.inOrder();
        System.out.println();
        
        System.out.println("Transversal dengan postOrder : ");
        tree.postOrder();
        System.out.println();
        
        System.out.println("Muhamad Sahrul Syabani 20090056");
        
    }
}

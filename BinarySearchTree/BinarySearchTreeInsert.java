package BinarySearchTree;
import java.util.Scanner;

public class BinarySearchTreeInsert{
    public class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            left  = right = null;
        }
        
        public Node insert(Node root, int data){
            if(root == null || root.data == data) return root;
        }
    }
}


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
            if(data < root.data){
                root.left = insert(root.left, data);
            }else{
                root.right = insert(root.right, data);
            }
            return root;

        }

        public void inorder(Node root){
            if(root == null) return;
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }


    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BinarySearchTreeInsert bst = new BinarySearchTreeInsert();
        Node root = bst.new Node(10);
        root.insert(root, 5);
        root.insert(root, 15);
        root.insert(root, 2);
        root.insert(root, 7);
        root.insert(root, 12);
        root.insert(root, 20);
        root.inorder(root);
        sc.close();
    }

    
}


package Tree;
import java.util.Scanner;

public class PostOrderTraversalOfBinaryTree {
    
    public static class Node{
        Node left;
        Node right;
        int data;
        Node( int data){
            this.data = data;
            left = right = null;
        }
    }

    public static Node insert(Node root, int data){
        if(root == null) return new Node(data);
        else{
            Node curr;
            if( data <= root.data){
                curr = insert(root.left, data);
                root.left = curr;
            }
            else{
                curr = insert(root.right, data);
                root.right = curr;
            }
        }
        return root;
    }

    public static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        int t = sc.nextInt();
        while(t-- > 0){
            int data = sc.nextInt();
            root = insert(root, data);
        }
        postOrder(root);
        sc.close();
    }
}

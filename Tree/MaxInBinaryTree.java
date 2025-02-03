package Tree;
import java.util.Scanner;
public class MaxInBinaryTree {
    
    public static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
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

    public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(max(root.left), max(root.right)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        int t = sc.nextInt();
        while(t-- > 0){
            int data = sc.nextInt();
            root = insert(root, data);
        }
        System.out.println(max(root));
        sc.close();
    }
    
}

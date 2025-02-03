package Tree;
import java.util.Scanner;

public class IterativeInorderTraversal {
    
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

    public static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void iterativeInOrder(Node root){
        if(root == null) return;
        Node curr = root;
        java.util.Stack<Node> stack = new java.util.Stack<>();
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.data+" ");
            curr = curr.right;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        int t = sc.nextInt();
        while(t-- > 0){
            int data = sc.nextInt();
            root = insert(root, data);
        }
        inOrder(root);
        System.out.println();
        iterativeInOrder(root);
        sc.close();
    }
    
}

package Tree;
import java.util.*;
public class ValidBSTorNot {

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static Node insert(Node root, int data){
        if( root == null) return new Node(data);
        else{
            Node curr;
            if(data <= root.data){
                curr = insert(root.left, data);
                root.left = curr;
            } else {
                curr = insert(root.right, data);
                root.right = curr;
            }
        }
        return root;
    }

    public static boolean isBST(Node root, int min, int max){
        if(root == null) return true;
        if(root.data < min || root.data > max) return false;
        return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
    }
    public static boolean isBST(Node root){
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        int t = sc.nextInt();
        while(t-- > 0){
            int data = sc.nextInt();
            root = insert(root, data);
        }
        System.out.println(isBST(root));
        sc.close();
    }
}

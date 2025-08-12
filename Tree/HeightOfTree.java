package Tree;
import java.util.*;
public class HeightOfTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) return new Node(data);
        else {
            Node curr;
            if (data <= root.data) {
                curr = insert(root.left, data);
                root.left = curr;
            } else {
                curr = insert(root.right, data);
                root.right = curr;
            }
        }
        return root;
    }

    public static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        int t = sc.nextInt();
        while (t-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        System.out.println(height(root));
        sc.close();
    }

    
}

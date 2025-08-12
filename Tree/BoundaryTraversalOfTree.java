package Tree;
import java.util.*;

public class BoundaryTraversalOfTree{
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) return new Node(data);
        if (data <= root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void printBoundary(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");

        // Print left boundary
        Node curr = root.left;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = (curr.left != null) ? curr.left : curr.right;
        }

        // Print leaf nodes
        printLeaves(root);

        // Print right boundary
        Stack<Integer> stack = new Stack<>();
        curr = root.right;
        while (curr != null) {
            stack.push(curr.data);
            curr = (curr.right != null) ? curr.right : curr.left;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void printLeaves(Node root) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
            return;
        }
        printLeaves(root.left);
        printLeaves(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter numbers to insert into the tree (type 'done' to finish):");
        while (sc.hasNext()) {
            String input = sc.next();
            if (input.equals("done")) break;
            try {
                int data = Integer.parseInt(input);
                root = insert(root, data);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer or 'done' to finish.");
            }
        }
    }
}
package BinarySearchTree;

import java.util.Scanner;
import java.util.Stack;


public class RecoverTreeFromPreorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        RecoverTreeFromPreorderTraversal obj = new RecoverTreeFromPreorderTraversal();
        String traversal = sc.next();
        TreeNode root = obj.recoverFromPreorder(traversal);
        System.out.println(root);
        sc.close();
    }

    public TreeNode recoverFromPreorder(String traversal) {
        Stack<TreeNode> stack = new Stack<>();
        int i = 0, n = traversal.length();
        while (i < n) {
            int depth = 0;
            while (i < n && traversal.charAt(i) == '-') {
                depth++;
                i++;
            }
            int num = 0;
            while (i < n && Character.isDigit(traversal.charAt(i))) {
                num = num * 10 + (traversal.charAt(i) - '0');
                i++;
            }
            TreeNode node = new TreeNode(num);
            while (stack.size() > depth)stack.pop();
            if (!stack.isEmpty()) {
                TreeNode parent = stack.peek();
                if (parent.left == null) parent.left = node;
                else parent.right = node;
            }
            stack.push(node);
        }
        while (stack.size() > 1)stack.pop();
        return stack.pop();
    }
}

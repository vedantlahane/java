package Tree.standalone;

public class BinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static class InnerBinaryTree {
        TreeNode root;

        InnerBinaryTree() {
            root = null;
        }

        InnerBinaryTree(int val) {
            root = new TreeNode(val);
        }

        public void insert(int val) {
            root = insert(root, val);
        }

        private TreeNode insert(TreeNode root, int val) {
            if (root == null) {
                root = new TreeNode(val);
                return root;
            }

            if (val < root.val) {
                root.left = insert(root.left, val);
            } else {
                root.right = insert(root.right, val);
            }

            return root;
        }

        public void inorder() {
            inorder(root);
        }

        private void inorder(TreeNode root) {
            if (root != null) {
                inorder(root.left);
                System.out.print(root.val + " ");
                inorder(root.right);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Binary Tree");
        InnerBinaryTree tree = new InnerBinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        tree.inorder();

        System.out.println();
        
    }
}

package Tree;
import java .util.Scanner;
public class LeftViewOfBinaryTree {
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
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left,data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void leftView(Node root){
        leftViewUtil(root,1);
    }

    static int max_level = 0;
    public static void leftViewUtil(Node root, int level){
        if(root == null){
            return;
        }
        if(max_level < level){
            System.out.print(root.data+" ");
            max_level = level;
        }
        leftViewUtil(root.left,level+1);
        leftViewUtil(root.right,level+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        int t = sc.nextInt();
        while(t-- > 0){
            int data = sc.nextInt();
            root = insert(root,data);
        }
        leftView(root);
        sc.close();
    }

    
}

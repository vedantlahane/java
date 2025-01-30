
package Tree;
import java.util.Scanner;
public class LevelOrderTraversal {

    static class Node{
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

    public static void levelOrder(Node root){
        int h = height(root);
        for(int i=1;i<=h;i++){
            printLevel(root,i);
        }
    }

    public static void printLevel(Node root, int level){
        if(root == null){
            return;
        }
        if(level == 1){
            System.out.print(root.data+" ");
        }else if(level > 1){
            printLevel(root.left,level-1);
            printLevel(root.right,level-1);
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }else{
            int lheight = height(root.left);
            int rheight = height(root.right);
            if(lheight > rheight){
                return lheight+1;
            }else{
                return rheight+1;
            }
        }
    }
    public static void main( String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            root = insert(root,data);
        }
        levelOrder(root);
        sc.close();
    }
    
}

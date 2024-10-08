import java.util.Scanner;
public class binaryTreeTraversal {
    public static class Node{
        int data;
        Node Left;
        Node Right;
        Node ( int data ){
            this.data = data;
            this.Left = null;
            this.Right = null;
        }

        public void insert( int val ){
            if( val <= data ){
                if( Left == null ){
                    Left = new Node( val );
                }else{
                    Left.insert( val );
                }
            }
            else{
                if( Right == null ){
                    Right = new Node( val );
                }else{
                    Right.insert( val );
                }
            }

        }
    }

    public static void inOrder( Node root ){
        if( root != null ){
            inOrder( root.Left );
            System.out.print( root.data + " " );
            inOrder( root.Right );
        }
    }

    public static void preOrder( Node root ){
        if( root != null ){
            System.out.print( root.data + " " );
            preOrder( root.Left );
            preOrder( root.Right );
        }
    }

    public static void postOrder( Node root ){
        if( root != null ){
            postOrder( root.Left );
            postOrder( root.Right );
            System.out.print( root.data + " " );
        }
    }




    public static void main(String args[]){
        System.out.println("Binary Tree Traversal");
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter the number of elements in the tree");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the tree");
        Node root = new Node( sc.nextInt() );
        for( int i = 1; i < n; i++ ){
            root.insert( sc.nextInt() );
        }
        System.out.println("Inorder Traversal: ");
        inOrder( root );
        System.out.println("\nPreorder Traversal: ");
        preOrder( root );
        System.out.println("\nPostorder Traversal: ");
        postOrder( root );

        
        
        sc.close();

    }
}

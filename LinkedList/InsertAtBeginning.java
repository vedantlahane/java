package LinkedList;
import java.util.Scanner;
public class InsertAtBeginning {
    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static Node insert(Node head, int data){
        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }

    public static void print(Node head){
        Node curr = head;
        while( curr != null ){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int t = sc.nextInt();
        while (t-- > 0){
            int data = sc.nextInt();
            head = insert(head, data);
            
        }
        print(head);
        sc.close();
        
    }
}

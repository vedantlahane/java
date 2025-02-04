package Tree.LinkedList;
import java.util.Scanner;
public class ReverseLinkedList {
    public class  Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            next = null;
        }
    
        
    }
    public Node insert(Node head, int data){
        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }

    public void print(Node head){
        Node curr = head;
        while( curr != null ){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public Node reverse1(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node reverse2(Node head){
        if(head == null || head.next == null) return head;
        Node rest = reverse2(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    public Node reverse3(Node head){
        if(head == null || head.next == null) return head;
        Node rest = reverse3(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        ReverseLinkedList obj = new ReverseLinkedList();
        Node head = null;
        int t = sc.nextInt();
        while (t-- > 0){
            int data = sc.nextInt();
            head = obj.insert(head, data);
            
        }
        head = obj.reverse1(head);
        obj.print(head);

        head = obj.reverse2(head);
        obj.print(head);

        head = obj.reverse3(head);
        obj.print(head);
        
        sc.close();
        
    }
}

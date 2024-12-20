import java.util.Scanner;
public class DeleteTailNode {
    public class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        
        sc.close();
    }
}

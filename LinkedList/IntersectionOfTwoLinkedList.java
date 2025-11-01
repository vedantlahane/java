import java.util.Scanner;
import java.util.InputMismatchException;
public class IntersectionOfTwoLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node getIntersection(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != temp2) {
            if (temp1 == null) {
                temp1 = head2;
            } else {
                temp1 = temp1.next;
            }

            if (temp2 == null) {
                temp2 = head1;
            } else {
                temp2 = temp2.next;
            }
        }

        return temp1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number of elements in the first Linked List: ");
            int n = sc.nextInt();
            System.out.println("Enter the number of elements in the second Linked List: ");
            int m = sc.nextInt();
            System.out.println("Enter the elements of the first Linked List: ");
            Node head1 = new Node(sc.nextInt());
            Node temp = head1;
            
            for (int i = 1; i < n; i++) {
                temp.next = new Node(sc.nextInt());
                temp = temp.next;
            }
            System.out.println("Enter the elements of the second Linked List: ");
            Node head2 = new Node(sc.nextInt());
            temp = head2;
            
            for (int i = 1; i < m; i++) {
                temp.next = new Node(sc.nextInt());
                temp = temp.next;
            }
            System.out.println("Enter the index of the node where the two linked lists intersect: ");
            int x = sc.nextInt();
            Node temp1 = head1;
            for (int i = 0; i < x; i++) {
                temp1 = temp1.next;
            }

            temp = head2;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = temp1;

            System.out.println(getIntersection(head1, head2).data);
        } catch (InputMismatchException e) {
            System.out.println("Please provide valid integers as input.");
        }
    }
}

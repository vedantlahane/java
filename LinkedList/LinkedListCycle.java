package LinkedList;
import java.util.Scanner;
public class LinkedListCycle {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int v) {
            val = v;
            next = null;
        }
    }
    public static boolean hasCycle( ListNode head ){
        if( head == null || head.next == null ) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while( slow != fast ){
            if( fast == null || fast.next == null ) return false;
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return true;
    }

    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in );
        System.out.print( "Enter the number of elements in the linked list: " );
        int n = sc.nextInt();
        System.out.print( "Enter the elements of the linked list: " );
        ListNode head = new ListNode( sc.nextInt() );
        ListNode temp = head;
        for( int i = 1; i < n; i++ ){
            temp.next = new ListNode( sc.nextInt() );
            temp = temp.next;
        }
        System.out.print( "Enter the position of the node to which the last node points to (0-based index): " );
        int pos = sc.nextInt();
        if( pos != -1 ){
            ListNode temp1 = head;
            for( int i = 0; i < pos; i++ ){
                temp1 = temp1.next;
            }
            temp.next = temp1;
        }
        if( hasCycle( head ) ){
            System.out.println( "The linked list has a cycle." );
        } else {
            System.out.println( "The linked list does not have a cycle." );
        }
        sc.close();
    }
}

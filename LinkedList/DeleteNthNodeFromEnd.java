import java.util.Scanner;
public class DeleteNthNodeFromEnd {
    public static class ListNode{
        int val ;
        ListNode next;
        ListNode( int val ){
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode removeNthFromEnd( ListNode head, int n ){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for( int i=1; i<=n+1; i++ ){
            first = first.next;
        }
        while( first != null ){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
    public static void main( String args[] ){
        Scanner sc= new Scanner( System.in );
        System.out.println("Enter the number of elements in the linked list: ");
        int n= sc.nextInt();
        System.out.println("Enter the elements of the linked list: ");
        ListNode head = new ListNode( sc.nextInt() );
        ListNode temp = head;
        for( int i=1; i<n; i++ ){
            temp.next = new ListNode( sc.nextInt() );
            temp = temp.next;
        }
        System.out.println("Enter the value of n: ");
        int val = sc.nextInt();
        ListNode result = removeNthFromEnd( head, val );
        System.out.println("The linked list after removing the "+val+"th node from the end is: ");
        while( result != null ){
            System.out.print( result.val+" " );
            result = result.next;
        }

        sc.close();

    
    }
}
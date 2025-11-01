package LinkedList;

// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

// Return the head of the merged linked list.

 

// Example 1:


// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]
// Example 2:

// Input: list1 = [], list2 = []
// Output: []
// Example 3:

// Input: list1 = [], list2 = [0]
// Output: [0]
 

// Constraints:

// The number of nodes in both lists is in the range [0, 50].
// -100 <= Node.val <= 100
// Both list1 and list2 are sorted in non-decreasing order.
import java.util.Scanner;
public class MergeTwoSoredLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        while( l1 != null && l2 != null ){
            if( l1.val < l2.val ){
                temp.val = l1.val;
                l1 = l1.next;
            }
            else{
                temp.val = l2.val;
                l2 = l2.next;
            }
            if( l1 != null || l2 != null ){
                temp.next = new ListNode();
                temp = temp.next;
            }
        }
        while( l1 != null ){
            temp.val = l1.val;
            l1 = l1.next;
            if( l1 != null ){
                temp.next = new ListNode();
                temp = temp.next;
            }
        }
        while( l2 != null ){
            temp.val = l2.val;
            l2 = l2.next;
            if( l2 != null ){
                temp.next = new ListNode();
                temp = temp.next;
            }
        }
        return head;
    }
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes in list1: ");
        int n1 = sc.nextInt();
        ListNode head1 = new ListNode();
        ListNode temp = head1;
        System.out.println("Enter the nodes of list1: ");
        for( int i = 0; i < n1; i++ ){
            temp.val = sc.nextInt();
            if( i != n1-1 ){
                temp.next = new ListNode();
                temp = temp.next;
            }
        }
        System.out.println("Enter the number of nodes in list2: ");
        int n2 = sc.nextInt();
        ListNode head2 = new ListNode();
        temp = head2;
        System.out.println("Enter the nodes of list2: ");
        for( int i = 0; i < n2; i++ ){
            temp.val = sc.nextInt();
            if( i != n2-1 ){
                temp.next = new ListNode();
                temp = temp.next;
            }
        }
        ListNode result = mergeTwoLists(head1, head2);
        System.out.println("The merged list is: ");
        while( result != null ){
            System.out.print(result.val+" ");
            result = result.next;
        }
        sc.close();

    }
    
}

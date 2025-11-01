package LinkedList;
public class DeleteTheMiddleNode {

    // Node class represents a node in a linked list
    class Node {
    // Data stored in the node
    int data; 
     // Pointer to the next node in the list
    Node next;     

    // Constructor with both data
    // and next node as parameters
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor with only data as
    // a parameter, sets next to null
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public static void main(String[] args) {
    DeleteTheMiddleNode outer = new DeleteTheMiddleNode();
    
    // Display the original linked list
    Node head = outer.new Node(1);
    head.next = outer.new Node(2);
    head.next.next = outer.new Node(3);
    head.next.next.next = outer.new Node(4);
    head.next.next.next.next = outer.new Node(5);

    System.out.print("Original Linked List: ");
    outer.printLL(head);

    // Deleting the middle node
    head = outer.deleteMiddle(head);

    // Displaying the updated linked list
    System.out.print("Updated Linked List: ");
    outer.printLL(head);
}

// Function to delete the
// middle node of a linked list
Node deleteMiddle(Node head) {
    /* If the list is empty or has only one node,
       return null as there is no middle node to delete */
    if (head == null || head.next == null) {
        return null;
    }

    // Initialize slow and fast pointers
    Node slow = head;
    Node fast = head;
    fast = head.next.next;

    // Move 'fast' pointer twice as fast as 'slow'
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    // Delete the middle node by skipping it
    if (slow.next != null) {
        slow.next = slow.next.next;
    }
    return head;
}

void printLL(Node head) {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
}

    
}
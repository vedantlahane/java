package LinkedList;

public class NthNodeFromEnd {
    
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
    // This is the main function to find the nth node from the end of the linked list
    // The idea is to use two pointers, slow and fast. Move the fast pointer n nodes ahead of the slow pointer.
    // Then move both the pointers one by one until the fast pointer reaches the end of the linked list.
    // The slow pointer will be pointing to the nth node from the end of the linked list.
        
    public Node findNthNodeFromEnd(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i = 0; i < n; i++){
            if(fast == null) return null;
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main( String args[]){
        NthNodeFromEnd obj = new NthNodeFromEnd();
        Node head = null;
        head = obj.insert(head, 1);
        head = obj.insert(head, 2);
        head = obj.insert(head, 3);
        head = obj.insert(head, 4);
        head = obj.insert(head, 5);
        head = obj.insert(head, 6);
        head = obj.insert(head, 7);
        head = obj.insert(head, 8);
        head = obj.insert(head, 9);
        head = obj.insert(head, 10);
        obj.print(head);
        System.out.println();
        Node nthNode = obj.findNthNodeFromEnd(head, 3);
        System.out.println(nthNode.data);
    }
}

public class ReverseLinkedList {
    public static class Node{
        int data;
        Node next;
        Node( int data ){
            this.data = data;
            this.next = null;
        }
    }
    public static class LinkedList{
        Node head;
        LinkedList(){
            head = null;
        }
        void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
        void reverse(){
            Node prev = null;
            Node current = head;
            Node next = null;
            while( current != null ){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }
        void display(){
            Node temp = head;
            while( temp != null ){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

    }
    public static void main( String args[] ){
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        System.out.println("Original Linked List: ");
        ll.display();
        ll.reverse();
        System.out.println("\nReversed Linked List: ");
        ll.display();
    }
}

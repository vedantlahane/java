public class StackByLinkedList {
    // Inner class representing a doubly linked list
    public class DoublyLinkedList {
        Node head; // Reference to the head node

        // Inner class representing a node in the doubly linked list
        class Node {
            int data; // Data stored in the node
            Node next; // Reference to the next node
            Node prev; // Reference to the previous node

            Node(int data) {
                this.data = data;
            }
        }

        DoublyLinkedList() {
            head = null; // Initialize the head node to null
        }

        // Method to push an element onto the stack
        public void push(int data) {
            Node newNode = new Node(data); // Create a new node with the given data

            if (head == null) {
                head = newNode; // If the stack is empty, make the new node the head
            } else {
                newNode.next = head; // Set the next reference of the new node to the current head
                head.prev = newNode; // Set the previous reference of the current head to the new node
                head = newNode; // Update the head to the new node
            }
        }

        // Method to pop an element from the stack
        public void pop() {
            if (head == null) {
                System.out.println("Stack is empty"); // If the stack is empty, print an error message
            } else {
                head = head.next; // Move the head to the next node
                if (head != null) {
                    head.prev = null; // Set the previous reference of the new head to null
                }
            }
        }

        // Method to display the elements in the stack
        public void display() {
            Node temp = head; // Start from the head node

            while (temp != null) {
                System.out.println(temp.data); // Print the data of the current node
                temp = temp.next; // Move to the next node
            }
        }
        
        // Method to get the middle element from the stack
        public int getMiddle() {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow.data;
        }
    }

    public static void main(String[] args) {
        StackByLinkedList stack = new StackByLinkedList(); // Create an instance of the StackByLinkedList class
        DoublyLinkedList dll = stack.new DoublyLinkedList(); // Create an instance of the DoublyLinkedList class

        dll.push(10); // Push elements onto the stack
        dll.push(20);
        dll.push(30);

        dll.display(); // Display the elements in the stack

        dll.pop(); // Pop an element from the stack

        dll.display(); // Display the elements in the stack after popping

        int middleElement = dll.getMiddle(); // Get the middle element
        System.out.println("Middle element: " + middleElement);
    }
}
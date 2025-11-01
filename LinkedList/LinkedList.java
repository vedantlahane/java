public class LinkedList{
    static class Node{
        int data;
        Node next;

        public Node ( int value ){
            data = value;
            next = null;
        }
    }
    class MyLinkedList{
        Node head;
        public void insert (int value){
            Node newNode = new Node(value);
            if(head == null){
                head = newNode;

            }
            else{
                Node temp = head;
                while(temp.next !=null){
                    temp = temp.next;
                }
            }
        }
    }
    public static void main(String args[]){
        Node head = new Node(1);
        System.out.println("The value at head is " + head.data);
    }
}
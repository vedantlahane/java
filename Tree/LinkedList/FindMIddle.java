package Tree.LinkedList;

public class FindMIddle {
    
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

    public Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main( String args[]){
        FindMIddle obj = new FindMIddle();
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
        Node middle = obj.findMiddle(head);
        System.out.println(middle.data);
    }
}

package LinkedList;

public class SearchPos {
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

    // Function to search the position of a key in a linked list
    // Time complexity: O(n)
    // Space complexity: O(1)
    

    public int searchPos(Node head, int key){
        Node curr = head;
        int pos = 1;
        while(curr != null){
            if(curr.data == key){
                return pos;
            }
            pos++;
            curr = curr.next;
        }
        return -1;
    }

    public static void main( String args[]){
        SearchPos obj = new SearchPos();
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
        int pos = obj.searchPos(head, 5);
        System.out.println(pos);
    }
}

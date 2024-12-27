import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {



    public static class Stack{
        Queue<Integer> q = new LinkedList<Integer>();
        void push(int val){
            int size = q.size();
            q.add(val);
            for( int i = 0; i < size; i++){
                q.add(q.poll());
            }
        }
        int pop(){
            if( q.isEmpty()){
                System.out.println("Stack is empty.");
                return -1;
            }
            return q.poll();
        }
    }
    public static void main( String args[]){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
    
}

import java.util.Stack;
public class MinStack {
    class Pair {
        int x, y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    class MinStackClass {
        Stack < Pair > st;
        public MinStackClass() {
            st = new Stack < > ();
        }
    
        public void push(int x) {
            int min;
            if (st.isEmpty()) {
                min = x;
            } else {
                min = Math.min(st.peek().y, x);
            }
            st.push(new Pair(x, min));
        }
    
        public void pop() {
            st.pop();
        }
    
        public int top() {
            return st.peek().x;
        }
    
        public int getMin() {
            return st.peek().y;
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        MinStackClass obj = minStack.new MinStackClass();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        System.out.println(obj.top());
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }
}

import java.util.Scanner;
import java.util.Stack;

public class ReverseAndSwapStackElements {
    static void insert(Stack<Integer> stack, int num) {
        if (stack.isEmpty()) {
            stack.push(num);
            return;
        }
        int temp = stack.pop();
        insert(stack, num);
        stack.push(temp);
    }
    static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) return;
        int temp = stack.pop();
        reverse(stack);
        insert(stack, temp);
    }
    static void swap(Stack<Integer> stack) {
        if (stack.size() >= 2) {
            Stack<Integer>Stack1= new Stack<>();
            while (stack.size() > 2) {
                Stack1.push(stack.pop());
            }
            int f= stack.pop();
            int s= stack.pop();
            stack.push(f);
            stack.push(s);
            while(!Stack1.isEmpty()) {
                stack.push(Stack1.pop());
            }
        }
    }
    static void print(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        boolean first = true;
        while (!temp.isEmpty()) {
            if (!first) {
                System.out.print(" ");
            }
            int element = temp.pop();
            System.out.print(element);
            stack.push(element);
            first = false;
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Original Stack: ");
        String[] input = sc.nextLine().trim().split("\\s+");
        
        for (String val: input) {
            stack.push(Integer.parseInt(val));
        }
        reverse(stack);
        System.out.println("Reversed Stack: ");
        print(stack);
        swap(stack);
        System.out.println("Swapped Stack: ");
        print(stack);
        sc.close();
    }
}

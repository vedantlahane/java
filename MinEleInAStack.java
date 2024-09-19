import java.util.Scanner;

public class MinEleInAStack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack: ");
        int n = sc.nextInt();
        int stack[] = new int[n];
        int stack2[] = new int[n];
        int top = 0;
        while (true) {
            System.out.println("1. Push in stack");
            System.out.println("2. Pop from stack");
            System.out.println("3. Get minimum element from stack");
            System.out.println("4. Display stack");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (top == n) {
                        System.err.println("Stack is full");
                    } else {
                        System.out.println("Enter the element to push in stack 1: ");
                        int ele = sc.nextInt();
                        
                        stack[top] = ele;
                        stack2[0] = stack[0];
                        if (top == 0) {
                            stack2[top] = ele;
                        } else {
                            stack2[top] = Math.min(stack2[top], ele);
                        }
                        top++;
                    }
                    break;
                
                case 2:
                    if (top == 0) {
                        System.err.println("Stack  is empty");
                    } else {
                        top--;
                        System.out.println("Popped element from stack : " + stack[top]);
                    }
                    break;
                case 3:
                    if (top == 0) {
                        System.err.println(" Stack is empty");
                    } else {
                        System.out.println("Min element is: " + stack2[top]);
                    }
                case 4:
                    if (top == 0) {
                        System.err.println("Stack is empty");
                    } else {
                        System.out.println("Elements of stack are: ");
                        for (int i = 0; i < top; i++) {
                            System.out.print(stack[i] + " ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Invalid choice");

            }
        }
    }
}

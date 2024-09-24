import java.util.Scanner;

public class SortedStack {
    private int[] stack;
    private int top;
    private int maxSize;

    public SortedStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            stack[++top] = data;
            System.out.println("Element pushed to stack.");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
        } else {
            System.out.println("Element popped from stack: " + stack[top--]);
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot display elements.");
        } else {
            System.out.println("Elements in the stack are: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public void sortStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot sort elements.");
        } else {
            int[] tempStack = new int[stack.length];
            int tempTop = -1;
            while (!isEmpty()) {
                int temp = stack[top--];
                while (tempTop != -1 && tempStack[tempTop] > temp) {
                    stack[++top] = tempStack[tempTop--];
                }
                tempStack[++tempTop] = temp;
            }
            while (tempTop != -1) {
                stack[++top] = tempStack[tempTop--];
            }
            System.out.println("Stack sorted successfully.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxSize = 100;
        System.out.println("Max size of the stack is: " + maxSize);
        SortedStack sortedStack = new SortedStack(maxSize);
        int choice;
        do {
            System.out.println("1. Push element to stack");
            System.out.println("2. Pop element from stack");
            System.out.println("3. Display elements in stack");
            System.out.println("4. Sort elements in stack");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to push: ");
                    int data = sc.nextInt();
                    sortedStack.push(data);
                    break;
                case 2:
                    sortedStack.pop();
                    break;
                case 3:
                    sortedStack.display();
                    break;
                case 4:
                    sortedStack.sortStack();
                    break;
                case 5:
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        } while (choice != 5);
        sc.close();
    }
}
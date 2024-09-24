import java.util.Scanner;

public class HalfRevStack {
    private int[] stack;
    private int top;
    private int maxSize;

    public HalfRevStack(int maxSize) {
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

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; // Return a sentinel value indicating the stack is empty
        } else {
            int poppedElement = stack[top--];
            System.out.println("Element popped from stack: " + poppedElement);
            return poppedElement;
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

    public void halfReverseStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot reverse elements.");
        } else {
            int halfSize = (top + 1) / 2;
            for (int i = 0; i < halfSize / 2; i++) {
                int temp = stack[i];
                stack[i] = stack[halfSize - 1 - i];
                stack[halfSize - 1 - i] = temp;
            }
            System.out.println("First half of the stack reversed successfully.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxSize = 100;
        System.out.println("Max size of the stack is: " + maxSize);
        HalfRevStack halfRevStack = new HalfRevStack(maxSize);
        int choice;
        do {
            System.out.println("1. Push element to stack");
            System.out.println("2. Pop element from stack");
            System.out.println("3. Display elements in stack");
            System.out.println("4. Sort elements in stack");
            System.out.println("5. Reverse first half of the stack");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to push: ");
                    int data = sc.nextInt();
                    halfRevStack.push(data);
                    break;
                case 2:
                    halfRevStack.pop();
                    break;
                case 3:
                    halfRevStack.display();
                    break;
                case 4:
                    halfRevStack.sortStack();
                    break;
                case 5:
                    halfRevStack.halfReverseStack();
                    break;
                case 6:
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        } while (choice != 6);
        sc.close();
    }
}

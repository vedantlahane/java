import java.util.Scanner;
public class TwoStackOneArrayII {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int top1 = -1;
        int top2 = n;
        while(true){
            System.out.println("1. Push in stack 1");
            System.out.println("2. Push in stack 2");
            System.out.println("3. Pop from stack 1");
            System.out.println("4. Pop from stack 2");
            System.out.println("5. Display stack 1");
            System.out.println("6. Display stack 2");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    if(top1 == n/2 - 1){
                        System.err.println("Stack 1 is full");
                    }
                    else{
                        System.out.println("Enter the element to push in stack 1: ");
                        int ele = sc.nextInt();
                        top1++;
                        arr[top1] = ele;
                    }
                    break;
                case 2:
                    if(top2 == n/2){
                        System.err.println("Stack 2 is full");
                    }
                    else{
                        System.out.println("Enter the element to push in stack 2: ");
                        int ele = sc.nextInt();
                        top2--;
                        arr[top2] = ele;
                    }
                    break;
                case 3:
                    if(top1 == -1){
                        System.err.println("Stack 1 is empty");
                    }
                    else{
                        System.out.println("Popped element from stack 1: " + arr[top1]);
                        top1--;
                    }
                    break;
                case 4:
                    if(top2 == n){
                        System.err.println("Stack 2 is empty");
                    }
                    else{
                        System.out.println("Popped element from stack 2: " + arr[top2]);
                        top2++;
                    }
                    break;
                case 5:
                    if(top1 == -1){
                        System.err.println("Stack 1 is empty");
                    }
                    else{
                        System.out.println("Elements of stack 1 are: ");
                        for(int i = 0; i <= top1; i++){
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    if(top2 == n){
                        System.err.println("Stack 2 is empty");
                    }
                    else{
                        System.out.println("Elements of stack 2 are: ");
                        for(int i = n - 1; i >= top2; i--){
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Invalid choice");
            }
            //sc.close();
        }

    }
}

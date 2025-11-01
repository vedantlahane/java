import java.util.Scanner;
public class TwoStackInOneArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int top1 = 0;
        int top2 = n/2;
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
                    if(top1 == n/2){
                        System.err.println("Stack 1 is full");
                    }
                    else{
                        System.out.println("Enter the element to push in stack 1: ");
                        int ele = sc.nextInt();
                        arr[top1] = ele;
                        top1++;
                    }
                    break;
                case 2:
                    if(top2 == n){
                        System.err.println("Stack 2 is full");
                    }
                    else{
                        System.out.println("Enter the element to push in stack 2: ");
                        int ele = sc.nextInt();
                        arr[top2] = ele;
                        top2++;
                    }
                    break;
                case 3:
                    if(top1 == 0){
                        System.err.println("Stack 1 is empty");
                    }
                    else{
                        top1--;
                        System.out.println("Popped element from stack 1: " + arr[top1]);
                    }
                    break;
                case 4:
                    if(top2 == n/2){
                        System.err.println("Stack 2 is empty");
                    }
                    else{
                        top2--;
                        System.out.println("Popped element from stack 2: " + arr[top2]);
                    }
                    break;
                case 5:
                    if(top1 == 0){
                        System.err.println("Stack 1 is empty");
                    }
                    else{
                        System.out.println("Elements of stack 1 are: ");
                        for(int i = 0; i < top1; i++){
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 6: 
                    if(top2 == n/2){
                        System.err.println("Stack 2 is empty");
                    }
                    else{
                        System.out.println("Elements of stack 2 are: ");
                        for(int i = n/2; i < top2; i++){
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println("\n");
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

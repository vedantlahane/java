
import java.util.*;
public class NextGreaterElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] nextGreater = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nextGreater[i] = -1; // No greater element found
            } else {
                nextGreater[i] = stack.peek(); // Next greater element
            }
            stack.push(arr[i]); // Push current element onto the stack
        }
        System.out.println("Next greater elements for each position in the array:");
        for(int i = 0; i < n; i++){
            System.out.println("Element: " + arr[i] + ", Next Greater: " +  nextGreater[i]);
        }
        sc.close();
    }
}

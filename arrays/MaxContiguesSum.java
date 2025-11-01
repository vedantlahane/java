import java.util.Scanner;
/**
 * The MaxContiguesSum class provides a method to find the maximum contiguous sum in an array of integers.
 * 
 * The main method performs the following steps:
 * 1. Prompts the user to enter the size of the array.
 * 2. Reads the size of the array from the user input.
 * 3. Initializes an array of the specified size.
 * 4. Prompts the user to enter the elements of the array.
 * 5. Reads the elements of the array from the user input.
 * 6. Uses Kadane's algorithm to find the maximum contiguous sum in the array.
 * 7. Prints the maximum contiguous sum.
 * 8. Closes the Scanner object.
 * 
 * Kadane's algorithm works by iterating through the array and at each position, 
 * it calculates the maximum sum of the subarray ending at that position. 
 * It keeps track of the maximum sum encountered so far.
 * 
 * Note: The program assumes that the user will enter valid integers and a valid size for the array.
 */
public class MaxContiguesSum {
    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int maxSum = arr[0];
        int currentSum = arr[0];
        for(int i = 1; i < n; i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Maximum contiguous sum is: " + maxSum);
        sc.close();
    }
}



import java.util.Scanner;
/**
 * The DutchFlagSort class provides a method to sort an array consisting of 0s, 1s, and 2s
 * using the Dutch National Flag algorithm.
 * 
 * The main method reads an array from the user, sorts it, and prints the sorted array.
 * 
 * Steps:
 * 1. Read the size of the array from the user.
 * 2. Read the elements of the array from the user.
 * 3. Initialize three pointers: low, mid, and high.
 * 4. Traverse the array and sort the elements such that all 0s are at the beginning,
 *    all 1s are in the middle, and all 2s are at the end.
 * 5. Print the sorted array.
 * 
 * Usage:
 * Run the program and input the size and elements of the array when prompted.
 * The program will output the sorted array.
 * 
 * Example:
 * Input:
 * Enter the size of the array: 
 * 5
 * Enter the elements of the array: 
 * 2 0 1 2 0
 * 
 * Output:
 * The array after sorting is: 
 * 0 0 1 2 2
 * 
 * Note:
 * The input array should only contain 0s, 1s, and 2s for the algorithm to work correctly.
 */
public class DutchFlagSort{
    public static void main( String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int low = 0, mid = 0, high = n-1;
        while( mid <= high ){
            if( arr[mid] == 0 ){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;

            }
            else if( arr[mid] == 1 ){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.println("The array after sorting is: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
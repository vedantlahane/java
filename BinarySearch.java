import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch( int[] arr, int n){
        int low = 0;
        int high = arr.length;
        while(low <= high){
            int mid = low + (high - low)/2;
            if( arr[mid] == n){
                System.out.println("Element found at index: " + mid);
                return mid;
            }
            else if( arr[mid] < n){
                low = mid +1;
            }
            else{
                high = mid -1;
            }

        }
        System.out.println("Element not found");
        return -1;
    }
    public static void main( String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array in sorted order: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int x = sc.nextInt();
        int result = binarySearch(arr, x);
        System.out.println("Element found at index: " + result);
        sc.close();
    }
}

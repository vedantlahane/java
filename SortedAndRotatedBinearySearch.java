import java.util.Scanner;
public class SortedAndRotatedBinearySearch {
    public static int BinarySearch( int arr[], int low, int high, int x ){
        if( low > high ){//If the element is not found
            return -1;
        }
        int mid = low + (low - high)/2;// To avoid overflow of integers in case of large numbers we use this formula instead of (low+high)/2 
        if( arr[mid] == x ){
            return mid;
        }
        if( arr[low] <= arr[mid] ){//Checking if the left half is sorted
            if( x >= arr[low] && x <= arr[mid] ){
                return BinarySearch( arr, low, mid-1, x);//If the element lies in the left half
            }
            return BinarySearch( arr, mid+1, high, x);//If the element lies in the right half
        }
        if( x >= arr[mid] && x <= arr[high] ){//Checking if the right half is sorted
            return BinarySearch( arr, mid+1, high, x);//If the element lies in the right half
        }
        return BinarySearch( arr, low, mid-1, x);//If the element lies in the left half
    }

    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for( int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int x = sc.nextInt();
        int low = 0;
        int high = n-1;
        int result = BinarySearch(arr, low, high, x);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

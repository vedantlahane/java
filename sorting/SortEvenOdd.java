import java.util.Arrays;
import java.util.Scanner;

public class SortEvenOdd {
    public int[] sortEvenOdd(int[] nums) {
       int n = nums.length;
        int[] even = new int[(n + 1) / 2];
        int[] odd = new int[n / 2];       
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even[i / 2] = nums[i]; 
            } else {
                odd[i / 2] = nums[i]; 
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        for (int i = 0; i < odd.length / 2; i++) {
            int temp = odd[i];
            odd[i] = odd[odd.length - 1 - i];
            odd[odd.length - 1 - i] = temp;
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = even[i / 2];
            } else {
                nums[i] = odd[i / 2];
            }
        }

        return nums;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for( int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        SortEvenOdd obj = new SortEvenOdd();
        int result[] = obj.sortEvenOdd(arr);
        System.out.println("The sorted array is: ");
        for( int i = 0 ; i < n ; i++ ){
            System.out.print(result[i]+" ");
        }
        sc.close();    
    }
}

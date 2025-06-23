import java.util.*;
public class MaxSumOFSubArrayLessThanKWithNegativeNums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        int tempStart = 0;
        int maxStart = -1, maxEnd = -1;
        for(int end = 0; end < n; end++){
            currentSum += arr[end];
            while(currentSum >= k && tempStart <= end){ 
                currentSum -= arr[tempStart];
                tempStart++;
            }
            if(currentSum < k && currentSum > max){
                max = currentSum;
                maxStart = tempStart;
                maxEnd = end;
            }
        }
        if(max == Integer.MIN_VALUE) {
            System.out.println("No subarray found with sum less than " + k);
        } else {
            System.out.println("Maximum sum of subarray with sum less than " + k + " is: " + max);
            System.out.println("Subarray: ");
            for(int i = maxStart; i <= maxEnd; i++) System.out.print(arr [i] + " ");
            System.out.println();
        

    }
}

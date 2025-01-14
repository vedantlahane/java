import java.util.Scanner;
public class KadanesAlgo {
    public static int maxSubArraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for( int i = 0 ; i < arr.length ; i++ ){
            sum += arr[i];
            if( sum > maxSum ) maxSum = sum;
            if( sum < 0 ) sum = 0;
        }
        return maxSum;
    }
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for( int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArraySum(arr));
        sc.close();
    }
}

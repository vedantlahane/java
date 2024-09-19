import java.util.Scanner;
public class ProductOfArrayExceptSelf {
    public static int[] Approach1(int nums[], int n){
        
        int ans[] = new int[n];
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = 1;
        right[n-1] = 1;
        for(int i = 1; i < n; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        for(int i = n-2; i >= 0; i--){
            right[i] = right[i+1] * nums[i+1];
        }
        for(int i = 0; i < n; i++){
            ans[i] = left[i] * right[i];
        }
        return ans;

    }
    public static int[] Approach2(int nums[], int n){
        int ans[] = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            ans[i] = 1 ;
        }
        for( int i = 0, pre = 1 ; i < n ; i++ ){
            ans[i] *= pre;
            pre *= nums[i];
        }
        for( int i = n-1, pre = 1 ; i >=0  ; i-- ){
            ans[i] *= pre;
            pre *= nums[i];
        }
        return ans;
    }
    public  static void main( String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int ans[] = Approach1(nums, n);
        System.out.println("The array after multiplying all elements except self by approach 1 is: ");
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        ans = Approach2(nums, n);
        System.out.println("The array after multiplying all elements except self by approach 2 is: ");
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
    
}

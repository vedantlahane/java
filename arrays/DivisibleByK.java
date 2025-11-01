/*
Given an array of integers arr of even length n and an integer k,
we want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.
Return true if you can find a way to do that or false otherwise.

Example 1:
Input: arr = [1,2,3,4,5,10,6,7,8,9], k = 5
Output: true
Explanation: Pairs are (1,9),(2,8),(3,7),(4,6) and (5,10).

Example 2:
Input: arr = [1,2,3,4,5,6], k = 7
Output: true
Explanation: Pairs are (1,6),(2,5) and(3,4).

Example 3:
Input: arr = [1,2,3,4,5,6], k = 10
Output: false
Explanation: You can try all possible pairs to see that there is no way to divide arr into 3 pairs each with sum divisible by 10.

Constraints:
arr.length == n
1 <= n <= 10^5
n is even.
-10^9 <= arr[i] <= 10^9
1 <= k <= 10^5
*/


import java.util.Scanner;
public class DivisibleByK {
    public static boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];
        for (int num : arr) {
            num = (num % k + k) % k;
            freq[num]++;
        }
        if (freq[0] % 2 != 0) {
            return false;
        }
        for (int i = 1; i <= k / 2; i++) {
            if (freq[i] != freq[k - i]) {
                return false;
            }
        }
        return true;
    }
    public static void main( String args[] ){
        Scanner sc= new Scanner ( System.in );
        System.err.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.err.println("Enter the elements of the array: ");
        for ( int i = 0; i < n; i++ ){
            arr[i] = sc.nextInt();
        }
        System.err.println("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println(canArrange(arr, k));

    }
}

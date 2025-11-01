// Minimum Step To One

// Problem statement is very easy. On a positive integer, you can perform any one of the following 3 steps.

// Subtract 1 from it. (n = n - 1)
// If it is divisible by 2, divide by 2. (if n % 2 == 0, then n = n / 2)
// If it is divisible by 3, divide by 3. (if n % 3 == 0, then n = n / 3)
// Given a positive integer n and you task is find the minimum number of steps that takes n to one.

// Input
// // The input contains an integer T (1 ≤ T ≤ 100) number of test cases. Second line input is N (0 < N ≤ 2*107) that indicates the positive number.

// Output
// For each case, print the case number and the minimum number of steps.

// Example
// Input:
// 3
// 1
// 4
// 7

// Output:
// Case 1: 0
// Case 2: 2
// Case 3: 3
// Explanation
// For N = 1, output: 0
// For N = 4, output: 2 (4 /2 = 2 /2 = 1)
// For N = 7, output: 3 ( 7 -1 = 6 /3 = 2 /2 = 1)

import java.util.*;
public  class MinimumStepToOne{
    public static int[] dp ;
    public static int minStep(int n){
        if(n == 1) return 0;

        if(dp[n] != -1) return dp[n];


        int opt1 = Integer.MAX_VALUE; // Initialize to a large value
        int opt2 = Integer.MAX_VALUE;

        if(n%3 == 0) opt1 = 1 + minStep(n/3);
        if(n%2 == 0) opt2 = 1 + minStep(n/2);
        int opt3 = 1 + minStep(n-1);
        int ans = Math.min(opt1, Math.min(opt2, opt3));
        dp[n] = ans;
        return ans;
    }

    public static void main( String args[]){
        Scanner sc = new Scanner( System.in );
        int t = sc.nextInt();
        int c = 0;
        while (c < t){
            int n = sc.nextInt();
            dp = new int[n+1];
            Arrays.fill(dp, -1);
            System.out.println("Case" +  c +": " +  minStep(n));
            c++;
        }
        sc.close();
    }
}
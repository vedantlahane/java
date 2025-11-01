package DynamicProgramming;


/**
 * This program solves the 0/1 Knapsack Problem using dynamic programming.
 * 
 * Problem Statement:
 * Given a set of items, each with a weight and a value, determine the number of each item to include in a collection 
 * so that the total weight is less than or equal to a given limit and the total value is as large as possible.
 * 
 * The 0/1 Knapsack Problem does not allow breaking of items. You either take the whole item or don't take it at all.
 * 
 * Input:
 * - The number of items (n).
 * - The maximum weight capacity of the knapsack (w).
 * - The weights of the items (wt[]).
 * - The values of the items (val[]).
 * 
 * Output:
 * - The maximum value that can be obtained with the given weight capacity.
 * 
 * Example:
 * Enter the number of items and the weight of the knapsack
 * 4 50
 * Enter the weight and value of the items
 * Enter the weight of the items
 * 10 20 30 40
 * Enter the value of the items
 * 60 100 120 240
 * The maximum value that can be obtained is:
 * 360
 */

 
import java.util.Scanner;
public class KnapSnackProblem01 {
    public static void main( String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items and the weight of the knapsack");
        int n = sc.nextInt();
        System.out.println("Enter the weight and value of the items");
        int w = sc.nextInt();
        int[] wt = new int[n];
        int[] val = new int[n];
        System.out.println("Enter the weight of the items");
        for(int i=0; i<n; i++){
            wt[i] = sc.nextInt();
        }
        System.out.println("Enter the value of the items");
        for(int i=0; i<n; i++){
            val[i] = sc.nextInt();
        }
        int[][] dp = new int[n+1][w+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=w; j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
                else if(wt[i-1] <= j){
                    dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println("The maximum value that can be obtained is:");
        System.out.println(dp[n][w]);
        sc.close();
    }
    
}

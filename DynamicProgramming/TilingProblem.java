package DynamicProgramming;

//given a " 4 * n " grid, find the number of ways to tile the grid using 1 * 4 tiles
//tiles can be placed horizontally or vertically
import java.util.Scanner;
public class TilingProblem {
    public static void recursive(int n){
        if(n == 0){
            System.out.println("0");
            return;
        }
        if(n == 1){
            System.out.println("1");
            return;
        }
        if(n == 2){
            System.out.println("1");
            return;
        }
        if(n == 3){
            System.out.println("1");
            return;
        }
        if(n == 4){
            System.out.println("2");
            return;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        for(int i = 5; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-4];
        }
        System.out.println(dp[n]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursive(n);
        sc.close();
    }
    
}

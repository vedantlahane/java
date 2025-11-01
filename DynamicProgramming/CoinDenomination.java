package DynamicProgramming;
import java.util.Scanner;
public class CoinDenomination {
    public static int coinChange( int coins[], int amount ){
        int dp[][] = new int[coins.length+1][amount+1];
        for( int i=0; i<=coins.length; i++ ){
            dp[i][0] = 0;
        }
        int max = amount+1;
        for( int i=1; i<=amount; i++ ){
            dp[0][i] = max;
        }
        for( int i=1; i<=coins.length; i++ ){
            for( int j=1; j<=amount; j++ ){
                if( j<coins[i-1] ){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = Math.min( dp[i-1][j], dp[i][j-coins[i-1]]+1 );
                }
            }
        }
        return dp[coins.length][amount]>amount?-1:dp[coins.length][amount];

    }
    public static void main( String args[] ){
        Scanner sc= new Scanner( System.in );
        System.out.println("Enter the number of coins: ");
        int n= sc.nextInt();
        System.out.println("Enter the value of the coins: ");
        int coins[] = new int[n];
        for( int i=0; i<n; i++ ){
            coins[i] = sc.nextInt();
        }
        System.out.println("Enter the amount: ");
        int amount = sc.nextInt();
        int result = coinChange( coins, amount );
        System.out.println("The minimum number of coins required to make up the amount is: "+result);
        sc.close();


    }
}

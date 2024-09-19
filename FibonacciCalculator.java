import java.util.Scanner;
public class FibonacciCalculator {
    public static int naiveApproach( int n ){
        if( n <= 1){
            return n;
        }
        return naiveApproach(n-1) + naiveApproach(n-2);
    }
    public static int memoization( int n, int memo[]){//Top down approach
        if( memo[n] != -1){
            return memo[n];
        }
        else{
            if( n <= 1){
                memo[n] = n;
            }
            else{
                memo[n] = memoization(n-1, memo) + memoization(n-2, memo);
            }
            return memo[n];
        }

        
    }
    public static int tabulation( int n ){//Bottom up approach
        int tabu[] = new int[n+1];
        tabu[0] = 0;
        tabu[1] = 1;
        for( int i = 2; i <= n; i++){
            tabu[i] = tabu[i-1] + tabu[i-2];
        }
        return tabu[n];
    }
    public static void main( String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be calculated: ");
        int n = sc.nextInt();
        System.out.println("The fibonacci number is : " + naiveApproach(n));
        int memo[] = new int[n+1];
        for( int i = 0; i <= n; i++){
            memo[i] = -1;
        }
        System.out.println("The fibonacci number is : " + memoization(n, memo));
        System.out.println("The fibonacci number is : " + tabulation(n));



    }
}

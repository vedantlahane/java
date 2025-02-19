import java.util.Scanner;

public class DorceyTheif {

    public static long maxValue( long a[], long b[], int N, long C ){
        long dp[][] = new long[N][2];
        for( int i = 0; i < N; i++ ){
            dp[i][0] = a[i];
            dp[i][1] = b[i];
        }
        long total = 0;
        for( int i = 0; i < N; i++ ){
            long sum = 0;
            for( int j = 0; j < N; j++ ){
                sum += dp[j][0];
                if( sum > C ){
                    sum -= dp[j][0];
                    break;
                }
            }
            total = Math.max(total, sum);
        }
        return total;
    }
    public static void main( String srgs[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long C = sc.nextLong();
        long a[] = new long[N];
        long b[] = new long[N];
        for( int i = 0; i < N; i++ ){
            a[i] = sc.nextLong();
        }
        for( int i = 0; i < N; i++ ){
            b[i] = sc.nextLong();
        }

    }
}

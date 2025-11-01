package DynamicProgramming;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Scanner;

public class MaxProfitJobScheduling {
    public static int jobScheduling( int startTime[], int endTime[], int profit[] ){
        int n = startTime.length;
        int jobs[][] = new int[n][3];
        for( int i=0; i<n; i++ ){
            jobs[i] = new int[]{ startTime[i], endTime[i], profit[i] };
        }
        Arrays.sort( jobs, (a,b)->a[1]-b[1] );
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0,0);
        for( int job[]: jobs ){
            int cur = dp.floorEntry( job[0] ).getValue() + job[2];
            if( cur > dp.lastEntry().getValue() ){
                dp.put( job[1], cur );
            }
        }
        return dp.lastEntry().getValue();
    }
    public static void main( String args[] ){
        Scanner sc= new Scanner( System.in );
        System.out.println("Enter the number of jobs: ");
        int n= sc.nextInt();
        int startTime[] = new int[n];
        int endTime[] = new int[n];
        int profit[] = new int[n];
        System.out.println("Enter the start time of the jobs: ");
        for( int i=0; i<n; i++ ){
            startTime[i] = sc.nextInt();
        }
        System.out.println("Enter the end time of the jobs: ");
        for( int i=0; i<n; i++ ){
            endTime[i] = sc.nextInt();
        }
        System.out.println("Enter the profit of the jobs: ");
        for( int i=0; i<n; i++ ){
            profit[i] = sc.nextInt();
        }
        int result = jobScheduling( startTime, endTime, profit );
        System.out.println("The maximum profit that can be obtained is: "+result);
        sc.close();
    }
}

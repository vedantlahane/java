// You have planned some train traveling one year in advance. The days of the year in which you will travel are given as an integer array days. Each day is an integer from 1 to 365.

// Train tickets are sold in three different ways:

// a 1-day pass is sold for costs[0] dollars,
// a 7-day pass is sold for costs[1] dollars, and
// a 30-day pass is sold for costs[2] dollars.
// The passes allow that many days of consecutive travel.

// For example, if we get a 7-day pass on day 2, then we can travel for 7 days: 2, 3, 4, 5, 6, 7, and 8.
// Return the minimum number of dollars you need to travel every day in the given list of days.

import java.util.Scanner;

public class MinCostForTicket {

    public int mincostTickets(int[] days, int[] costs) {

        int max = days[ days.length - 1];
        boolean[] travel = new boolean[ max + 1];

        for( int day : days ){
            travel[day] = true;
        }

        int dp[] = new int[ max + 1];

        dp[0] = 0;

        for( int i =1 ; i <= max; i++ ){
            if( !travel[i] ){
                dp[i] = dp[i-1];
                continue;
            }

            dp[i] = costs[0] + dp[i - 1];
            dp[i] = Math.min(dp[Math.max(0, i - 7)] + costs[1], dp[i]);
            dp[i] = Math.min(dp[Math.max(0, i - 30)] + costs[2], dp[i]);
        }

        return dp[max];
        
    }

    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter the number of days you will travel: ");
        int n = sc.nextInt();
        int days[] = new int[n];
        System.out.println("Enter the days you will travel: ");
        for( int i = 0; i < n; i++ ){
            days[i] = sc.nextInt();
        }
        System.out.println("Enter the cost of 1-day pass: ");
        int cost1 = sc.nextInt();
        System.out.println("Enter the cost of 7-day pass: ");
        int cost7 = sc.nextInt();
        System.out.println("Enter the cost of 30-day pass: ");
        int cost30 = sc.nextInt();
        int costs[] = {cost1, cost7, cost30};
        MinCostForTicket obj = new MinCostForTicket();
        System.out.println("Minimum cost for the tickets: " + obj.mincostTickets(days, costs));
        sc.close();
    }


    
}

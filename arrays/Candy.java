// Problem Statement:
// Given the number of children and their respective ratings, distribute candies to the children such that:
// 1. Each child must have at least one candy.
// 2. Children with a higher rating get more candies than their neighbors.
// The goal is to determine the minimum number of candies required to satisfy these conditions.

import java.util.Scanner;
public class Candy {
    public static void main( String args[] ){
        Scanner sc = new Scanner ( System.in );
        System.out.println("Enter the number of children: ");
        int n = sc.nextInt();
        System.out.println("Enter the ratings of the children: ");
        int ratings[] = new int[n];
        for( int i=0; i<n; i++ ){
            ratings[i] = sc.nextInt();
        }
        int candies[] = new int[n];
        for( int i=0; i<n; i++ ){
            candies[i] = 1;
        }
        for( int i=1; i<n; i++ ){
            if( ratings[i]>ratings[i-1] ){
                candies[i] = candies[i-1]+1;
            }
        }
        for( int i=n-2; i>=0; i-- ){
            if( ratings[i]>ratings[i+1] ){
                candies[i] = Math.max( candies[i], candies[i+1]+1 );
            }
        }
        int sum = 0;
        System.out.println("The number of candies given to each child is: ");
        for( int i=0; i<n; i++ ){
            System.out.print(candies[i]+" ");
            sum += candies[i];
        }
        System.out.println();
        System.out.println("The minimum number of candies required is: "+sum);
        sc.close();

    }
}

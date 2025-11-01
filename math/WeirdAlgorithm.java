// Consider an algorithm that takes as input a positive integer 

// n. If  n is even, the algorithm divides it by two, and if 

// n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until 

// n is one. For example, the sequence for 

// n=3 is as follows:
// 3→10→5→16→8→4→2→1
// Your task is to simulate the execution of the algorithm for a given value of 
// n
// n.

// Input
// The only input line contains an integer 
// n
// n.

// Output
// Print a line that contains all values of 
// n
// n during the algorithm.

// Constraints
// 1≤n≤10 
// 6
 
// Example
// Input:

// 3
// Output:

// 3 10 5 16 8 4 2 1

import java.util.Scanner;
public class WeirdAlgorithm {

    public static void recursive(long n){
        System.out.print(n + " ");
        if(n == 1){
            return;
        }
        if(n % 2 == 0){
            recursive(n/2);
        }else{
            recursive(3*n + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        recursive(n);
        sc.close();
    }
    
}

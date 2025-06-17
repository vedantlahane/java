//GCD is the greatest common divisor qand LCM is the least common multiple of two numbers.
//Appraoch is to use recursion in which we will fing GCCD using Euclidean Algo.
//Algo says that GCD of two numbers a and b is same as GCD of b and a % b.

import java.util.Scanner;
public class GCDandLCM {

    public static int findGCD(int a, int b){
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
        sc.close();
    }
}

// Problem Statement:
// Write a Java program to find and print all prime factors of a given number.
// A prime factor is a factor that is a prime number. The program should take an integer input from the user and output its prime factors.

// Algorithm:
// 1. Define a method `isPrime` to check if a number is prime.
// 2. Define a method `printPrimeFactors` to print all prime factors of a given number.
// 3. In the `main` method, take an integer input from the user.
// 4. Call `printPrimeFactors` with the input number to print its prime factors.

import java.util.Scanner;
public class PrimeFactor {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void printPrimeFactors(int n) {
        for (int i = 2; i <= n; i++) {
            while (isPrime(i) && n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Prime factors of " + n + " are: ");
        printPrimeFactors(n);
    }
}

//take input in range

import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower bound of the range:");
        int lb= sc.nextInt();
        System.out.println("Enter the upper bound of the range:");
        int ub = sc.nextInt();
        System.out.println("Prime numbers in the range " + lb+ " to " + ub+ ":");
        for (int i = lb; i <= ub; i++) if(isPrime(i))System.out.print(i + " ");
        sc.close();
    }

    private static boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i = 2; i <= Math.sqrt(num); i++) if (num % i == 0) return false;
        return true;
    }
}
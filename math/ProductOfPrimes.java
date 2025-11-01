import java.util.Scanner;

public class ProductOfPrimes {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(i); i++) {
            if (n % 1 == 0)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                ans *= i;

            }
        }
        System.out.println("The product of prime numbers upto " + n + " is: " + ans);
    }
}

import java.util.Scanner;

public class PsmoothNumber {
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

    public static boolean isPSmooth(int n, int P) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (isPrime(i) && i > P) {
                    return false;
                }
                n /= i;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter a P number: ");
        int P = sc.nextInt();
        System.out.print("Prime factors of " + n + " are: ");
        printPrimeFactors(n);
        System.out.println();
        if (isPSmooth(n, P)) {
            System.out.println(n + " is a " + P + "-smooth number.");
        } else {
            System.out.println(n + " is not a " + P + "-smooth number.");
        }
        sc.close();
    }
    
}

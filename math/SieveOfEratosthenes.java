import java.util.*;

public class SieveOfEratosthenes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range for prime numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean isPrime[];
        if (a > b)
            isPrime = new boolean[a + 1];
        else
            isPrime = new boolean[b + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i < isPrime.length; i++) {
            if (isPrime[i])
                for (int j = 2 * i; j < isPrime.length; j += i)
                    isPrime[j] = false;
        }

        System.out.print("Prime numbers in the range are: ");
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++)
            if (isPrime[i])
                System.out.print(i + " ");
        sc.close();
    }
}

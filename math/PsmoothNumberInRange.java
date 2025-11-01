import java.util.Scanner;

/**
 * PsmoothNumberInRange is a utility class that provides methods to determine
 * and find P-smooth numbers within a specified range.
 *
 * A P-smooth number is a number that has no prime factors greater than P.
 * For example, if P=5, the P-smooth numbers are those numbers whose prime factors
 * are less than or equal to 5 (i.e., 2, 3, and 5).
 *
 * This class contains the following methods:
 *
 * 1. isPsmooth(int num, int p):
 *    - Determines if a given number is P-smooth.
 *    - @param num The number to be checked.
 *    - @param p The maximum allowed prime factor.
 *    - @return true if the number is P-smooth, false otherwise.
 *
 * 2. findPsmoothNumbersInRange(int start, int end, int p):
 *    - Finds and prints all P-smooth numbers within a specified range.
 *    - @param start The starting value of the range (inclusive).
 *    - @param end The ending value of the range (inclusive).
 *    - @param p The maximum allowed prime factor for the numbers in the range.
 *
 * The main method allows users to input the range and the value of P,
 * and then prints all P-smooth numbers within that range.
 *
 * Usage:
 * - Run the program.
 * - Input the starting value of the range.
 * - Input the ending value of the range.
 * - Input the value of P.
 * - The program will output all P-smooth numbers within the specified range.
 */
public class PsmoothNumberInRange {
    public static boolean isPsmooth(int num, int p) {
        for (int i = 2; i <= p; i++) {
            while (num % i == 0) {
                num /= i;
            }
        }
        return num == 1;
    }

    public static void findPsmoothNumbersInRange(int start, int end, int p) {
        for (int i = start; i <= end; i++) {
            if (isPsmooth(i, p)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();
        System.out.print("Enter the value of p: ");
        int p = sc.nextInt();
        System.out.println("P-smooth numbers in the range:");
        findPsmoothNumbersInRange(start, end, p);
        sc.close();
    }
}

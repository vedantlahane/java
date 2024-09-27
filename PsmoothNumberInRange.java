import java.util.Scanner;

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

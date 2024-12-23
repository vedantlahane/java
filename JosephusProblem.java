import java.util.Scanner;
public class JosephusProblem {
    public static int josephus(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            return (josephus(n - 1, k) + k - 1) % n + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people in the circle: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of people to be skipped: ");
        int k = sc.nextInt();
        System.out.println("The chosen place is " + josephus(n, k));
        sc.close();
    }
}

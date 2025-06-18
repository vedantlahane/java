import java.util.*;

public class Patterns {
    public static void pattern1(int n) {
        System.out.println("Pattern  1");
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.err.println();
        }

    }

    public static void pattern2(int n) {
        System.out.println("Pattern 2");
        for (int i = 0; i < n; i++) {
            int temp = n;
            int num = i + 1;
            for (int j = i; j < n; j++) {
                System.out.print(num + " ");
                num = temp + num;

                temp--;
            }
            System.err.println();
        }
    }

    public static void pattern3(int n) {
        System.out.println("Pattern 3");
        int start = 1;
        for (int i = 1; i <= n; i++) {
            int num = start;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num--;
            }
            start += i + 1;
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        System.out.println("Pattern 4");
        int num = n - 1;
        int num1 = 1;
        for (int i = 0; i < n; i++) {
            int temp = num;
            while (temp != 0) {
                System.out.print(" ");
                temp--;
            }
            for (int j = i + 1; j > 0; j--) {
                System.out.print(num1 + " ");
                num1++;
            }
            System.out.println();
            num--;
        }
    }

    public static void pattern5(int n) {
        System.out.println("Pattern 5");
        int[][] matrix = new int[n][n];

        int num = 1;
        for (int j = 0; j < n; j++) {
            int row = n - (n - j);
            int col = 0;
            while (row < n && col < n) {
                matrix[row][col] = num++;
                row++;
                col++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        System.out.println("Pattern 6");
        int[][] matrix = new int[n][n];

        int num = 1;
        for (int j = 0; j < n; j++) {

            if (j % 2 == 0) {
                int row = n - (n - j);
                int col = 0;
                while (row < n && col < n) {
                    matrix[row][col] = num++;
                    row++;
                    col++;
                }
            } else {
                int row = n-1;
                int col = n - j - 1;
                while (row >= j && col >= 0) {
                    matrix[row][col] = num++;
                    row--;
                    col--;
                } 
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
        System.out.println();
        pattern6(n);
        sc.close();
    }
}

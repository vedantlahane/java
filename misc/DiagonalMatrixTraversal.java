import java.util.Scanner;

public class DiagonalMatrixTraversal {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the matrix: ");
            System.out.println("Enter the number of rows: ");
            int m = sc.nextInt();
            System.out.println("Enter the number of columns: ");
            int n = sc.nextInt();
            int arr[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Enter the element at position (" + i + "," + j + "): ");
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println("Diagonal Traversal:");
            for (int col = 0; col < n; col++) {
                int startCol = col;
                int startRow = 0;
                while (startCol >= 0 && startRow < m) {
                    System.out.print(arr[startRow][startCol] + " ");
                    startCol--;
                    startRow++;
                }
            }
            for (int row = 1; row < m; row++) {
                int startRow = row;
                int startCol = n - 1;
                while (startRow < m && startCol >= 0) {
                    System.out.print(arr[startRow][startCol] + " ");
                    startRow++;
                    startCol--;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
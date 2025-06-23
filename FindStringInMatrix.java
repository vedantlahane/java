// for ex:- given matrix
// n l a N
// x e i O
// P z r P
// U T S Q
// words to find "air" and "pea"

import java.util.*;

public class FindStringInMatrix {

    public static boolean findWordInMatrix(char[][] matrix, String word) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (checkDirection(matrix, word, i, j, 0, 1) || // Right
                        checkDirection(matrix, word, i, j, 1, 0) || // Down
                        checkDirection(matrix, word, i, j, 0, -1) || // Left
                        checkDirection(matrix, word, i, j, -1, 0) || // Up
                        checkDirection(matrix, word, i, j, 1, 1) || // Down-Right
                        checkDirection(matrix, word, i, j, -1, -1) || // Up-Left
                        checkDirection(matrix, word, i, j, -1, 1) || // Up-Right
                        checkDirection(matrix, word, i, j, 1, -1)) { // Down-Left
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkDirection(char[][] matrix, String word, int startRow, int startCol, int rowDir,
            int colDir) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int wordLength = word.length();

        for (int k = 0; k < wordLength; k++) {
            int newRow = startRow + k * rowDir;
            int newCol = startCol + k * colDir;

            // Check if the new position is out of bounds
            if (newRow < 0 || newRow >= rows || newCol < 0 || newCol >= cols)
                return false;

            // Check if the character matches
            if (matrix[newRow][newCol] != word.charAt(k))
                return false;

        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix: ");
        int cols = sc.nextInt();
        char[][] matrix = new char[rows][cols];
        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println("Enter the words to find (space-separated): ");
        sc.nextLine();
        String[] words = sc.nextLine().split(" ");
        for (String word : words) {
            if (findWordInMatrix(matrix, word)) {
                System.out.println("Word '" + word + "' found in the matrix.");
            } else {
                System.out.println("Word '" + word + "' not found in the matrix.");
            }
        }

        sc.close();
    }
}

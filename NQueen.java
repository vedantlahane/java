import java.util.Scanner;
// import java.util.InputMismatchException;

public class NQueen {
    public static boolean isSafe(int board[][], int row, int col, int n) {
        int i, j;
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (i = row, j = col; j >= 0 && i < n; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
    public static boolean solveNQueen(int board[][], int col, int n) {
        if (col >= n) {
            return true;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(board, i, col, n)) {
                board[i][col] = 1;
                if (solveNQueen(board, col + 1, n) == true) {
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }
    public  static void printBoard(int board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main ( String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of queens: ");
        int n = sc.nextInt();
        int board[][] = new int[n][n];
        if (solveNQueen(board, 0, n) == false) {
            System.out.println("Solution does not exist");
        } else {
            printBoard(board);
        }
        sc.close();

    }
}

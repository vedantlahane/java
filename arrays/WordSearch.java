import java.util.Scanner;

public class WordSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordSearch ws = new WordSearch();

        System.out.println("Choose an option:");
        System.out.println("1. Enter a custom board and word");
        System.out.println("2. Use predefined test case");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        char[][] board;
        String word;

        if (choice == 1) {
            System.out.println("Enter the board dimensions (rows and columns):");
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            board = new char[rows][cols];
            System.out.println("Enter the board row by row:");

            for (int i = 0; i < rows; i++) {
                String row = scanner.nextLine();
                for (int j = 0; j < cols; j++) {
                    board[i][j] = row.charAt(j);
                }
            }

            System.out.println("Enter the word to search:");
            word = scanner.nextLine();

        } else {
            // Predefined test case
            board = new char[][] {
                    { 'A', 'B', 'C', 'E' },
                    { 'S', 'F', 'C', 'S' },
                    { 'A', 'D', 'E', 'E' }
            };
            word = "ABCCED";
        }

        boolean result = ws.exist(board, word);
        System.out.println("Word " + (result ? "exists" : "does not exist") + " in the board.");
        scanner.close();
    }

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == word.charAt(0) && search(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' ';
        boolean found = search(board, word, i + 1, j, index + 1) ||
                search(board, word, i - 1, j, index + 1) ||
                search(board, word, i, j + 1, index + 1) ||
                search(board, word, i, j - 1, index + 1);
        board[i][j] = temp;

        return found;

    }

}

import java.util.Scanner;
import java.util.Random;

public class TicTacToe{
    static final int COMPUTER = 1; // Constant to represent computer's turn
    static final int HUMAN = 2; // Constant to represent human's turn
    static final int SIDE = 3; // Size of the Tic-Tac-Toe board (3x3)
    static final char COMPUTERMOVE = 'O'; // Character for computer's move
    static final char HUMANMOVE = 'X'; // Character for human's move
    static Random random = new Random(); // Random object to generate random moves for easy mode

    // Function to show the current state of the board
    static void showBoard(char[][] board) {
        // Display the board in a structured format
        System.out.println("\n\t\t " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("\t\t-----------");
        System.out.println("\t\t " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("\t\t-----------");
        System.out.println("\t\t " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + "\n");
    }

    // Function to display instructions on how to play
    static void showInstructions() {
        System.out.println("\nChoose a cell numbered from 1 to 9 as below and play\n");
        System.out.println("\t\t 1 | 2 | 3 ");
        System.out.println("\t\t-----------");
        System.out.println("\t\t 4 | 5 | 6 ");
        System.out.println("\t\t-----------");
        System.out.println("\t\t 7 | 8 | 9 \n");
    }

    // Function to initialize the board with '*' (empty spaces)
    static void initialize(char[][] board) {
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                board[i][j] = '*'; // Initialize all cells as empty
            }
        }
    }

    // Function to declare the winner based on whose turn it was
    static void declareWinner(int whoseTurn, boolean isTwoPlayer) {
        if (isTwoPlayer) { // For two-player mode
            if (whoseTurn == COMPUTER) {
                System.out.println("Player 2 has won!"); // Player 2 (Computer) wins
            } else {
                System.out.println("Player 1 has won!"); // Player 1 wins
            }
        } else { // For single-player mode
            if (whoseTurn == COMPUTER) {
                System.out.println("COMPUTER has won!");
            } else {
                System.out.println("HUMAN has won!");
            }
        }
    }

    // Function to check if any row is crossed (three same symbols in a row)
    static boolean rowCrossed(char[][] board) {
        for (int i = 0; i < SIDE; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '*') {
                return true; // Return true if any row is crossed
            }
        }
        return false;
    }

    // Function to check if any column is crossed (three same symbols in a column)
    static boolean columnCrossed(char[][] board) {
        for (int i = 0; i < SIDE; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '*') {
                return true; // Return true if any column is crossed
            }
        }
        return false;
    }

    // Function to check if any diagonal is crossed (three same symbols in a diagonal)
    static boolean diagonalCrossed(char[][] board) {
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '*') {
            return true; // Left-to-right diagonal
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '*') {
            return true; // Right-to-left diagonal
        }
        return false;
    }

    // Function to check if the game is over (any row, column, or diagonal is crossed)
    static boolean gameOver(char[][] board) {
        return rowCrossed(board) || columnCrossed(board) || diagonalCrossed(board);
    }

    // Function for computer's move in easy mode (random)
    static int easyComputerMove(char[][] board) {
        int[] availablePositions = new int[9]; // Array to store available positions
        int count = 0;
        
        // Loop through the board to find available positions
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                if (board[i][j] == '*') { // If position is empty, add to availablePositions
                    availablePositions[count++] = i * 3 + j; // Store the position in the array
                }
            }
        }
        
        // If no positions are available, return -1
        if (count == 0) return -1;
        
        // Choose a random available position
        int randomIndex = random.nextInt(count); // Generate a random index
        return availablePositions[randomIndex]; // Return the randomly chosen position
    }

    // Minimax function for computer's move in hard mode (unbeatable AI)
    static int minimax(char[][] board, int depth, boolean isAI) {
        int score = 0;
        int bestScore = 0;
        
        // Check if the game is over
        if (gameOver(board)) {
            if (isAI) return -10; // AI loses, return -10
            return 10; // AI wins, return 10
        } else {
            if (depth < 9) {
                if (isAI) { // Maximizing for AI
                    bestScore = -999;
                    for (int i = 0; i < SIDE; i++) {
                        for (int j = 0; j < SIDE; j++) {
                            if (board[i][j] == '*') { // If position is available
                                board[i][j] = COMPUTERMOVE; // AI makes a move
                                score = minimax(board, depth + 1, false); // Recurse for human
                                board[i][j] = '*'; // Undo move
                                if (score > bestScore) { // Maximize score
                                    bestScore = score;
                                }
                            }
                        }
                    }
                    return bestScore;
                } else { // Minimizing for human
                    bestScore = 999;
                    for (int i = 0; i < SIDE; i++) {
                        for (int j = 0; j < SIDE; j++) {
                            if (board[i][j] == '*') { // If position is available
                                board[i][j] = HUMANMOVE; // Human makes a move
                                score = minimax(board, depth + 1, true); // Recurse for AI
                                board[i][j] = '*'; // Undo move
                                if (score < bestScore) { // Minimize score
                                    bestScore = score;
                                }
                            }
                        }
                    }
                    return bestScore;
                }
            } else {
                return 0; // Draw
            }
        }
    }

    // Function to get the best move for the computer (hard mode)
    static int bestMove(char[][] board, int moveIndex) {
        int x = -1, y = -1;
        int score = 0, bestScore = -999;
        
        // Iterate over all cells to find the best move
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                if (board[i][j] == '*') { // If position is available
                    board[i][j] = COMPUTERMOVE; // AI makes a move
                    score = minimax(board, moveIndex + 1, false); // Evaluate the move
                    board[i][j] = '*'; // Undo the move
                    if (score > bestScore) { // If this move is better, update bestScore
                        bestScore = score;
                        x = i;
                        y = j;
                    }
                }
            }
        }
        return x * 3 + y; // Return the best position
    }

    // Function to start and play the Tic-Tac-Toe game
    static void playTicTacToe(int gameMode) {
        char[][] board = new char[SIDE][SIDE]; // 3x3 board
        int moveIndex = 0, x = 0, y = 0;
        
        initialize(board); // Initialize the board
        showInstructions(); // Show game instructions

        int whoseTurn = HUMAN; // Start with human's turn
        boolean isTwoPlayer = (gameMode == 2); // Check if it's two-player mode
        
        // Game loop continues until the game is over or the board is full
        while (!gameOver(board) && moveIndex != SIDE * SIDE) {
            if (whoseTurn == COMPUTER) {
                int n;
                if (gameMode == 0) { // Easy mode
                    n = easyComputerMove(board);
                } else if (gameMode == 1) { // Hard mode
                    n = bestMove(board, moveIndex);
                } else { // Two-player mode
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("\nPlayer 2's turn. Enter position (1-9): ");
                    n = scanner.nextInt() - 1; // Get player 2's input
                }
                
                x = n / SIDE; // Calculate row from position
                y = n % SIDE; // Calculate column from position
                
                if (board[x][y] == '*') { // If position is available
                    board[x][y] = COMPUTERMOVE; // Mark the move on the board
                    System.out.println("\n" + (isTwoPlayer ? "Player 2" : "COMPUTER") + 
                                     " has put " + COMPUTERMOVE + " in cell " + (n + 1));
                    showBoard(board); // Display the board
                    moveIndex++; // Increment move count
                    whoseTurn = HUMAN; // Switch to human's turn
                }
                
            } else if (whoseTurn == HUMAN) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("\n" + (isTwoPlayer ? "Player 1" : "HUMAN") + 
                               "'s turn. Enter position (1-9): ");
                int n = scanner.nextInt() - 1; // Get player 1's (or human's) input
                x = n / SIDE; // Calculate row
                y = n % SIDE; // Calculate column
                
                if (n >= 0 && n < 9 && board[x][y] == '*') { // If valid move
                    board[x][y] = HUMANMOVE; // Mark the move
                    System.out.println("\n" + (isTwoPlayer ? "Player 1" : "HUMAN") + 
                                     " has put " + HUMANMOVE + " in cell " + (n + 1));
                    showBoard(board); // Display the updated board
                    moveIndex++; // Increment move count
                    whoseTurn = COMPUTER; // Switch to computer's turn
                } else {
                    System.out.println("\nInvalid move! Try again."); // Invalid move
                }
                scanner.close();
            }
        }

        // Check if the game ended in a draw
        if (!gameOver(board) && moveIndex == SIDE * SIDE) {
            System.out.println("It's a draw!");
        } else {
            // Declare the winner based on whose turn it is
            if (whoseTurn == COMPUTER) whoseTurn = HUMAN;
            else if (whoseTurn == HUMAN) whoseTurn = COMPUTER;
            declareWinner(whoseTurn, isTwoPlayer);
        }
    }

    // Main function to start the game
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\t\t\t Tic-Tac-Toe");
        System.out.println("-------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        char cont = 'y'; // Variable to continue playing
        
        do {
            // Display game mode options
            System.out.println("\nGame Modes:");
            System.out.println("0. Easy Mode (Beatable Computer)");
            System.out.println("1. Hard Mode (Unbeatable Computer)");
            System.out.println("2. Two Player Mode");
            System.out.print("\nSelect game mode (0-2): ");
            
            int gameMode = scanner.nextInt(); // Get game mode from user
            while (gameMode < 0 || gameMode > 2) { // Validate input
                System.out.println("Invalid mode! Please select 0, 1, or 2.");
                System.out.print("Select game mode (0-2): ");
                gameMode = scanner.nextInt();
            }

            playTicTacToe(gameMode); // Start the game based on selected mode

            System.out.print("\nDo you want to quit (y/n): "); // Ask to continue or quit
            cont = scanner.next().charAt(0);
        } while (cont == 'n'); // Continue playing until user decides to quit
        
        System.out.println("\nThanks for playing! Goodbye!"); // Goodbye message
    }
}

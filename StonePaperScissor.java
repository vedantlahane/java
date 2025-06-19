import java.util.*;
public class StonePaperScissor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets play !!!");
        System.out.println("Welcome to the Stone, Paper, Scissor game!");
        System.out.println("In this game, you will play against the computer.");
        System.out.println("----------------------------------------------");
        System.out.println("Enter the number of rounds you want to play: ");
        int rounds = sc.nextInt();
        sc.nextLine();
        int score = 0;
        int comScore = 0;
        for(int i = 0; i < rounds; i++){
            System.out.println("Round " + (i + 1) + ": Enter your choice (stone  1, paper  2, scissor  3) and 4 to Quit: ");
            int choice = sc.nextInt();
            int comChoice = (int)(Math.random() * 3) + 1;
            System.out.println("Computer chose: " + comChoice);

            if(choice == comChoice)System.out.println("It's a tie!");
            else if((choice == 1 && comChoice == 2) ||
                      (choice == 2 && comChoice == 3) ||
                      (choice == 3 && comChoice == 1)){
                System.out.println("You lose this round!");
                comScore++;
            } 
            else if(choice == 4){
                System.out.println("You chose to quit the game.");
                break;
            }
            else if((choice == 1 && comChoice == 3) ||
                      (choice == 2 && comChoice == 1) ||
                      (choice == 3 && comChoice == 2)){
                System.out.println("You win this round!");
                score++;
            } else {
                System.out.println("Invalid choice! Please enter 1 for stone, 2 for paper, 3 for scissor, or 4 to quit.");
                i--;
            }
            System.out.println("Current Score: You - " + score + ", Computer - " + comScore);
            System.out.println();

        }
        if(score > comScore) System.out.println("Congratulations! You won the game with " + score + " points.");
        else if(comScore > score) System.out.println("Computer won the game with " + comScore + " points.");
        else System.out.println("The game is a tie with both scoring " + score + " points.");
        sc.close();
    }
}

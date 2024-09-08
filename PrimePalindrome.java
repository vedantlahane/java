import java.util.Scanner;

public class PrimePalindrome {
    boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(twist); i++) {
            if (twist % i == 0) {
                isPrime = false;
                break;
            }
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        do{
            

        

        if (isPrime) {
            System.out.println("The number is a prime palindrome.");
        } else {
            System.out.println("The number is not a prime palindrome.");
        }
        }while(!isPrime);
    }
}
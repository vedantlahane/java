import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("Enter a string to check if it is a palindrome:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversedStr = new StringBuilder(str).reverse().toString();
        if(str.equals(reversedStr)) System.out.println("The string  + str +  is a palindrome.");
        else System.out.println("The string  + str +  is not a palindrome.");

        System.out.println();
        System.out.println("Enter the number to check if it is palindrome:");
        int num = sc.nextInt();
        int temp = num;
        int reversedNum = 0;
        while(temp != 0) {
            int digit = temp % 10;
            reversedNum = reversedNum * 10 + digit;
            temp /= 10;
        }
        if(num == reversedNum) System.out.println("The number " + num + " is a palindrome.");
        else System.out.println("The number " + num + " is not a palindrome.");
        sc.close();
    }

}

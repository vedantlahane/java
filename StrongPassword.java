import java.util.Scanner;
public class StrongPassword {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password to check if it is strong:");
        String password = sc.nextLine();
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        String specialChars = "!@#$%^&*()-_=+[]{}|;:',.<>?";
        if(password.length() < 8) System.out.println("Password is not strong. It must be at least 8 characters long.");
        else{
            for(int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if(Character.isUpperCase(ch)) hasUpperCase = true;
                else if(Character.isLowerCase(ch)) hasLowerCase = true;
                else if(Character.isDigit(ch)) hasDigit = true;
                else if(specialChars.indexOf(ch) != -1) hasSpecialChar = true;
            }
            if(hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar) System.out.println("Password is strong.");
            else System.out.println("Password is not strong. It must contain at least one uppercase letter, one lowercase letter, one digit, and one special character.");
            
        }
        sc.close();
    }
}

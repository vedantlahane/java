import java.util.*;
public class EncryptDecrypt {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Enter E to encrypt or D to decrypt:");
        char choice = sc.nextLine().charAt(0);
        if(choice != 'E' || choice != 'D') {
            System.out.println("Enter valid letter");
            sc.close();
            return;
        }
        String res =  "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    if(choice == 'E') ch = (char)('a' + (ch - 'a' + 3) % 26);// a == 97, j == 106, 106 - 97 + 3 == 12, 12 % 26 == 6, 97 + 12 = 109, 109 = 'm'
                    else ch = (char)('a' + (ch - 'a' - 3 + 26) % 26);
                } else {
                    if(choice=='E') ch = (char)('A' + (ch - 'A' + 3) % 26);
                    else ch = (char)('A' + (ch - 'A' - 3 + 26) % 26);
                }
            }
            res += ch;
        }
        if(choice == 'E') System.out.println("Encryption is: " + res);
        else System.out.println("Decryption is: "+ res);
        sc.close();
    }
    
}

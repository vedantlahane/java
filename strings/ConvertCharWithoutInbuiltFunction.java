import java.util.Scanner;
public class ConvertCharWithoutInbuiltFunction {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to convert characters to uppercase:");
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z') ch = (char)(ch - 'a' + 'A');
            result.append(ch);
        }
        System.out.println("Converted string: " + result.toString());
        System.out.println("Enter a string to convert characters to lowercase:");
        String str2 = sc.nextLine();
        StringBuilder result2 = new StringBuilder();
        for(int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if(ch >= 'A' && ch <= 'Z') ch = (char)(ch - 'A' + 'a');
            result2.append(ch);
        }       
        System.out.println("Converted string: " + result2.toString());
        sc.close();
    }
}

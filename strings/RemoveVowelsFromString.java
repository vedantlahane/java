import java.util.Scanner;
public class RemoveVowelsFromString {
    public static  void main( String args[] ){
        Scanner sc= new Scanner( System.in);
        System.out.println("Enter the string: ");
        String str= sc.nextLine();
        System.out.println("String without vowels: ");
        System.out.println(str.replaceAll("[aeiouAEIOU]", ""));
        sc.close();
    }
}

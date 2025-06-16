import java.util.Scanner;
import java.util.*;
public class VowelsInString {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string to count vowels:");
        String str = sc.nextLine();
        Map<Character, Integer> vowelCount = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //indexOf method is used to check if the character is a vowel or not
            //for char A, it checks is char is present in the string "aeiouAEIUO"   
            if("aeiouAEIOU".indexOf(ch) != -1) vowelCount.put(ch, vowelCount.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Vowel counts:");
        System.out.println(vowelCount);
        sc.close();
    }
}

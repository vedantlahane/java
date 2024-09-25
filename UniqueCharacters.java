// Count the Number of Unique Characters
// Problem Statement: Given a string, count the number of unique alphabetic characters (case-insensitive) in the string. Ignore digits, spaces, and punctuation.

// Input:

// A string input.
// Output:

// An integer representing the number of unique alphabetic characters.
// Example:

// Input: "Hello, World!"
// Output: 10

// Input: "The quick brown fox jumps over the lazy dog"
// Output: 26

import java.util.Scanner;
public class UniqueCharacters {
    public static void main( String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(" Number of unique characters: " + countUniqueCharacters(str));

    }
    public static int countUniqueCharacters(String str){
        boolean[] letters = new boolean[26];
        str = str.toLowerCase();
        for( int i = 0 ; i < str.length(); i++ ){
            char c = str.charAt(i);
            if (Character.isLetter(c)){
                int index = c - 'a';
                letters[index] = true;
            }
        }
        int count = 0;
        for (int i = 0; i < letters.length; i++){
            if (letters[i]){
                count++;
            }
        }
        return count;
    }
}


